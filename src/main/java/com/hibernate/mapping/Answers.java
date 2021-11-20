package com.hibernate.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AnswersTable")
public class Answers {

	@Id
	private int aid;
	private String answer;
	
	@ManyToOne
	private Question question;

	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answers(int aid, String answer, Question question) {
		super();
		this.aid = aid;
		this.answer = answer;
		this.question = question;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
