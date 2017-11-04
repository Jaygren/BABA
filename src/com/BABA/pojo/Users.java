package com.BABA.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="baba_Users")
public class Users implements Serializable  {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(length=60,unique=true)
private String usersId;
@Column(length=200)
private String password;
@Column(length=60)
private String onScreenName;
private String tel;
@Column(nullable=true)
private String avater;
@Column(length=15,nullable=true)
private String state;
@OneToMany(mappedBy="user",cascade={CascadeType.REMOVE,CascadeType.MERGE,CascadeType.REFRESH},fetch=FetchType.EAGER,targetEntity=Moment.class)
private Set<Moment> moments=new HashSet<Moment>();
@OneToMany(mappedBy="user",cascade={CascadeType.REMOVE,CascadeType.MERGE,CascadeType.REFRESH},fetch=FetchType.EAGER,targetEntity=Inf.class)
private Set<Inf> infs=new HashSet<Inf>();
//@OneToMany(mappedBy="owner",fetch=FetchType.LAZY,targetEntity=Issue_detail.class)
//private Set<Issue_detail> issue_details=new HashSet<Issue_detail>();
//@OneToMany(mappedBy="owner",fetch=FetchType.LAZY,targetEntity=Answer_detail.class)
//private Set<Answer_detail>answer_details=new HashSet<Answer_detail>();
//@OneToMany(mappedBy="owner",fetch=FetchType.LAZY,targetEntity=Plan.class)
//private Set<Plan>plans=new HashSet<Plan>();

public Users(){}
public Users(String usersId,String password,String onScreenName,String tel,String avater){
	this.usersId=usersId;
	this.password=password;
	this.onScreenName=onScreenName;
	this.tel=tel;
	this.avater=avater;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsersId() {
	return usersId;
}
public void setUsersId(String usersId) {
	this.usersId = usersId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getOnScreenName() {
	return onScreenName;
}
public void setOnScreenName(String onScreenName) {
	this.onScreenName = onScreenName;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getAvater() {
	return avater;
}
public void setAvater(String avater) {
	this.avater = avater;
}
public Set<Moment> getMoments() {
	return moments;
}
public void setMoments(Set<Moment> moments) {
	this.moments = moments;
}
public Set<Inf> getInfs() {
	return infs;
}
public void setInfs(Set<Inf> infs) {
	this.infs = infs;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}


}