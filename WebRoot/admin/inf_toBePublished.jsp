<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>蹦跶蹦跶BABA后台系统</title>  
    <%@ include file="BaseModel/BasePath.jsp"%>
  </head>
<body>
   <!--头部-->
    <%@ include file="BaseModel/Head.jsp"%>
    <div class="page-content">
    	<div class="row">
		  <div class="col-md-2">
		   <!--主菜单 -->
		  <%@ include file="BaseModel/MainMenu.jsp"%>
		  </div>
          <div class="col-md-10">
          <div class="content-box-large">
  				<div class="panel-heading">
					<div class="panel-title">待发布资讯</div>
					<div class="panel-options">
						<a href="#" data-rel="collapse"><i class="glyphicon glyphicon-refresh"></i></a>
					</div>
				</div>
  				<div class="panel-body">
  					<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example">
						<thead>
				                <tr>
				                  <th>#</th>
				                  <th>标题</th>
				                  <th>来源</th>
				                  <th>预计发布日期</th>
				                  <th>操作</th>
				                </tr>
				              </thead>
				              <tbody>
				            <s:iterator value="infs" var="inf" status="stu">
				                <tr>
				                  <td><s:property value="#stu.count"/></td>
				                  <td><a><s:property value="#inf.title"/></a></td>
				                  <td><s:property value="#inf.user.usersId"/></td>
				                  <td><s:date name="#inf.date" format="yyyy-MM-dd  hh:mm:ss"/></td>		
				                  <td>
				                  	<div class="btn-group">

					                    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown">管理
					                    	<span class="caret"></span>
					                    	<span class="sr-only">Toggle Dropdown</span>
					                    </button>
					                    <ul class="dropdown-menu" role="menu">
					                      <li><a href="delete_inf.action?id=<s:property value="#inf.id"/>&type=2">删除</a></li>
					                      <li><a href="modify_inf_state.action?id=<s:property value="#inf.id"/>&type=2">发布</a></li>
					                    </ul>
                  					</div>
				                  </td>
				                </tr>
				              </s:iterator>
				              </tbody>
				            </table>
  				</div>
  			</div>
          </div>
          </div>
          </div>
  </body>
</html>
