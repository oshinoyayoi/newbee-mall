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
		// 当只传goodsId
			/*	if (size=="" && color=="") {
					String size1="シングル";
					String color1="ホワイト";
					//colorList.add(color1);
					//sizeList.add(size1);
				   
				}		
		*/
		// 所有size
	/*	for (int i = 0; i < voList.size(); i++) {
			if (!sizeList.contains(voList.get(i).getSize())) {
				sizeList.add(voList.get(i).getSize());
			}
		}
		// 同一个size的不同颜色
		for (int i = 0; i < sizeList.size(); i++) {
			if (size.equals(sizeList.get(i))) {
				for (int j = 0; j < voList.size(); j++) {
					if (voList.get(j).getSize().equals(sizeList.get(i))) {
						colorList.add(voList.get(j).getColor());
					}
				}
			}
		}
*/
		skuVo.setColorList(colorList);
		skuVo.setSizeList(sizeList);
		skuVo.setVoList(voList);
		return skuVo;
	}

}
