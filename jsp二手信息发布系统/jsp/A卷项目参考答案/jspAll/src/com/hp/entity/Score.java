package com.hp.entity;

public class Score {
	
	private int id;  //序号
	private int sid; //学号
	private String subject; //课程
	private int score;  //成绩
	public Score(int id, int sid, String subject, int score) {
		super();
		this.id = id;
		this.sid = sid;
		this.subject = subject;
		this.score = score;
	}
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
