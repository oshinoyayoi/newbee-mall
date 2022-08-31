package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.MallUser;
import ltd.newbee.mall.newbeemall.service.ShoppingCartItemService;
import ltd.newbee.mall.newbeemall.service.TodoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class ShoppingCartItemController {

	// 方法2 Postman:POST
	/**
	 * restful风格的参数请求 http://localhost:8080/goods/detail/review/222222
	 * 
	 * @param id
	 */
	@Resource
	private ShoppingCartItemService shoppingCartItemService;

	// 所有todolist
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/shoppingcart")
	@ResponseBody
	public Result getgoodsDetail(Long userId) {
		return ResultGenerator.genSuccessResult(shoppingCartItemService.getShoppingCart(userId));

	}

	// 增加input
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/shoppingcart")
	@ResponseBody
	public Result insert(@RequestBody HashMap<String, Object> shoppingMap) {
		return ResultGenerator.genSuccessResult(shoppingCartItemService.insertProduct(shoppingMap));

	}
	
	// 修改status
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/shoppingcart")
	@ResponseBody
	public Result changeCount( int goodsCount, Long cartItemId) {
		return ResultGenerator.genSuccessResult(shoppingCartItemService.chageCount(goodsCount, cartItemId));

	}

	// 删除delete
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/shoppingcart/{cartItemId}")
	@ResponseBody
	public Result delete(@PathVariable("cartItemId") Long cartItemId) {
		return ResultGenerator.genSuccessResult(shoppingCartItemService.deleteProduct(cartItemId));

	}
/*
	// 修改isDeleted
		@CrossOrigin(origins = "http://localhost:3000")
		@PutMapping("/shoppingcart/newList")
		@ResponseBody
		public Result chageIsDeleted(Long cartItemId) {
			return ResultGenerator.genSuccessResult(shoppingCartItemService.chageIsDeleted(cartItemId));

		}
		*/
}

//@ResponseBody 以json格式返回
// ...业务处理

// return ResultGenerator
// .genSuccessResult(skuCategoryService.getSkuCategory(info.getGoodsCategoryId(),
// info.getOrderBy()));
