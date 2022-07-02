package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.RescentGoodsDetailMapper;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.service.RescentGoodsDetailService;

@Service
public class RescentGoodsDetailServiceImpl implements RescentGoodsDetailService {

	@Resource
	RescentGoodsDetailMapper rescentGoodsDetailMapper;

	@Override
	public List<TbNewbeeMallGoodsInfo> findGoodsDetailsByGoodsId(int userId) {
		List<TbNewbeeMallGoodsInfo> list = rescentGoodsDetailMapper.selectGoodsDetail(userId);
		return list;
	}

}
