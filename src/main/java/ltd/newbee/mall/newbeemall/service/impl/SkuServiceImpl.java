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
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.service.NewListService;
import ltd.newbee.mall.newbeemall.service.SkuService;
import ltd.newbee.mall.newbeemall.vo.SkuVo;

@Service
public class SkuServiceImpl implements SkuService {

	@Resource
	SkuMapper skuMapper;

	// 抽取整个列表
	/*
	 * @Override public List<Sku> getProductDetail() { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * // 根据size获取列表
	 * 
	 * @Override public List<Sku> getProductDetailBySize(String size) { List<Sku>
	 * list = skuMapper.productDetail(size);
	 * 
	 * 
	 * // List<Sku> allList=new ArrayList<>(); // if (list.size() > 1) { // for (int
	 * i = 0; i < list.size(); i++) { // list.remove(i); // } }
	 * 
	 * return list;
	 * 
	 * }
	 */

	@Override
	public SkuVo getSkuProduct(HashMap<String, Object> map1) {
		SkuVo skuVo = new SkuVo();
		String size=(String) map1.get("size");
		String color=(String) map1.get("color");
		List<Sku> list = skuMapper.getAllDetails();
		List<String> sizeList = new ArrayList<>();
		List<String> colorList = new ArrayList<>();
        List<Sku> voList=new ArrayList<>();
        
        //
        voList=skuMapper.getAllDetails();
        
		// 所有size
		for (int i = 0; i < list.size(); i++) {
			if (!sizeList.contains(list.get(i).getSize())) {
				sizeList.add(list.get(i).getSize());
			}
		}

		// 同一个size的不同颜色
		for (int i = 0; i < sizeList.size(); i++) {
			if (size.equals(sizeList.get(i))) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getSize().equals(sizeList.get(i))) {
						colorList.add(list.get(j).getColor());
					}
				}
			}
			
		}
		skuVo.setColorList(colorList);
		skuVo.setSizeList(sizeList);
        skuVo.setVoList(voList);
		return skuVo;
	}

}
