package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

public interface SelectItemsByColsMapper {
	List<Long> selectItemsByCols(int categoryId, List<String> cols);
}
