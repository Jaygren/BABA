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
@Table(name="baba_Issue_detail")
public class Issue_detail implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(unique=true)
private int id;
String title;
@Lob
private String content;
@Temporal(value=TemporalType.TIMESTAMP)
private Date date;
private int version;
@ManyToOne(targetEntity=Issue.class)
@JoinColumn(name="issue_id",nullable=true)
private Issue issue;
@OneToMany(mappedBy="issue_detail",cascade={CascadeType.REMOVE,CascadeType.MERGE,CascadeType.REFRESH},fetch=FetchType.EAGER,targetEntity=Answer.class)
private Set<Answer> answers=new HashSet<Answer>();
@ManyToOne(targetEntity=Users.class,fetch=FetchType.LAZY)
@JoinColumn(name="user_id",nullable=true)
private Users user;
public Issue_detail(){}
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
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getVersion() {
	return version;
}
public void setVersion(int version) {
	this.version = version;
}
public Issue getIssue() {
	return issue;
}
public void setIssue(Issue issue) {
	this.issue = issue;
}
public Users getUser() {
	return user;
}
public void setUser(Users user) {
	this.user = user;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Set<Answer> getAnswers() {
	return answers;
}
public void setAnswers(Set<Answer> answers) {
	this.answers = answers;
}

}
