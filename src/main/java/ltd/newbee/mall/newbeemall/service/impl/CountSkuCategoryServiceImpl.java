package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

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
	public SecondCategoryVo getSkuCategory(Long categoryId, Integer pageNum, String orderBy, String ascOrDesc) {
		List<SkuCategoryVo> voList = new ArrayList<>();
		List<Long> parentIds = new ArrayList<>();
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

			// 打包
			secondVo.setCountAndParentId(countAndParentId);
			secondVo.setCountCategoryNumsInteger(x);
			secondVo.setVoList(voList);

		} else {

			List<SkuCategoryVo> entityList = skuCategoryMapper.findGoodsInfoByGoodsCategoryId(categoryId, pageNum,
					orderBy, ascOrDesc);

			secondVo.setVoList(entityList);
			secondVo.setCountCategoryNumsInteger(entityList.size());

		}
		secondVo.setColNameAndCountCol(getColNameAndCountCol(categoryId, pageNum, orderBy, ascOrDesc));
		return secondVo;

	}

	public List<SubCategoryVo> getColNameAndCountCol(Long categoryId, Integer pageNum, String orderBy,
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

		for (String string : colNames) {            //循环hashset里面的colname，找对应的col和个数
			SubCategoryVo subCategoryVo = new SubCategoryVo();
			subCategoryVo.setColNames(string);      // 做一次循环把对应的colname放进去
			HashMap<String, Integer> cols = new HashMap<>();   //col和个数
			for (int i = 0; i < voList.size(); i++) {  //遍历商品list，找colname对应的col和个数
				//如果商品list里的colname和现在colname不一致，就不进行条件判断
					if (cols.containsKey(voList.get(i).getCol())&&voList.get(i).getColName().equals(string)) {
						String col1 = voList.get(i).getCol();
						int count = cols.get(col1);
						count++;   //当hashmap里面有这个col的时候，就+1
						cols.put(col1, count);  //hashmap数值需要取出来修改后再放进去
						
						//当hashmap里面没有这个col的时候，就放一个col进去
					} else if(!cols.containsKey(voList.get(i).getCol())&&voList.get(i).getColName().equals(string)){
						cols.put(voList.get(i).getCol(), 1);
					}
				}
				subCategoryVo.setCols(cols);   //把hashmap加到obj里面
				colNamesAndCols.add(subCategoryVo);   //需要返回所有数据，需要一个list来返回。（把当前数据加到list里面）
			}
		
		return colNamesAndCols;   //for循环完成后返回所有数据

	}
}

/*
 * public List<NewBeeMallIndexCategoryVO> getCategoriesForIndex() { // level1
 * parentId=0,long类型写成0l,且第一个参数parentId是List List<Long> parentId = new
 * ArrayList<Long>(); parentId.add(0l);
 * 
 * List<GoodsCategory> level1 = new ArrayList<>(); level1 =
 * secondSkuCategoryMapper.findSecondLevelOfCategoryId(parentId, 1, 20);
 * 
 * List<Long> categoryList1 = new ArrayList<Long>();
 * 
 * for (TbNewbeeMallGoodsInfo info : level1) {
 * categoryList1.add(info.getCategoryId()); }
 * 
 * // level2 parentId = level1 categoryId List<TbNewbeeMallGoodsInfo> level2 =
 * new ArrayList<>(); level2 =
 * secondSkuCategoryMapper.findSecondLevelOfCategoryId(categoryList1, 2, 100);
 * List<Long> categoryList2 = new ArrayList<Long>(); for (TbNewbeeMallGoodsInfo
 * info2 : level2) { categoryList2.add(info2.getCategoryId()); }
 * 
 * // level3 parentId = level2 categoryId List<TbNewbeeMallGoodsInfo> level3 =
 * new ArrayList<>(); level3 =
 * secondSkuCategoryMapper.findSecondLevelOfCategoryId(categoryList2, 3, 100);
 * 
 * // level1 entity => vo List<NewBeeMallIndexCategoryVO> voList1 = new
 * ArrayList<>(); for (GoodsCategory gc1 : level1) { NewBeeMallIndexCategoryVO
 * vo1 = new NewBeeMallIndexCategoryVO();
 * vo1.setCategoryId(gc1.getCategoryId());
 * vo1.setCategoryLevel(gc1.getCategoryLevel());
 * vo1.setCategoryName(gc1.getCategoryName());
 * 
 * List<SecondLevelCategoryVO> voList2 = new ArrayList<>(); for (GoodsCategory
 * gc2 : level2) { SecondLevelCategoryVO vo2 = new SecondLevelCategoryVO(); if
 * (gc2.getParentId() == gc1.getCategoryId()) {
 * vo2.setCategoryId(gc2.getCategoryId());
 * vo2.setCategoryLevel(gc2.getCategoryLevel());
 * vo2.setCategoryName(gc2.getCategoryName());
 * vo2.setParentId(gc2.getParentId());
 * 
 * List<ThirdLevelCategoryVO> voList3 = new ArrayList<>(); for (GoodsCategory
 * gc3 : level3) { ThirdLevelCategoryVO vo3 = new ThirdLevelCategoryVO(); if
 * (gc3.getParentId() == gc2.getCategoryId()) {
 * vo3.setCategoryId(gc3.getCategoryId());
 * vo3.setCategoryLevel(gc3.getCategoryLevel());
 * vo3.setCategoryName(gc3.getCategoryName()); voList3.add(vo3);
 * vo2.setThirdLevelCategoryVOS(voList3); } } voList2.add(vo2); } }
 * vo1.setSecondLevelCategoryVOS(voList2); voList1.add(vo1); }
 * 
 * return voList1;
 * 
 * 
 * } /* public static String toUnderCase(String name) { final char UNDER_LINE =
 * '_'; if (name == null) { return null; }
 * 
 * int len = name.length(); StringBuilder res = new StringBuilder(len + 2); char
 * pre = 0; for (int i = 0; i < len; i++) { char ch = name.charAt(i); if
 * (Character.isUpperCase(ch)) { if (pre != UNDER_LINE) {
 * res.append(UNDER_LINE); } res.append(Character.toLowerCase(ch)); } else {
 * res.append(ch); } pre = ch; } return res.toString(); }
 */
