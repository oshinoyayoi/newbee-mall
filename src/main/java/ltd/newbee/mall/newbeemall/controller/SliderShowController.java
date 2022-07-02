package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.SliderShowService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class SliderShowController {
	@Resource
	private SliderShowService sliderShowService;

	@GetMapping("/sliderShow")
	@ResponseBody
	public Result getgoodsDetail() {
		return ResultGenerator.genSuccessResult(sliderShowService.getSliderShow());
	}
}
	