package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class SubCategory {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T10:22:23.0864499+09:00", comments = "Source field: sub_category.goods_id")
	private Long goodsId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T10:22:23.0884445+09:00", comments = "Source field: sub_category.col")
	private String col;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T10:22:23.0884445+09:00", comments = "Source field: sub_category.col_name")
	private String colName;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T10:22:23.0874478+09:00", comments = "Source field: sub_category.goods_id")
	public Long getGoodsId() {
		return goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T10:22:23.0884445+09:00", comments = "Source field: sub_category.goods_id")
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T10:22:23.0884445+09:00", comments = "Source field: sub_category.col")
	public String getCol() {
		return col;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T10:22:23.0884445+09:00", comments = "Source field: sub_category.col")
	public void setCol(String col) {
		this.col = col == null ? null : col.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T10:22:23.0884445+09:00", comments = "Source field: sub_category.col_name")
	public String getColName() {
		return colName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T10:22:23.0884445+09:00", comments = "Source field: sub_category.col_name")
	public void setColName(String colName) {
		this.colName = colName == null ? null : colName.trim();
	}
}