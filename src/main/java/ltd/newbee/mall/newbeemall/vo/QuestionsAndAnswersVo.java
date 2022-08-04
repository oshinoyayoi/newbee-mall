package ltd.newbee.mall.newbeemall.vo;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.QuestionsAndAnswers;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.SkuColor;

public class QuestionsAndAnswersVo {

	private List<QuestionsAndAnswers> list;
	
	private Integer count;

	public List<QuestionsAndAnswers> getList() {
		return list;
	}

	public void setList(List<QuestionsAndAnswers> list) {
		this.list = list;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	

}
