package mypack;

import java.util.*;

public class Answer {
	
	private int id;
	private String answername;
	private String posteBy;
	private List<Question> questions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswername() {
		return answername;
	}
	public void setAnswername(String answername) {
		this.answername = answername;
	}
	public String getPosteBy() {
		return posteBy;
	}
	public void setPosteBy(String posteBy) {
		this.posteBy = posteBy;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}
