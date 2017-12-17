package com.BABA.action.baba;

import java.util.Date;

import org.apache.struts2.convention.annotation.Action;

import com.BABA.action.Action4BabaResult;

public class BabaInfAction extends Action4BabaResult{
@Action("inf_edit")
public String inf_edit(){
	inf.setState("投稿");
	Date now=new Date();
	inf.setDate(now);
	baseService.infDao().save(inf);
	return "inf_edit";
}
@Action("inf_edit_detail")
public String inf_edit_detail(){
	return "inf_edit_detail";
}
@Action("inf_list")
public String inf_list(){
	infs=baseService.infDao().listInfByState("发布");
	return "inf_list";
}
@Action("inf_detail")
public String inf_detail(){
	inf=baseService.infDao().get(id);
	return "inf_detail";
}
}
