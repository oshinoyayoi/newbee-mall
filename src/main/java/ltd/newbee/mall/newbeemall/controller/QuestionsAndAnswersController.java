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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.MallUser;
import ltd.newbee.mall.newbeemall.service.NewListService;
import ltd.newbee.mall.newbeemall.service.QuestionsAndAnswersService;
import ltd.newbee.mall.newbeemall.service.SkuService;
import ltd.newbee.mall.newbeemall.service.TodoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class QuestionsAndAnswersController {

	// 方法2 Postman:POST
	/**
	 * restful风格的参数请求 http://localhost:8080/goods/detail/review/222222
	 * 
	 * @param id
	 */
	@Resource
	private QuestionsAndAnswersService questionsAndAnswersService;

	//获取所有商品
	@CrossOrigin(origins = "http://localhost:3000")

	@GetMapping("/qAndA")
	@ResponseBody
	public Result getgoodsDetail(Long goodsId,String orderBy,String ascOrDesc,Long pageNum) {
		return ResultGenerator.genSuccessResult(questionsAndAnswersService.getList(goodsId,orderBy,ascOrDesc, pageNum));

	}

/*	public Result getgoodsDetail(Long goodsId,String size,String color) {
		return ResultGenerator.genSuccessResult(skuService.getSkuProduct(goodsId,size,color));

	}
*/
}
