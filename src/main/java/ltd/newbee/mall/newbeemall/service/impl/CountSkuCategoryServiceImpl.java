package ltd.newbee.mall.newbeemall.service.impl;

import static org.assertj.core.api.Assertions.setDescriptionConsumer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jayway.jsonpath.internal.function.numeric.Sum;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mall.newbeemall.dao.CountSkuCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.ECGoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.SecondSkuCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.SkuCategoryMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.service.SkuCategoryService;
import ltd.newbee.mall.newbeemall.vo.SecondCategoryVo;
import ltd.newbee.mall.newbeemall.vo.SkuCategoryVo;
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
	
	
	@Override
	public SecondCategoryVo getSkuCategory(Long categoryId, Integer pageNum, String orderBy, String ascOrDesc) {
		List<SkuCategoryVo> voList = new ArrayList<>();
        List<Long> parentIds=new ArrayList<>();
        List<GoodsCategory> subList=ecGoodsCategoryMapper.selectGoodsCategory();
        List<SubECGoodsCategoryVo> countAndParentId=new ArrayList<>();
        SecondCategoryVo secondVo=new SecondCategoryVo();
        
        for (GoodsCategory goodsCategory : subList) {
			parentIds.add(goodsCategory.getParentId());
		}
        
        if (parentIds.contains(categoryId)) {
        	//名字+商品件数
        	countAndParentId=secondSkuCategoryMapper.findSubCategory(categoryId);
			
        	voList=skuCategoryMapper.findGoodsInfoByGoodsCategoryId(categoryId, pageNum, orderBy, ascOrDesc);
        	
        	int x=0;
        	
        	for (int i = 0; i < countAndParentId.size(); i++) {
				x += countAndParentId.get(i).getSubNumsOfGoods();
			}
        	
        	//打包
        	secondVo.setCountAndParentId(countAndParentId);
        	secondVo.setCountCategoryNumsInteger(x);
        	secondVo.setVoList(voList);
        	
		}else {
			
			List<SkuCategoryVo> entityList = skuCategoryMapper.findGoodsInfoByGoodsCategoryId(categoryId, pageNum,
					orderBy, ascOrDesc);
            
			secondVo.setVoList(entityList);
			secondVo.setCountCategoryNumsInteger(entityList.size());
			
			}
		
		
		return secondVo;
		
		
	}
}
	/*
	public List<NewBeeMallIndexCategoryVO> getCategoriesForIndex() {
		// level1 parentId=0,long类型写成0l,且第一个参数parentId是List
		List<Long> parentId = new ArrayList<Long>();
		parentId.add(0l);

		List<GoodsCategory> level1 = new ArrayList<>();
		level1 = secondSkuCategoryMapper.findSecondLevelOfCategoryId(parentId, 1, 20);
		
		List<Long> categoryList1 = new ArrayList<Long>();
		
		for (TbNewbeeMallGoodsInfo info : level1) {
			categoryList1.add(info.getCategoryId());
		}
		
		// level2 parentId = level1 categoryId
		List<TbNewbeeMallGoodsInfo> level2 = new ArrayList<>();
		level2 = secondSkuCategoryMapper.findSecondLevelOfCategoryId(categoryList1, 2, 100);
		List<Long> categoryList2 = new ArrayList<Long>();
		for (TbNewbeeMallGoodsInfo info2 : level2) {
			categoryList2.add(info2.getCategoryId());
		}
		
		// level3 parentId = level2 categoryId
		List<TbNewbeeMallGoodsInfo> level3 = new ArrayList<>();
		level3 = secondSkuCategoryMapper.findSecondLevelOfCategoryId(categoryList2, 3, 100);

		// level1 entity => vo
		List<NewBeeMallIndexCategoryVO> voList1 = new ArrayList<>();
		for (GoodsCategory gc1 : level1) {
			NewBeeMallIndexCategoryVO vo1 = new NewBeeMallIndexCategoryVO();
			vo1.setCategoryId(gc1.getCategoryId());
			vo1.setCategoryLevel(gc1.getCategoryLevel());
			vo1.setCategoryName(gc1.getCategoryName());

			List<SecondLevelCategoryVO> voList2 = new ArrayList<>();
			for (GoodsCategory gc2 : level2) {
				SecondLevelCategoryVO vo2 = new SecondLevelCategoryVO();
				if (gc2.getParentId() == gc1.getCategoryId()) {
					vo2.setCategoryId(gc2.getCategoryId());
					vo2.setCategoryLevel(gc2.getCategoryLevel());
					vo2.setCategoryName(gc2.getCategoryName());
					vo2.setParentId(gc2.getParentId());

					List<ThirdLevelCategoryVO> voList3 = new ArrayList<>();
					for (GoodsCategory gc3 : level3) {
						ThirdLevelCategoryVO vo3 = new ThirdLevelCategoryVO();
						if (gc3.getParentId() == gc2.getCategoryId()) {
							vo3.setCategoryId(gc3.getCategoryId());
							vo3.setCategoryLevel(gc3.getCategoryLevel());
							vo3.setCategoryName(gc3.getCategoryName());
							voList3.add(vo3);
							vo2.setThirdLevelCategoryVOS(voList3);
						}
					}
					voList2.add(vo2);
				}
			}
			vo1.setSecondLevelCategoryVOS(voList2);
			voList1.add(vo1);
		}

		return voList1;
	
	
}
	/*
	 * public static String toUnderCase(String name) { final char UNDER_LINE = '_';
	 * if (name == null) { return null; }
	 * 
	 * int len = name.length(); StringBuilder res = new StringBuilder(len + 2); char
	 * pre = 0; for (int i = 0; i < len; i++) { char ch = name.charAt(i); if
	 * (Character.isUpperCase(ch)) { if (pre != UNDER_LINE) {
	 * res.append(UNDER_LINE); } res.append(Character.toLowerCase(ch)); } else {
	 * res.append(ch); } pre = ch; } return res.toString(); }
	 */

