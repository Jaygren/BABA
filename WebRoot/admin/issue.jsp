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
					<div class="panel-title">问答平台数据管理</div>
					<div class="panel-options">
						<a href="#" data-rel="collapse"><i class="glyphicon glyphicon-refresh"></i></a>
					</div>
				</div>
  				<div class="panel-body">
  					<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example">
						<thead>
				                <tr>
				                  <th>#</th>
				                  <th>问题</th>
				                  <th>提问用户ID</th>
                          <th>回答数</th>
				                  <th>日期</th>
				                  <th>操作</th>
				                </tr>
				              </thead>
				              <tbody>
				         <s:iterator value="issue_details" var="i_d" status="stu">  
				                <tr>
				                  <td><s:property value="#stu.count"/></td>
                          <td><a><s:property value="#i_d.title"/></a></td>
				                  <td><a href="user_management.html"><s:property value="#i_d.user.usersId"/></a></td>
				                  <td>${i_d.answers.size()}</td>
				                  <td><s:date name="#i_d.date" format="yyyy-MM-dd  hh:mm:ss"/></td>	
				                  <td>
				                  	<div class="btn-group">

					                    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown">管理
					                    	<span class="caret"></span>
					                    	<span class="sr-only">Toggle Dropdown</span>
					                    </button>
					                    <ul class="dropdown-menu" role="menu">
					                      <li><a href="#">删除</a></li>
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
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.js"></script>
    <!-- jQuery UI -->
    <script src="js/jquery-ui.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>

    <script src="js/jquery.dataTables.min.js"></script>

    <script src="js/dataTables.bootstrap.js"></script>

    <script src="js/custom.js"></script>
    <script src="js/tables.js"></script>
</body>
</html>
