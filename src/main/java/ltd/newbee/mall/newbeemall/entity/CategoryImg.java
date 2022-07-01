package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class CategoryImg {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T15:22:35.4728557+09:00", comments="Source field: category_img.category_id")
    private Long categoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T15:22:35.4728557+09:00", comments="Source field: category_img.img")
    private String img;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T15:22:35.4728557+09:00", comments="Source field: category_img.category_id")
    public Long getCategoryId() {
        return categoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T15:22:35.4728557+09:00", comments="Source field: category_img.category_id")
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T15:22:35.4728557+09:00", comments="Source field: category_img.img")
    public String getImg() {
        return img;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T15:22:35.4728557+09:00", comments="Source field: category_img.img")
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}