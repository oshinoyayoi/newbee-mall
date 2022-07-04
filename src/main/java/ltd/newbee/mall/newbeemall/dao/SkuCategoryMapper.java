package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public interface SkuCategoryMapper {
	List<TbNewbeeMallGoodsInfo> findGoodsInfoByGoodsCategoryId(Long categoryId, Integer pageNum, String orderBy,
			String ascOrDesc);
}
