package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.entity.GoodsReview;
import ltd.newbee.mall.newbeemall.entity.MallUser;
import ltd.newbee.mall.newbeemall.service.CheckUserExistsService;
import ltd.newbee.mall.newbeemall.service.ECGoodsDetailService;
import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.service.GoodsImageService;
import ltd.newbee.mall.newbeemall.service.GoodsInfoService;
import ltd.newbee.mall.newbeemall.service.GoodsQuestionAndAnswerService;
import ltd.newbee.mall.newbeemall.service.GoodsReviewService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class ECGoodsDetailController {
	@Resource
	private ECGoodsDetailService ecGoodsDetailService;

	@GetMapping("/ecGoodsDetail")
	@ResponseBody
	public Result getgoodsDetail(int configType) {
		return ResultGenerator.genSuccessResult(ecGoodsDetailService.findGoodsDetailsByGoodsId(configType));
	}
}
	