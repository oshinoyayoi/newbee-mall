package ltd.newbee.mall.newbeemall.vo;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public class SkuCategoryVo extends TbNewbeeMallGoodsInfo {
	
	private String col;
	
	private String colName;

	public String getCol() {
		return col;
	}

	public void setCol(String col) {
		this.col = col;
	}

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}
}
