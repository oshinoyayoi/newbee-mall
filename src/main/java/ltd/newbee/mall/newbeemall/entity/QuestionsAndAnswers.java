package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

public class QuestionsAndAnswers {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5023439+09:00", comments = "Source field: questions_and_answers.id")
	private Integer id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.goods_id")
	private Long goodsId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.question")
	private String question;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.question_date")
	private String questionDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.answer")
	private String answer;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.answer_date")
	private String answerDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.great")
	private Integer great;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5033416+09:00", comments = "Source field: questions_and_answers.id")
	public Integer getId() {
		return id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.id")
	public void setId(Integer id) {
		this.id = id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.goods_id")
	public Long getGoodsId() {
		return goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.goods_id")
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.question")
	public String getQuestion() {
		return question;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.question")
	public void setQuestion(String question) {
		this.question = question == null ? null : question.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.question_date")
	public String getQuestionDate() {
		return questionDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.question_date")
	public void setQuestionDate(String questionDate) {
		this.questionDate = questionDate == null ? null : questionDate.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.answer")
	public String getAnswer() {
		return answer;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.answer")
	public void setAnswer(String answer) {
		this.answer = answer == null ? null : answer.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.answer_date")
	public String getAnswerDate() {
		return answerDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.answer_date")
	public void setAnswerDate(String answerDate) {
		this.answerDate = answerDate == null ? null : answerDate.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.great")
	public Integer getGreat() {
		return great;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-12T19:47:53.5043383+09:00", comments = "Source field: questions_and_answers.great")
	public void setGreat(Integer great) {
		this.great = great;
	}
}