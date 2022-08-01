package ltd.newbee.mall.newbeemall.vo;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.Sku;

public class SkuVo {

	private List<String> colorList;
	
	private List<String> sizeList;
	
	private List<Sku> voList;

	public List<Sku> getVoList() {
		return voList;
	}

	public void setVoList(List<Sku> voList) {
		this.voList = voList;
	}

	public List<String> getSizeList() {
		return sizeList;
	}

	public void setSizeList(List<String> sizeList) {
		this.sizeList = sizeList;
	}

	public List<String> getColorList() {
		return colorList;
	}

	public void setColorList(List<String> colorList) {
		this.colorList = colorList;
	}


}
