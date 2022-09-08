package com.hiberbate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Answers")
public class Answers {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	@Column(name="Answer")
	private String answer;
	@Column(name="postedBy")
	private String postedby;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getPostedby() {
		return postedby;
	}
	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}
	
	

}
