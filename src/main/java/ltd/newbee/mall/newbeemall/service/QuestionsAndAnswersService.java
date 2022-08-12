package ltd.newbee.mall.newbeemall.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.QuestionsAndAnswers;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.Todo;
import ltd.newbee.mall.newbeemall.vo.SecondCategoryVo;
import ltd.newbee.mall.newbeemall.vo.QuestionsAndAnswersVo;

public interface QuestionsAndAnswersService {
	QuestionsAndAnswersVo getList(Long goodsId, String orderBy, Long pageNum);

	List<QuestionsAndAnswers> getAll(Long goodsId);

	int insertQAList(Map<String, Object> qa);
}
