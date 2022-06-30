package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsDetail;
import ltd.newbee.mall.newbeemall.entity.Sku;

public interface ECGoodsDetailMapper {
	List<Sku> selectGoodsDetail(int configType);
}
