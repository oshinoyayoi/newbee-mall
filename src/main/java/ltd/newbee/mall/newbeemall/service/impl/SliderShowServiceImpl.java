package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.SliderShowMapper;
import ltd.newbee.mall.newbeemall.entity.SliderShow;
import ltd.newbee.mall.newbeemall.service.SliderShowService;

@Service
public class SliderShowServiceImpl implements SliderShowService {

	@Resource
	SliderShowMapper sliderShowMapper;

	@Override
	public List<SliderShow> getSliderShow() {
		List<SliderShow> list = sliderShowMapper.showTheSlider();
		return list;
	}

}
