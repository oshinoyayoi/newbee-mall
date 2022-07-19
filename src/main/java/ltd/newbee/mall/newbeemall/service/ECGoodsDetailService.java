package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public interface ECGoodsDetailService {
	List<TbNewbeeMallGoodsInfo> findGoodsDetailsByGoodsId(int configType);

}
