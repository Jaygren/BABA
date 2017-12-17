package com.BABA.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Namespace("/baba/inf")
@ParentPackage("basicstruts")
@Results(
		{
		/*前台 系统跳转 */
			/*资讯信息*/
		   @Result(name="inf_list",location="/baba/inf/inf_list.jsp"),
		   @Result(name="inf_edit_detail",location="/baba/inf/inf_edit.jsp"),
		   @Result(name="inf_edit",type="redirectAction",location="inf_list.action"),
		   @Result(name="inf_detail",location="/baba/inf/inf_detail.jsp")
		})
public class Action4BabaResult extends Action4Parameter{

}
