package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class SliderShow {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.img_url")
	private String imgUrl;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.direct_url")
	private String directUrl;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.img_order")
	private Integer imgOrder;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.desc1")
	private String desc1;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.desc2")
	private String desc2;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.img_url")
	public String getImgUrl() {
		return imgUrl;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.img_url")
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl == null ? null : imgUrl.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.direct_url")
	public String getDirectUrl() {
		return directUrl;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.direct_url")
	public void setDirectUrl(String directUrl) {
		this.directUrl = directUrl == null ? null : directUrl.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.img_order")
	public Integer getImgOrder() {
		return imgOrder;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.img_order")
	public void setImgOrder(Integer imgOrder) {
		this.imgOrder = imgOrder;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.desc1")
	public String getDesc1() {
		return desc1;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.desc1")
	public void setDesc1(String desc1) {
		this.desc1 = desc1 == null ? null : desc1.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.desc2")
	public String getDesc2() {
		return desc2;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-02T10:34:45.3969407+09:00", comments = "Source field: slider_show.desc2")
	public void setDesc2(String desc2) {
		this.desc2 = desc2 == null ? null : desc2.trim();
	}
}