package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ECGoodsDetailMapper;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.service.ECGoodsDetailService;

@Service
public class ECGoodsDetailServiceImpl implements ECGoodsDetailService {

	@Resource
	ECGoodsDetailMapper eCGoodsDetailMapper;

	@Override
	public List<Sku> findGoodsDetailsByGoodsId(int configType) {
		List<Sku> list = eCGoodsDetailMapper.selectGoodsDetail(configType);
		return list;
	}

}
