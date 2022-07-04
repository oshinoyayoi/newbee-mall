package ltd.newbee.mall.newbeemall.service.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.platform.commons.util.StringUtils;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.stereotype.Service;

import cn.hutool.core.bean.BeanUtil;
import ltd.newbee.mall.newbeemall.dao.SkuCategoryMapper;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.service.SkuCategoryService;
import ltd.newbee.mall.newbeemall.vo.SkuCategoryVo;

@Service
public class SkuCategoryServiceImpl implements SkuCategoryService {
	@Resource
	SkuCategoryMapper skuCategoryMapper;

	@Override
	public List<SkuCategoryVo> getSkuCategory(Long category,String orderBy,String ascOrDesc)  {
		List<SkuCategoryVo> voList = new ArrayList<>();
		
		
		List<TbNewbeeMallGoodsInfo> entityList = skuCategoryMapper.findGoodsInfoByGoodsCategoryId(category,orderBy,ascOrDesc);
		
		for(TbNewbeeMallGoodsInfo e : entityList) {
			SkuCategoryVo vo = new SkuCategoryVo();
			//entity自动转vo
			BeanUtil.copyProperties(e, vo);
			/*
			 * vo.setGoodsId(null); vo.setGoodsName(null); vo.setGoodsIntro(null);
			 * vo.setGoodsCoverImg(null); vo.setSellingPrice(null);
			 * vo.setOriginalPrice(null); vo.setGoodsDetailContent(null);
			 * vo.setStockNum(null); vo.setTag(null); vo.setGoodsSellStatus(null);
			 */
			voList.add(vo);
		}
		
		return voList;
	}

	/*public static String toUnderCase(String name) {
		final char UNDER_LINE = '_';
	    if (name == null) {
	        return null;
	    }

	    int len = name.length();
	    StringBuilder res = new StringBuilder(len + 2);
	    char pre = 0;
	    for (int i = 0; i < len; i++) {
	        char ch = name.charAt(i);
	        if (Character.isUpperCase(ch)) {
	            if (pre != UNDER_LINE) {
	                res.append(UNDER_LINE);
	            }
	            res.append(Character.toLowerCase(ch));
	        } else {
	            res.append(ch);
	        }
	        pre = ch;
	    }
	    return res.toString();
	}
	*/
}
