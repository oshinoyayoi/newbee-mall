package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

import javax.annotation.Resource;

import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.PageUnil;
import ltd.newbee.mall.newbeemall.dao.CountSkuCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.CountSubCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.ECGoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.SecondSkuCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.SkuCategoryMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.service.SkuCategoryService;
import ltd.newbee.mall.newbeemall.vo.SecondCategoryVo;
import ltd.newbee.mall.newbeemall.vo.SkuCategoryVo;
import ltd.newbee.mall.newbeemall.vo.SubCategoryVo;
import ltd.newbee.mall.newbeemall.vo.SubECGoodsCategoryVo;

@Service
public class CountSkuCategoryServiceImpl implements SkuCategoryService {
	@Resource
	SkuCategoryMapper skuCategoryMapper;

	@Resource
	CountSkuCategoryMapper countSkuCategoryMapper;

	@Resource
	ECGoodsCategoryMapper ecGoodsCategoryMapper;

	@Resource
	SecondSkuCategoryMapper secondSkuCategoryMapper;

	@Resource
	CountSubCategoryMapper countSubCategoryMapper;

	@Override
	public SecondCategoryVo getSkuCategory(HashMap<String, Object> map2) {
		Integer categoryId = (Integer) map2.get("categoryId");
		map2.remove("categoryId");
		int pageNum = (int) map2.get("pageNum");
		map2.remove("pageNum");
		String orderBy = (String) map2.get("orderBy");
		map2.remove("orderBy");
		String ascOrDesc = (String) map2.get("ascOrDesc");
		map2.remove("ascOrDesc");
		List<String> cols = new ArrayList<>();
		cols = (List<String>) map2.get(cols);

		List<SkuCategoryVo> voList = new ArrayList<>();
		List<Integer> parentIds = new ArrayList<>();
		List<GoodsCategory> subList = ecGoodsCategoryMapper.selectGoodsCategory();
		List<SubECGoodsCategoryVo> countAndParentId = new ArrayList<>();

		// HashSet<String> colNames=new HashSet<>();
		SecondCategoryVo secondVo = new SecondCategoryVo();

		for (GoodsCategory goodsCategory : subList) {
			parentIds.add(goodsCategory.getParentId());
		}

		if (parentIds.contains(categoryId)) {
			// 名字+商品件数
			countAndParentId = secondSkuCategoryMapper.findSubCategory(categoryId);

			voList = skuCategoryMapper.findGoodsInfoByGoodsCategoryId(categoryId, pageNum, orderBy, ascOrDesc);

			int x = 0;

			for (int i = 0; i < countAndParentId.size(); i++) {
				x += countAndParentId.get(i).getSubNumsOfGoods();
			}

			/*
			 * for (int i = 0; i < voList.size(); i++) { if
			 * (countAndParentId.contains(voList.get(i).getCategoryId())) {
			 * countAndParentId.add(voList.get(i).getCategoryId()); } }
			 */

			// 打包
			secondVo.setCountAndParentId(countAndParentId);
			secondVo.setCountCategoryNumsInteger(x);
			// secondVo.setVoList(voList);

		} else {

			List<SkuCategoryVo> entityList = skuCategoryMapper.findGoodsInfoByGoodsCategoryId(categoryId, pageNum,
					orderBy, ascOrDesc);

			// secondVo.setVoList(entityList);
			secondVo.setCountCategoryNumsInteger(entityList.size());

		}
		List<SkuCategoryVo> thirdLevelList = new ArrayList<>();
		if (parentIds.contains(categoryId)) {
			for (int i = 0; i < voList.size(); i++) {
				if (categoryId == voList.get(i).getparentId()) {
					thirdLevelList.add(voList.get(i));
				}
			}
		}
		voList.addAll(thirdLevelList);
		secondVo.setColNameAndCountCol(getColNameAndCountCol(categoryId, pageNum, orderBy, ascOrDesc));
		secondVo.setVoList(removeRepetition(categoryId, pageNum, orderBy, ascOrDesc));
		// secondVo.setThirdLevelList(thirdLevelList);
		return secondVo;

	}

	/*
	 * public List<SkuCategoryVo> getCountSubCategory(){ List<SkuCategoryVo>
	 * subCategory=new ArrayList<>(); List<SkuCategoryVo> voList = new
	 * ArrayList<>();
	 * 
	 * return null;
	 * 
	 * }
	 */
	public List<SubCategoryVo> getColNameAndCountCol(Integer categoryId, Integer pageNum, String orderBy,
			String ascOrDesc) {
		List<SkuCategoryVo> voList = new ArrayList<>();
		voList = skuCategoryMapper.findGoodsInfoByGoodsCategoryId(categoryId, pageNum, orderBy, ascOrDesc);
		// 将相同的colname抽出
		HashSet<String> colNames = new HashSet<>();
		List<SubCategoryVo> colNamesAndCols = new ArrayList<>();
		for (int i = 0; i < voList.size(); i++) {
			colNames.add(voList.get(i).getColName());
		}

		// 对col进行计数

		for (String string : colNames) { // 循环hashset里面的colname，找对应的col和个数
			SubCategoryVo subCategoryVo = new SubCategoryVo();

			subCategoryVo.setColNames(string); // 做一次循环把对应的colname放进去

			HashMap<String, Integer> cols = new HashMap<>(); // col和个数

			for (int i = 0; i < voList.size(); i++) { // 遍历商品list，找colname对应的col和个数

				// 如果商品list里的colname和现在colname不一致，就不进行条件判断
				if (cols.containsKey(voList.get(i).getCol()) && voList.get(i).getColName().equals(string)) {
					String col1 = voList.get(i).getCol();
					int count = cols.get(col1);
					count++; // 当hashmap里面有这个col的时候，就+1
					cols.put(col1, count); // hashmap数值需要取出来修改后再放进去

					// 当hashmap里面没有这个col的时候，就放一个col进去
				} else if (!cols.containsKey(voList.get(i).getCol()) && voList.get(i).getColName().equals(string)) {
					cols.put(voList.get(i).getCol(), 1);
				}
			}
			subCategoryVo.setCols(cols); // 把hashmap加到obj里面
			colNamesAndCols.add(subCategoryVo); // 需要返回所有数据，需要一个list来返回。（把当前数据加到list里面）
		}

		return colNamesAndCols; // for循环完成后返回所有数据

	}

	public List<SkuCategoryVo> removeRepetition(Integer categoryId, Integer pageNum, String orderBy, String ascOrDesc) {
		List<SkuCategoryVo> voList = new ArrayList<>();
		voList = skuCategoryMapper.findGoodsInfoByGoodsCategoryId(categoryId, pageNum, orderBy, ascOrDesc);
		// 去掉重复
		// Create a new ArrayList
		List<SkuCategoryVo> newList = new ArrayList<>();

		HashSet<Long> set = new HashSet<Long>();
		for (int i = 0; i < voList.size(); i++) {
			set.add(voList.get(i).getGoodsId());
		}
		for (int i = 0; i < set.size(); i++) {
			if (!newList.contains(voList.get(i).getGoodsId()) && set.contains(voList.get(i).getGoodsId())) {
				newList.add(voList.get(i));
			}
		}

		return newList;
	}
}

/*
 * // 根据筛选条件筛选商品，有筛选条件时才使用该方法，无筛选条件时直接计件 public List<SkuCategoryVo>
 * selectGoodsByCols(List<String> cols, List<SkuCategoryVo> resultList,
 * List<SkuCategoryVo> detailsList) { HashSet<String> colNames = new
 * HashSet<>(); List<List<Long>> goodsIdsList = new ArrayList<>(); List<Long>
 * selectedGoodsIds = new ArrayList<>(); for (String col : cols) { for
 * (SkuCategoryVo detail : detailsList) { if (col.equals(detail.getCol())) { //
 * 找出筛选条件中的colname colNames.add(detail.getColName()); break; } } }
 * 
 * for (String colName : colNames) { List<Long> goodsIds = new ArrayList<>();
 * for (String col : cols) { for (SkuCategoryVo detail : detailsList) { //
 * 当前colname下，col与该detail的col相等时，且goodsid不在列表中，取goodsid放入列表(取并集) if
 * (col.equals(detail.getCol()) && detail.getColName().equals(colName) &&
 * !goodsIds.contains(detail.getGoodsId())) { goodsIds.add(detail.getGoodsId());
 * } } } goodsIdsList.add(goodsIds); }
 * 
 * if (goodsIdsList.size() == 1) { for (Long goodsId : goodsIdsList.get(0)) {//
 * 放入该colname的id selectedGoodsIds.add(goodsId); } } else { //
 * 不同colname的id取交集，放入list for (int i = 0; i < goodsIdsList.size() - 1; i++) {
 * for (Long goodsId : goodsIdsList.get(i)) { if (goodsIdsList.get(i +
 * 1).contains(goodsId)) { selectedGoodsIds.add(goodsId); } } } }
 * 
 * for (int i = 0; i < resultList.size(); i++) { if
 * (!selectedGoodsIds.contains(resultList.get(i).getGoodsId())) {
 * resultList.remove(i); i--; } }
 * 
 * return resultList; }
 */

/*
 * HashSet<SkuCategoryVo> set = new HashSet<SkuCategoryVo>(); for (int i = 0; i
 * < voList.size(); i++) { set.add(voList.get(i)); }
 * 
 * voList.clear(); voList.addAll(set);
 */
