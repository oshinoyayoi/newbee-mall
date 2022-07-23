package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public class SkuCategoryVo extends TbNewbeeMallGoodsInfo {
	
	private String col;
	
	private String colName;
	
	private List<SkuCategoryVo> colsAndGoodsId;
	
	private Integer categoryId;
	
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


	public List<SkuCategoryVo> getColsGoodsId() {
		return colsAndGoodsId;
	}

	public void setColsGoodsId(List<SkuCategoryVo> colsGoodsId) {
		this.colsAndGoodsId = colsGoodsId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	
}
