package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsDetail;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public interface ECGoodsDetailMapper {
	List<TbNewbeeMallGoodsInfo> selectGoodsDetail(int configType);
}
