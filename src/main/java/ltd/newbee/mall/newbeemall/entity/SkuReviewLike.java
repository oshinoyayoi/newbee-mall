package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class SkuReviewLike {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-13T09:48:51.9391416+09:00", comments="Source field: sku_review_like.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-13T09:48:51.9412208+09:00", comments="Source field: sku_review_like.user_id")
    private String userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-13T09:48:51.9412208+09:00", comments="Source field: sku_review_like.date")
    private String date;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-13T09:48:51.9412208+09:00", comments="Source field: sku_review_like.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-13T09:48:51.9412208+09:00", comments="Source field: sku_review_like.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-13T09:48:51.9412208+09:00", comments="Source field: sku_review_like.user_id")
    public String getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-13T09:48:51.9412208+09:00", comments="Source field: sku_review_like.user_id")
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-13T09:48:51.9412208+09:00", comments="Source field: sku_review_like.date")
    public String getDate() {
        return date;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-13T09:48:51.9412208+09:00", comments="Source field: sku_review_like.date")
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }
}