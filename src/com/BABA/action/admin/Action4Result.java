package com.BABA.action.admin;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Namespace("/admin")
@ParentPackage("basicstruts")
@Results(
		{
		/*后台 系统跳转 */
		@Result(name="user_list",location="/admin/user_list.jsp"),
		@Result(name="issue",location="/admin/issue.jsp"),
		@Result(name="moment",location="/admin/moment.jsp"),
		@Result(name="feedback",location="/admin/feedback.jsp"),
		     /*咨询跳转*/
		     @Result(name="inf_publishing",location="/admin/inf_publishing.jsp"),
      		 @Result(name="inf_toBePublished",location="/admin/inf_toBePublished.jsp"),
      		 @Result(name="inf_contributions",location="/admin/inf_contributions.jsp"),
      		 @Result(name="inf_rectification",location="/admin/inf_rectification.jsp"),
      		/*用户跳转*/
      		 @Result(name="user_management",location="/admin/user_management.jsp"),
      		 @Result(name="user_management_inf_contributions",location="/admin/user_management_inf_contributions.jsp"),
      		 @Result(name="user_management_answer",location="/admin/user_management_answer.jsp"),
      		 @Result(name="user_management_issue",location="/admin/user_management_issue.jsp"),
      		 @Result(name="user_management_comment",location="/admin/user_management_comment.jsp"),
      		 @Result(name="user_managment_moment",location="/admin/user_managment_moment.jsp"),
            /*反馈跳转*/
      		   /*未处理反馈*/
      		   @Result(name="feedback_details",location="/admin/feedback_details.jsp"),
      		   /*已处理反馈*/
      		   @Result(name="feedback_result",location="/admin/feedback_result.jsp"),
		/*用户操作*/
		@Result(name="delete_user",type="redirectAction",location="user_list.action"),
		@Result(name="modify_user_state",type="redirectAction",location="user_list.action")
		})
public class Action4Result extends Action4Parameter{

}
