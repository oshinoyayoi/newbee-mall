package ltd.newbee.mall.newbeemall.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.QuestionsAndAnswers;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallShoppingCartItem;
import ltd.newbee.mall.newbeemall.entity.Todo;
import ltd.newbee.mall.newbeemall.vo.SecondCategoryVo;
import ltd.newbee.mall.newbeemall.vo.QuestionsAndAnswersVo;

public interface ShoppingCartItemService {
	List<TbNewbeeMallShoppingCartItem> getShoppingCart(Long userId);
    //添加
	List<TbNewbeeMallShoppingCartItem> insertProduct(Map<String, Object> shopingMap);
	//修改
	List<TbNewbeeMallShoppingCartItem> chageCount(int goodsCount,Long cartItemId);
	//修改 isDeleted
//		List<TbNewbeeMallShoppingCartItem> chageIsDeleted(Long cartItemId);
	//删除
	List<TbNewbeeMallShoppingCartItem> deleteProduct(Long cartItemId);
}
