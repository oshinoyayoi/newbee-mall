package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
    
	@RequestMapping(value = "/category/{goodsCategoryId}", method = RequestMethod.GET)
	@ResponseBody
	public Result queryProduct(@PathVariable("goodsCategoryId") Long categoryId, Integer page, String orderBy,
			String ascOrDesc) {

		Integer pageNum = (page - 1) * 20;

		
		return ResultGenerator.genSuccessResult(skuCategoryService.getSkuCategory(categoryId, pageNum, orderBy, ascOrDesc));

	}
}
// @PostMapping("category")
// @ResponseBody
// public Result queryProduct(@RequestBody TbNewbeeMallGoodsInfo info) throws
// Exception {

// ...业务处理

// return ResultGenerator
// .genSuccessResult(skuCategoryService.getSkuCategory(info.getGoodsCategoryId(),
// info.getOrderBy()));
