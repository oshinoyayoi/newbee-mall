package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Sku;

public interface RescentGoodsDetailMapper {
	List<Sku> selectGoodsDetail(int userId);
}
