package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Category;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;

public interface CategoryMapper {
	List<GoodsCategory> selectGoodsDetail(int parentId);
}
