package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.CategoryService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class CategoryController {
	@Resource
	private CategoryService categoryService;

	@GetMapping("/categoryName")
	@ResponseBody
	public Result getgoodsDetail() {
		return ResultGenerator.genSuccessResult(categoryService.getCategoryForIndex());
	}
}
	