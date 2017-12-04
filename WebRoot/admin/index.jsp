<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
        </div>
    </div>
  </body>
</html>
