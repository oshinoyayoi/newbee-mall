package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;
import ltd.newbee.mall.newbeemall.vo.SecondCategoryVo;
import ltd.newbee.mall.newbeemall.vo.SkuCategoryVo;

public interface SkuCategoryService {
	SecondCategoryVo getSkuCategory(Long categoryId, Integer pageNum, String orderBy, String ascOrDesc)
			;
	
}
