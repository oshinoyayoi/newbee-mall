package ltd.newbee.mall.newbeemall.service.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.NewListMapper;
import ltd.newbee.mall.newbeemall.dao.SkuMapper;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.SkuColor;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.service.NewListService;
import ltd.newbee.mall.newbeemall.service.SkuService;
import ltd.newbee.mall.newbeemall.vo.QuestionsAndAnswersVo;
import ltd.newbee.mall.newbeemall.vo.SkuVo;

@Service
public class SkuServiceImpl implements SkuService {

	@Resource
	SkuMapper skuMapper;

	@Override
	public SkuVo getSkuProduct(Long goodsId, String size, String color) {
		SkuVo skuVo = new SkuVo();
        
		List<String> sizeList = new ArrayList<>();
		List<SkuColor> colorList = new ArrayList<>();
		List<Sku> voList = skuMapper.getAllDetails(goodsId, size, color);
	    sizeList=skuMapper.getSizeList(goodsId);
        colorList=skuMapper.getColorList(goodsId, size);
        
		skuVo.setColorList(colorList);
		skuVo.setSizeList(sizeList);
		skuVo.setVoList(voList);
		return skuVo;
	}

}
