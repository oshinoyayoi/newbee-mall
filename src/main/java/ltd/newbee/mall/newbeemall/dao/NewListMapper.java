package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.entity.Todo;

public interface NewListMapper {
	List<TbNewbeeMallGoodsInfo> setNewList();
	List<TbNewbeeMallGoodsInfo> setNewLists(Long goodsCategoryId);
	
}
