package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ShoppingCartItemMapper;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallShoppingCartItem;
import ltd.newbee.mall.newbeemall.service.ShoppingCartItemService;

@Service
public class ShoppingCartItemImpl implements ShoppingCartItemService {

	@Resource
	ShoppingCartItemMapper shoppingCartItemMapper;

	// 抽取整个列表
	@Override
	public List<TbNewbeeMallShoppingCartItem> getShoppingCart(Long skuId) {
		List<TbNewbeeMallShoppingCartItem> list = shoppingCartItemMapper.getShoppingCart(skuId);
		return list;
	}

	// 增加
	@Override
	public List<TbNewbeeMallShoppingCartItem> insertProduct(Map<String, Object> shopingMap) {
		Long userId = (long) 1;
		shoppingCartItemMapper.insertProduct(shopingMap);
		return shoppingCartItemMapper.getShoppingCart(userId);
	}

	// 修改
	@Override
	public List<TbNewbeeMallShoppingCartItem> chageCount(int goodsCount, Long cartItemId) {
		// TODO Auto-generated method stub
		shoppingCartItemMapper.chageCount(goodsCount, cartItemId);
		return shoppingCartItemMapper.getShoppingCart(cartItemId);
	}

	// 删除
	@Override
	public List<TbNewbeeMallShoppingCartItem> deleteProduct(Long cartItemId) {
		Long userId = (long) 1;
		shoppingCartItemMapper.deleteProduct(cartItemId);
		return shoppingCartItemMapper.getShoppingCart(cartItemId);
	}
	/*
    //修改 isDeleted
	@Override
	public List<TbNewbeeMallShoppingCartItem> chageIsDeleted( Long cartItemId) {
		// TODO Auto-generated method stub
		shoppingCartItemMapper.chageIsDeleted(cartItemId);
		return shoppingCartItemMapper.getShoppingCart(cartItemId);
	}
*/
}
