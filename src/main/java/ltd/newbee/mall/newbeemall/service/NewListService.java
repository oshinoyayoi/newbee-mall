package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.entity.Todo;

public interface NewListService {
	List<TbNewbeeMallGoodsInfo> getNewList();
	List<TbNewbeeMallGoodsInfo> getNewLists(Long goodsCategoryId);
}
