package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.CategoryMapper;
import ltd.newbee.mall.newbeemall.dao.ECGoodsDetailMapper;
import ltd.newbee.mall.newbeemall.entity.Category;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.service.CategoryService;
import ltd.newbee.mall.newbeemall.service.ECGoodsDetailService;
import ltd.newbee.mall.newbeemall.vo.CategoryVo;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Resource
	CategoryMapper categoryMapper;
	
	
	@Override
	public List<CategoryVo> getCategoryForIndex() {
		List<GoodsCategory> list = categoryMapper.selectGoodsDetail();
		List<CategoryVo> subList=new ArrayList<>();
		//mysql里面所有的列的遍历 
		for (GoodsCategory category : list) {
			if (category.getParentId()==0) {
				CategoryVo subList2= new CategoryVo();
				BeanUtils.copyProperties(category, subList2);
				subList2.setSubList(getSubList(list, subList2));
				subList.add(subList2);
			}
		}
		return subList;
	}
	public List<CategoryVo> getSubList(List<GoodsCategory> list,CategoryVo categoryVo){
		List<CategoryVo> subList=new ArrayList<>();
		for (GoodsCategory category : list) {
			if (categoryVo.getCategoryId().equals(category.getParentId())) {
				CategoryVo subList2= new CategoryVo();
				BeanUtils.copyProperties(category, subList2);
				subList2.setSubList(getSubList(list, subList2));
				subList.add(subList2);
			}
		
	}
		return subList;

}
}
