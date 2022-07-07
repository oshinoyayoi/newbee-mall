package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.SkuCategoryVo;

public interface SkuCategoryMapper {
	List<SkuCategoryVo> findGoodsInfoByGoodsCategoryId(Long categoryId,String colOne,String colTwo,Integer pageNum, String orderBy,
			String ascOrDesc);
}
