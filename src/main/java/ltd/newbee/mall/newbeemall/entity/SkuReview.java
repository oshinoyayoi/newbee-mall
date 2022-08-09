package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class SkuReview {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.goods_id")
    private Long goodsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.goods_name")
    private String goodsName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.review_title")
    private String reviewTitle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.review")
    private String review;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.customer_name")
    private String customerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.date")
    private String date;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.stars")
    private Integer stars;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.great")
    private Integer great;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.img1")
    private String img1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.546636+09:00", comments="Source field: sku_review.img2")
    private String img2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.546636+09:00", comments="Source field: sku_review.img3")
    private String img3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.546636+09:00", comments="Source field: sku_review.img4")
    private String img4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.goods_id")
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.goods_id")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.goods_name")
    public String getGoodsName() {
        return goodsName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.goods_name")
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.review_title")
    public String getReviewTitle() {
        return reviewTitle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.review_title")
    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle == null ? null : reviewTitle.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.review")
    public String getReview() {
        return review;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.review")
    public void setReview(String review) {
        this.review = review == null ? null : review.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.customer_name")
    public String getCustomerName() {
        return customerName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.customer_name")
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.date")
    public String getDate() {
        return date;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.date")
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.stars")
    public Integer getStars() {
        return stars;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.stars")
    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.great")
    public Integer getGreat() {
        return great;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.5456377+09:00", comments="Source field: sku_review.great")
    public void setGreat(Integer great) {
        this.great = great;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.546636+09:00", comments="Source field: sku_review.img1")
    public String getImg1() {
        return img1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.546636+09:00", comments="Source field: sku_review.img1")
    public void setImg1(String img1) {
        this.img1 = img1 == null ? null : img1.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.546636+09:00", comments="Source field: sku_review.img2")
    public String getImg2() {
        return img2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.546636+09:00", comments="Source field: sku_review.img2")
    public void setImg2(String img2) {
        this.img2 = img2 == null ? null : img2.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.546636+09:00", comments="Source field: sku_review.img3")
    public String getImg3() {
        return img3;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.546636+09:00", comments="Source field: sku_review.img3")
    public void setImg3(String img3) {
        this.img3 = img3 == null ? null : img3.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.546636+09:00", comments="Source field: sku_review.img4")
    public String getImg4() {
        return img4;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-08-09T16:16:13.546636+09:00", comments="Source field: sku_review.img4")
    public void setImg4(String img4) {
        this.img4 = img4 == null ? null : img4.trim();
    }
}