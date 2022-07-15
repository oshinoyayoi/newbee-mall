package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.TodoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class TodoController {

	// 方法2 Postman:POST
	/**
	 * restful风格的参数请求 http://localhost:8080/goods/detail/review/222222
	 * 
	 * @param id
	 */
	@Resource
	private TodoService todoService;
	
	//   @CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/todo")
	@ResponseBody
	public Result todoResult() {	
		return ResultGenerator.genSuccessResult(todoService.getTodoList());

	}
}


// ...业务处理

// return ResultGenerator
// .genSuccessResult(skuCategoryService.getSkuCategory(info.getGoodsCategoryId(),
// info.getOrderBy()));
