package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TbNewbeeMallOrderItem {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.1056141+09:00", comments = "Source field: tb_newbee_mall_order_item.order_item_id")
	private Long orderItemId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.order_id")
	private Long orderId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_id")
	private Long goodsId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_name")
	private String goodsName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_cover_img")
	private String goodsCoverImg;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.selling_price")
	private Integer sellingPrice;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_count")
	private Integer goodsCount;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.create_time")
	private Date createTime;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.1066126+09:00", comments = "Source field: tb_newbee_mall_order_item.order_item_id")
	public Long getOrderItemId() {
		return orderItemId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.order_item_id")
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.order_id")
	public Long getOrderId() {
		return orderId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.order_id")
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_id")
	public Long getGoodsId() {
		return goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_id")
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_name")
	public String getGoodsName() {
		return goodsName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_name")
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName == null ? null : goodsName.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_cover_img")
	public String getGoodsCoverImg() {
		return goodsCoverImg;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_cover_img")
	public void setGoodsCoverImg(String goodsCoverImg) {
		this.goodsCoverImg = goodsCoverImg == null ? null : goodsCoverImg.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.selling_price")
	public Integer getSellingPrice() {
		return sellingPrice;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.selling_price")
	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_count")
	public Integer getGoodsCount() {
		return goodsCount;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.goods_count")
	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.create_time")
	public Date getCreateTime() {
		return createTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:00:21.10761+09:00", comments = "Source field: tb_newbee_mall_order_item.create_time")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}