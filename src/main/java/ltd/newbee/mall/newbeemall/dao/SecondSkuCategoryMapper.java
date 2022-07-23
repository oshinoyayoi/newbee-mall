package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.vo.SubECGoodsCategoryVo;

public interface SecondSkuCategoryMapper {
	List<SubECGoodsCategoryVo> findSubCategory(Integer categoryId);
}
