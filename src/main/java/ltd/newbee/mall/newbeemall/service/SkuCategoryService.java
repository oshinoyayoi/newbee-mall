package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;
import ltd.newbee.mall.newbeemall.vo.SkuCategoryVo;

public interface SkuCategoryService {
	List<SkuCategoryVo> getSkuCategory(Long categoryId, Integer pageNum, String orderBy, String ascOrDesc)
			;
	
}
