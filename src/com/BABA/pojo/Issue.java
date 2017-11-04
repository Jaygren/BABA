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
@Table(name="baba_Issue")
public class Issue implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(unique=true)
private int id;	
@OneToMany(mappedBy="issue",cascade={CascadeType.REMOVE,CascadeType.MERGE,CascadeType.REFRESH},fetch=FetchType.EAGER,targetEntity=Issue_detail.class)
private Set<Issue_detail>issue_details=new HashSet<Issue_detail>();
public Issue(){}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Set<Issue_detail> getIssue_details() {
	return issue_details;
}
public void setIssue_details(Set<Issue_detail> issue_details) {
	this.issue_details = issue_details;
}


}
