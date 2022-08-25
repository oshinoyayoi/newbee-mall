package ltd.newbee.mall.newbeemall.service.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.CountQuestionAndAnswersMapper;
import ltd.newbee.mall.newbeemall.dao.QuestionsAndAnswersMapper;
import ltd.newbee.mall.newbeemall.dao.SkuReviewMapper;
import ltd.newbee.mall.newbeemall.dao.TodoMapper;
import ltd.newbee.mall.newbeemall.entity.QuestionsAndAnswers;
import ltd.newbee.mall.newbeemall.entity.SkuReview;
import ltd.newbee.mall.newbeemall.entity.Todo;
import ltd.newbee.mall.newbeemall.service.QuestionsAndAnswersService;
import ltd.newbee.mall.newbeemall.service.SkuReviewService;
import ltd.newbee.mall.newbeemall.service.TodoService;
import ltd.newbee.mall.newbeemall.vo.QuestionsAndAnswersVo;
import ltd.newbee.mall.newbeemall.vo.TodoVo;

@Service
public class SkuReviewServiceImpl implements SkuReviewService {

	@Resource
	SkuReviewMapper skuReviewMapper;

	
	@Override
	public List<SkuReview> getAll(Long goodsId) {
		List<SkuReview> list=skuReviewMapper.getReviews(goodsId);
		
		return list;
		
	}


	@Override
	public int insertReview(Map<String, Object> reMap) {
		// TODO Auto-generated method stub
		return skuReviewMapper.insertReview(reMap);
	}


}
