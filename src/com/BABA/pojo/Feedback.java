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
	String id_from;
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
	public String getId_from() {
		return id_from;
	}
	public void setId_from(String id_from) {
		this.id_from = id_from;
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
}
