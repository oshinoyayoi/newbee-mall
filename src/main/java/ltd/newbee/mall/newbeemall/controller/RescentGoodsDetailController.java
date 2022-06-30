package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.RescentGoodsDetailService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class RescentGoodsDetailController {
	@Resource
	private RescentGoodsDetailService rescentGoodsDetailService;

	@GetMapping("/rescentGoodsDetail")
	@ResponseBody
	public Result getgoodsDetail(int userId) {
		return ResultGenerator.genSuccessResult(rescentGoodsDetailService.findGoodsDetailsByGoodsId(userId));
	}
}
	