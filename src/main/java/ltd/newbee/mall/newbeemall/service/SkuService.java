package ltd.newbee.mall.newbeemall.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.vo.SecondCategoryVo;
import ltd.newbee.mall.newbeemall.vo.SkuVo;
import ltd.newbee.mall.newbeemall.vo.QuestionsAndAnswersVo;



public interface SkuService {
//	List<Sku> getProductDetail();
	//List<Sku> getProductDetailBySize(String size);
	SkuVo getSkuProduct(Long goodsId,String size,String color);
	
}
