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
@Table(name="baba_Feedback")
public class Feedback implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String table_from;
	@ManyToOne(targetEntity=Issue_detail.class)
	@JoinColumn(name="issue_id",nullable=true)
	private Issue_detail issue_detail;
	@ManyToOne(targetEntity=Inf.class)
	@JoinColumn(name="inf_id",nullable=true)
	private Inf inf;
    String title;
	@Lob
	String content;
	@Temporal(value=TemporalType.TIMESTAMP)
	Date date;
	@ManyToOne(targetEntity=Users.class)
	@JoinColumn(name="user_id",nullable=true)
	private Users user;
	@Column(length=15)
	private String state;
	public Feedback(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTable_from() {
		return table_from;
	}
	public void setTable_from(String table_from) {
		this.table_from = table_from;
	}
	public Issue_detail getIssue_detail() {
		return issue_detail;
	}
	public void setIssue_detail(Issue_detail issue_detail) {
		this.issue_detail = issue_detail;
	}
	public Inf getInf() {
		return inf;
	}
	public void setInf(Inf inf) {
		this.inf = inf;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
