package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.MallUser;
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
    //所有todolist
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	@ResponseBody
	public Result getgoodsDetail() {
		return ResultGenerator.genSuccessResult(todoService.getTodoList());

	}
	//增加todo
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/todo")
	@ResponseBody
	public Result getgoodsDetail(@RequestBody HashMap<String, Object> todoMap) {
		return ResultGenerator.genSuccessResult(todoService.insertTodoList(todoMap));	
		
		}
	//修改status
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping(value = "/todo")
	@ResponseBody
	public Result newList(@RequestBody HashMap<String, Object> statusMap) {
		return ResultGenerator.genSuccessResult(todoService.chageStatus(statusMap));	
		
		}
	
   //删除delete
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/todo/{taskId}")
	@ResponseBody
	public Result deleteToDoList(@PathVariable("taskId") int taskId) {
		return ResultGenerator.genSuccessResult(todoService.deleteTodoList(taskId));

	}
}
// ...业务处理

// return ResultGenerator
// .genSuccessResult(skuCategoryService.getSkuCategory(info.getGoodsCategoryId(),
// info.getOrderBy()));
