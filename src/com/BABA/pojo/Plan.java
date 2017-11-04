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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="baba_Plan")
public class Plan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=15)
	private String state;
	private String title;
	@Column(nullable=true)
	private Integer likes;
	@ManyToOne(targetEntity=Users.class,fetch=FetchType.LAZY)
	@JoinColumn(name="user_id",nullable=true)
	private Users user;
	@OneToOne(mappedBy="plan",cascade={CascadeType.REMOVE,CascadeType.MERGE,CascadeType.REFRESH},fetch=FetchType.EAGER,targetEntity=Plan_detail.class)
	private Plan_detail plan_detail;
	@OneToMany(mappedBy="plan",cascade={CascadeType.REMOVE,CascadeType.MERGE,CascadeType.REFRESH},fetch=FetchType.EAGER,targetEntity=Answer.class)
	private Set<Answer> answers=new HashSet<Answer>();
	public Plan(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Plan_detail getPlan_detail() {
		return plan_detail;
	}
	public void setPlan_detail(Plan_detail plan_detail) {
		this.plan_detail = plan_detail;
	}
	public Set<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
	
}
