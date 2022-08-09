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
import ltd.newbee.mall.newbeemall.dao.TodoMapper;
import ltd.newbee.mall.newbeemall.entity.QuestionsAndAnswers;
import ltd.newbee.mall.newbeemall.entity.Todo;
import ltd.newbee.mall.newbeemall.service.QuestionsAndAnswersService;
import ltd.newbee.mall.newbeemall.service.TodoService;
import ltd.newbee.mall.newbeemall.vo.QuestionsAndAnswersVo;
import ltd.newbee.mall.newbeemall.vo.TodoVo;

@Service
public class QuestionsAndAnswersServiceImpl implements QuestionsAndAnswersService {

	@Resource
	QuestionsAndAnswersMapper questionsAndAnswersMapper;
	@Resource
	CountQuestionAndAnswersMapper countQuestionAndAnswersMapper;
	
	@Override
	public QuestionsAndAnswersVo getList(Long goodsId,String orderBy,Long pageNum) {
		int start=(int) ((pageNum-1)*3);
		List<QuestionsAndAnswers> list=questionsAndAnswersMapper.getQuestionsAndAnswers(goodsId, orderBy, start);
		QuestionsAndAnswersVo questionsAndAnswersVo=new QuestionsAndAnswersVo();
		int count=countQuestionAndAnswersMapper.countNumberQAndA(goodsId);
		
		
		
		questionsAndAnswersVo.setCount(count);
		questionsAndAnswersVo.setList(list);
		return questionsAndAnswersVo;
	}


	@Override
	public List<QuestionsAndAnswers> getAll(Long goodsId) {
		List<QuestionsAndAnswers> allList=questionsAndAnswersMapper.getAllQuestions(goodsId);
		int count=0;
		for (int i = 0; i < allList.size(); i++) {
			count++;
		}
		return allList;
	}
}
