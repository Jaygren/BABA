package com.BABA.action.admin;

import org.apache.struts2.convention.annotation.Action;

public class AdminBaseAction extends Action4Result{

@Action("user_list")
public String  user_list(){
	users=baseService.usersDao().list();
	return "user_list";
}
@Action("delete_user")
public String delete_user(){
    user=baseService.usersDao().get(id);
    baseService.usersDao().delete(user);
	return "delete_user";
}
@Action("modify_user_state")
public String modify_user_state(){
    user=baseService.usersDao().get(id);
    //System.out.println("用户状态："+user.getState());
    if(user.getState().equals("封号")){
    	user.setState("正常");
    	//System.out.println("现在用户状态："+user.getState());
    }else{
    	user.setState("封号");
    }
    baseService.usersDao().update(user);
	return "modify_user_state";
}
@Action("inf_publishing")
public String inf_publishing(){
	infs=baseService.infDao().listInfByState("发布");
	return "inf_publishing";
}
@Action("inf_toBePublished")
public String inf_toBePublished(){
	infs=baseService.infDao().listInfByState("待发布");
	return "inf_toBePublished";
}
@Action("inf_contributions")
public String inf_contributions(){
	infs=baseService.infDao().listInfByState("投稿");
	return "inf_contributions";
}
@Action("inf_rectification")
public String inf_rectification(){
	infs=baseService.infDao().listInfByState("下架");
	return "inf_contributions";
}
@Action("issue")
public String issue(){
	issue_details=baseService.issue_detailDao().list();
	return "issue";
}
@Action("moment")
public String moment(){
	moments=baseService.momentDao().list();
	return "moment";
}
@Action("feedback")
public String feedback(){
	feedbacks=baseService.feedbackDao().list();
	return "feedback";
}
@Action("feedback_details")
public String feedback_details(){
	feedback=baseService.feedbackDao().get(id);
	return "feedback_details";
}
@Action("feedback_result")
public String feedback_result(){
	feedback=baseService.feedbackDao().get(id);
	return "feedback_result";
}
}
