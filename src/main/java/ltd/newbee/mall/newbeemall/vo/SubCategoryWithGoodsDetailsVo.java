package ltd.newbee.mall.newbeemall.vo;

import java.util.Map;

public class SubCategoryWithGoodsDetailsVo {

	private String name;

	private Map<String, Integer> goodsDetailsList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Integer> getGoodsDetailsList() {
		return goodsDetailsList;
	}

	public void setGoodsDetailsList(Map<String, Integer> goodsDetailsList) {
		this.goodsDetailsList = goodsDetailsList;
	}
}
