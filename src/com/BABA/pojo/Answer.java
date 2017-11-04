package com.BABA.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="baba_Answer")
public class Answer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Lob
	private String content;
	@Column(nullable=true)
	private Integer likes;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date date;
	@ManyToOne(targetEntity=Users.class)
	@JoinColumn(name="user_id",nullable=true)
	private Users user;
	@ManyToOne(targetEntity=Issue_detail.class)
	@JoinColumn(name="issue_id",nullable=true)
	private Issue_detail issue_detail;
	@ManyToOne(targetEntity=Inf.class)
	@JoinColumn(name="inf_id",nullable=true)
	private Inf inf;
	@ManyToOne(targetEntity=Plan.class)
	@JoinColumn(name="plan_id",nullable=true)
	private Plan plan;
	private int answer_id;
	
	public Answer(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Issue_detail getIssue_detail() {
		return issue_detail;
	}
	public void setIssue_detail(Issue_detail issue_detail) {
		this.issue_detail = issue_detail;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public int getAnswer_id() {
		return answer_id;
	}
	public Inf getInf() {
		return inf;
	}
	public void setInf(Inf inf) {
		this.inf = inf;
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	
}
