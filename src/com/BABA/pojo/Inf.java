package com.BABA.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="baba_Inf")
public class Inf implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(unique=true)
private int id;
private String title;
private String description;
@Lob
private String content;
@Temporal(value=TemporalType.TIMESTAMP)
private Date date;
@Column(length=15)
private String state;
@Column(nullable=true)
private Integer likes;
@OneToMany(mappedBy="inf",cascade={CascadeType.REMOVE,CascadeType.MERGE,CascadeType.REFRESH},fetch=FetchType.EAGER,targetEntity=Answer.class)
private Set<Answer> answers=new HashSet<Answer>();
@ManyToOne(targetEntity=Users.class)
@JoinColumn(name="user_id",nullable=true)
private Users user;
public Inf(){}
public Inf(String content,Date date,int likes,String state,String title){
this.content=content;
this.date=date;
this.likes=likes;
this.state=state;
this.title=title;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
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
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
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
public Set<Answer> getAnswers() {
	return answers;
}
public void setAnswers(Set<Answer> answers) {
	this.answers = answers;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public void setLikes(Integer likes) {
	this.likes = likes;
}

}
