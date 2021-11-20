package com.hibernate.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="QuestionTable")
public class Question {

	@Id
	private int qid;
	private String question;
	
	@OneToMany(mappedBy = "question")
	private List<Answers> answers;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int qid, String question, List<Answers> answers) {
		super();
		this.qid = qid;
		this.question = question;
		this.answers = answers;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	
	
}
