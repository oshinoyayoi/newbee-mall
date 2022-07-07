package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public class SkuCategoryVo extends TbNewbeeMallGoodsInfo {
	
	private String col;
	
	private String colName;
  
	private String colOne;
	
	private String colTwo;
	
	private String colThree;
	
	private List<SkuCategoryVo> colsAndGoodsId;
	
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

	public String getColOne() {
		return colOne;
	}

	public void setColOne(String colOne) {
		this.colOne = colOne;
	}

	public String getColTwo() {
		return colTwo;
	}

	public void setColTwo(String colTwo) {
		this.colTwo = colTwo;
	}

	public String getColThree() {
		return colThree;
	}

	public void setColThree(String colThree) {
		this.colThree = colThree;
	}

	public List<SkuCategoryVo> getColsGoodsId() {
		return colsAndGoodsId;
	}

	public void setColsGoodsId(List<SkuCategoryVo> colsGoodsId) {
		this.colsAndGoodsId = colsGoodsId;
	}

	
}
