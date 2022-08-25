package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.SkuReview;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.entity.Todo;


public interface SkuReviewService {
	List<SkuReview> getAll(Long goodsId);
	//insert review 7
		int insertReview(Map<String, Object> reMap);
}
