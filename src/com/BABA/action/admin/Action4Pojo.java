package com.BABA.action.admin;

import java.util.List;

import com.BABA.pojo.Answer;
import com.BABA.pojo.Feedback;
import com.BABA.pojo.Inf;
import com.BABA.pojo.Issue_detail;
import com.BABA.pojo.Moment;
import com.BABA.pojo.Users;

public class Action4Pojo {

protected Users user;

protected List<Users>users;

protected Inf inf;

protected List<Inf>infs;

protected Issue_detail issue_detail;

protected List<Issue_detail>issue_details;

protected Moment moment;

protected List<Moment>moments;

protected Feedback feedback;

protected List<Feedback>feedbacks;

protected Answer answer;

protected List<Answer>answers;

public Users getUser() {
	return user;
}

public void setUser(Users user) {
	this.user = user;
}

public List<Users> getUsers() {
	return users;
}

public void setUsers(List<Users> users) {
	this.users = users;
}

public Inf getInf() {
	return inf;
}

public void setInf(Inf inf) {
	this.inf = inf;
}

public List<Inf> getInfs() {
	return infs;
}

public void setInfs(List<Inf> infs) {
	this.infs = infs;
}

public Issue_detail getIssue_detail() {
	return issue_detail;
}

public void setIssue_detail(Issue_detail issue_detail) {
	this.issue_detail = issue_detail;
}

public List<Issue_detail> getIssue_details() {
	return issue_details;
}

public void setIssue_details(List<Issue_detail> issue_details) {
	this.issue_details = issue_details;
}

public Moment getMoment() {
	return moment;
}
public void setMoment(Moment moment) {
	this.moment = moment;
}

public List<Moment> getMoments() {
	return moments;
}

public void setMoments(List<Moment> moments) {
	this.moments = moments;
}

public Feedback getFeedback() {
	return feedback;
}

public void setFeedback(Feedback feedback) {
	this.feedback = feedback;
}

public List<Feedback> getFeedbacks() {
	return feedbacks;
}

public void setFeedbacks(List<Feedback> feedbacks) {
	this.feedbacks = feedbacks;
}

public Answer getAnswer() {
	return answer;
}

public void setAnswer(Answer answer) {
	this.answer = answer;
}

public List<Answer> getAnswers() {
	return answers;
}

public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}

}
