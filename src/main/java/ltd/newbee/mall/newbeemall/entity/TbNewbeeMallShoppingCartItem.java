package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TbNewbeeMallShoppingCartItem {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.935093+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.cart_item_id")
    private Long cartItemId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.goods_id")
    private Long goodsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.goods_count")
    private Integer goodsCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.is_deleted")
    private Byte isDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.update_time")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.cart_item_id")
    public Long getCartItemId() {
        return cartItemId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.cart_item_id")
    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.goods_id")
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.goods_id")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.goods_count")
    public Integer getGoodsCount() {
        return goodsCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.goods_count")
    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.is_deleted")
    public Byte getIsDeleted() {
        return isDeleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.is_deleted")
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-25T11:38:56.9380554+09:00", comments="Source field: tb_newbee_mall_shopping_cart_item.update_time")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}