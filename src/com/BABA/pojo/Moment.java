package com.BABA.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="baba_Moment")
public class Moment implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Temporal(value=TemporalType.TIMESTAMP)
private Date date;
private String savePath;
@Column(length=180)
//60字
private String content;
@Column(nullable=true)
private Integer likes;
@ManyToOne(targetEntity=Users.class)
@JoinColumn(name="user_id",nullable=true)
private Users user;
public Moment(){}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getSavePath() {
	return savePath;
}
public void setSavePath(String savePath) {
	this.savePath = savePath;
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
public Users getUser() {
	return user;
}
public void setUser(Users user) {
	this.user = user;
}


}
