package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public interface RescentGoodsDetailMapper {
	List<TbNewbeeMallGoodsInfo> selectGoodsDetail(int userId);
}
