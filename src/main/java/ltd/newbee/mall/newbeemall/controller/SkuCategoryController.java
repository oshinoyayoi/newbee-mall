package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.dao.CountSkuCategoryMapper;
import ltd.newbee.mall.newbeemall.service.SkuCategoryService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class SkuCategoryController {

	// 方法2 Postman:POST
	/**
	 * restful风格的参数请求 http://localhost:8080/goods/detail/review/222222
	 * 
	 * @param id
	 */
	@Resource
	private SkuCategoryService skuCategoryService;
	@Resource
	private CountSkuCategoryMapper countSkuCategoryMapper;
    
	@RequestMapping(value = "/category/", method = RequestMethod.GET)
	@ResponseBody
	public Result queryProduct(@RequestBody HashMap<String, Object> map) {

	//	Integer pageNum = (page - 1) * 20;

		
		return ResultGenerator.genSuccessResult(skuCategoryService.getSkuCategory(map));

	}
}


// ...业务处理

// return ResultGenerator
// .genSuccessResult(skuCategoryService.getSkuCategory(info.getGoodsCategoryId(),
// info.getOrderBy()));
