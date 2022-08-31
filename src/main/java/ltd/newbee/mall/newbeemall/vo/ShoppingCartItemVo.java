package ltd.newbee.mall.newbeemall.vo;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.QuestionsAndAnswers;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.SkuColor;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallShoppingCartItem;

public class ShoppingCartItemVo {

	
	private List<TbNewbeeMallShoppingCartItem> list;
	
	private int totalPrice;
	
	public List<TbNewbeeMallShoppingCartItem> getList() {
		return list;
	}

	public void setList(List<TbNewbeeMallShoppingCartItem> list) {
		this.list = list;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
  
}
