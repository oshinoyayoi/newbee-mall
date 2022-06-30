package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsDetail;

public interface Goods {
    List<GoodsDetail>seleGoodsDetail(long goodsId);
}
