package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public interface RescentGoodsDetailService {
	List<TbNewbeeMallGoodsInfo> findGoodsDetailsByGoodsId(int userId);

}
