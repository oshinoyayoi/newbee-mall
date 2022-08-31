package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TbNewbeeMallShoppingCartItem {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.cart_item_id")
	private Long cartItemId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.user_id")
	private Long userId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.goods_id")
	private Long goodsId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.goods_count")
	private Integer goodsCount;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.is_deleted")
	private Byte isDeleted;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.create_time")
	private Date createTime;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.update_time")
	private Date updateTime;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.goods_name")
	private String goodsName;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.sku_id")
	private String skuId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.cart_item_id")
	public Long getCartItemId() {
		return cartItemId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.cart_item_id")
	public void setCartItemId(Long cartItemId) {
		this.cartItemId = cartItemId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.user_id")
	public Long getUserId() {
		return userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.user_id")
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.goods_id")
	public Long getGoodsId() {
		return goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.goods_id")
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.goods_count")
	public Integer getGoodsCount() {
		return goodsCount;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6941218+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.goods_count")
	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.is_deleted")
	public Byte getIsDeleted() {
		return isDeleted;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.is_deleted")
	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.create_time")
	public Date getCreateTime() {
		return createTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.create_time")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.update_time")
	public Date getUpdateTime() {
		return updateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.update_time")
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.goods_name")
	public String getGoodsName() {
		return goodsName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.goods_name")
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName == null ? null : goodsName.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.sku_id")
	public String getSkuId() {
		return skuId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-26T14:03:52.6951191+09:00", comments = "Source field: tb_newbee_mall_shopping_cart_item.sku_id")
	public void setSkuId(String skuId) {
		this.skuId = skuId == null ? null : skuId.trim();
	}

	
    
    private String size;
    
    private String color;
    
    private Long price;
    
    private Long stock;
    
    private String img1;
    
    private String deliveryTime;
    
   

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}