package ltd.newbee.mall.newbeemall.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Category implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2464111+09:00", comments = "Source field: category.category_id")
	private Integer categoryId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2464111+09:00", comments = "Source field: category.category_name")
	private String categoryName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2464111+09:00", comments = "Source field: category.parent")
	private Integer parent;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2464111+09:00", comments = "Source field: category.active")
	private String active;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T15:22:35.4728557+09:00", comments = "Source field: category_img.img")
	private String img;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2464111+09:00", comments = "Source field: category.category_id")
	public Integer getCategoryId() {
		return categoryId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2464111+09:00", comments = "Source field: category.category_id")
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2464111+09:00", comments = "Source field: category.category_name")
	public String getCategoryName() {
		return categoryName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2464111+09:00", comments = "Source field: category.category_name")
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName == null ? null : categoryName.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2464111+09:00", comments = "Source field: category.parent")
	public Integer getParent() {
		return parent;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2464111+09:00", comments = "Source field: category.parent")
	public void setParent(Integer parent) {
		this.parent = parent;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2474104+09:00", comments = "Source field: category.active")
	public String getActive() {
		return active;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:36.2474104+09:00", comments = "Source field: category.active")
	public void setActive(String active) {
		this.active = active == null ? null : active.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T15:22:35.4728557+09:00", comments = "Source field: category_img.img")
	public String getImg() {
		return img;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T15:22:35.4728557+09:00", comments = "Source field: category_img.img")
	public void setImg(String img) {
		this.img = img == null ? null : img.trim();
	}
}