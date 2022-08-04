package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class SkuColor {

	
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-02T15:18:03.7794102+09:00", comments = "Source field: sku.color")
	private String color;
	
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-02T15:18:03.7794102+09:00", comments = "Source field: sku.color_img")
	private String colorImg;
	

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-02T15:18:03.7794102+09:00", comments = "Source field: sku.color")
	public String getColor() {
		return color;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-02T15:18:03.7794102+09:00", comments = "Source field: sku.color")
	public void setColor(String color) {
		this.color = color == null ? null : color.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-02T15:18:03.7794102+09:00", comments = "Source field: sku.color_img")
	public String getColorImg() {
		return colorImg;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-02T15:18:03.7794102+09:00", comments = "Source field: sku.color_img")
	public void setColorImg(String colorImg) {
		this.colorImg = colorImg == null ? null : colorImg.trim();
	}
}