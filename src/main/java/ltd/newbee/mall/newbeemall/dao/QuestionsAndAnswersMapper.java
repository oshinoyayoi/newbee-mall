package ltd.newbee.mall.newbeemall.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.QuestionsAndAnswers;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.SkuColor;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.entity.Todo;

public interface QuestionsAndAnswersMapper {
	List<QuestionsAndAnswers> getQuestionsAndAnswers(Long goodsId, String orderBy, int start);

	List<QuestionsAndAnswers> getAllQuestions(Long goodsId);

	// 增加
	int insertQAList(Map<String, Object> qa);

}
