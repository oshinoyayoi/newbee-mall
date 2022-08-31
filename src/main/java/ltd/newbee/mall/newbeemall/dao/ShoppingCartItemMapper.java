package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallShoppingCartItem;
import ltd.newbee.mall.newbeemall.entity.Todo;

public interface ShoppingCartItemMapper {
	List<TbNewbeeMallShoppingCartItem> getShoppingCart(Long userId);
	//增加
	int insertProduct(Map<String, Object> shopingMap);
	//修改count
	int chageCount(int goodsCount,Long cartItemId);
	//修改isDeleted
//	int chageIsDeleted (Long cartItemId);
	//删除
	int deleteProduct(Long cartItemId);
}
