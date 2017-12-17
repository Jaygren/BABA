package com.BABA.action.admin;
import org.apache.struts2.convention.annotation.Action;

import com.BABA.action.Action4Result;

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
@Action("delete_inf")
public String delete_inf(){
    inf=baseService.infDao().get(id);
    baseService.infDao().delete(inf);
    if(type==1)
	    return "delete_inf1";
    else if (type==2)
    	return "delete_inf2";
    else if (type==3)
    	return "delete_inf3";
    else
    	return "delete_inf4";
}
@Action("modify_inf_state")
public String modify_inf_state(){
    inf=baseService.infDao().get(id);
    if(type==1){
    	inf.setState("下架");
    	baseService.infDao().update(inf);
        return 	"modify_inf_state1";
    }else if(type==2){
    	inf.setState("发布");
    	baseService.infDao().update(inf);
    	return "modify_inf_state2";	
    }else{
    	inf.setState("待发布");
    	baseService.infDao().update(inf);
    	return "modify_inf_state3";	
    }
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
@Action("delete_moment")
public String delete_moment(){
	moment=baseService.momentDao().get(id);
    baseService.momentDao().delete(moment);
    if(type==1){
    	return "delete_moment1";
    }
	return "delete_moment";
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
@Action("feedback_details_operation")
public String feedback_details_operation(){
    feedback=baseService.feedbackDao().get(id);
    feedback.setState("已处理");
    System.out.println(feedback.getState());
    baseService.feedbackDao().update(feedback);
    if(type==1)
    	return "delete_inf1";
    else if (type==2) {
        inf=baseService.infDao().get(feedback.getInf().getId());
    	inf.setState("下架");
        baseService.infDao().update(inf);
    	return "modify_inf_state1";}
	return null;
}
}
