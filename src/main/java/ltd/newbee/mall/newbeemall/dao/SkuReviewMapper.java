package ltd.newbee.mall.newbeemall.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.SkuColor;
import ltd.newbee.mall.newbeemall.entity.SkuReview;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.entity.Todo;

public interface SkuReviewMapper {
    List<SkuReview> getReviews(Long goodsId);
	
	
}
