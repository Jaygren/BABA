package com.BABA.action.admin;

import org.apache.struts2.convention.annotation.Action;

import com.BABA.action.Action4Result;

public class AdminUserAction extends Action4Result{
	@Action("user_management")
	public String user_management(){
		user=baseService.usersDao().get(id);
		return "user_management";
	}
	@Action("user_management_inf_contributions")
	public String user_management_inf_contributions(){
		infs=baseService.infDao().list(id);
		return "user_management_inf_contributions";
	}
	@Action("user_management_answer")
	public String user_management_answer(){
		answers=baseService.answerDao().listAnswers4Issue(id);
		return "user_management_answer";
	}
	@Action("user_management_issue")
	public String user_management_issue(){
		issue_details=baseService.issue_detailDao().list(id);
		return "user_management_issue";
	}
	@Action("user_management_comment")
	public String user_management_comment(){
		answers=baseService.answerDao().listAnswers4Comment(id);
		return "user_management_comment";
	}
	@Action("user_managment_moment")
	public String user_managment_moment(){
		moments=baseService.momentDao().list(id);
		return "user_managment_moment";
	}
}
