package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

public class RescentSawGoods {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-30T14:31:10.0328363+09:00", comments="Source field: rescent_saw_goods.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-30T14:31:10.0328363+09:00", comments="Source field: rescent_saw_goods.check_date")
    private Date checkDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-30T14:31:10.0328363+09:00", comments="Source field: rescent_saw_goods.sku_id")
    private Long skuId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-30T14:31:10.0328363+09:00", comments="Source field: rescent_saw_goods.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-30T14:31:10.0328363+09:00", comments="Source field: rescent_saw_goods.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-30T14:31:10.0328363+09:00", comments="Source field: rescent_saw_goods.check_date")
    public Date getCheckDate() {
        return checkDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-30T14:31:10.0328363+09:00", comments="Source field: rescent_saw_goods.check_date")
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-30T14:31:10.0328363+09:00", comments="Source field: rescent_saw_goods.sku_id")
    public Long getSkuId() {
        return skuId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-06-30T14:31:10.0328363+09:00", comments="Source field: rescent_saw_goods.sku_id")
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}