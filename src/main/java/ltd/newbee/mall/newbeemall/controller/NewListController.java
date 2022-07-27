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
import ltd.newbee.mall.newbeemall.service.NewListService;
import ltd.newbee.mall.newbeemall.service.TodoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class NewListController {

	// 方法2 Postman:POST
	/**
	 * restful风格的参数请求 http://localhost:8080/goods/detail/review/222222
	 * 
	 * @param id
	 */
	@Resource
	private NewListService newListService;
    //所有todolist
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/newList", method = RequestMethod.GET)
	@ResponseBody
	public Result getgoodsDetail() {
		return ResultGenerator.genSuccessResult(newListService.getNewList());

	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/newLists/{goodsCategoryId}")
	@ResponseBody
	public Result getgoodsDetails(@PathVariable("goodsCategoryId") Long goodsCategoryId) {
		return ResultGenerator.genSuccessResult(newListService.getNewLists(goodsCategoryId));

	}
}
