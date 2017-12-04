<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>用户管理</title>
     <%@ include file="BaseModel/BasePath.jsp"%>
  </head>
  <body>
  <!--头部-->
   <%@ include file="BaseModel/UserHead.jsp"%>
    <div class="page-content">
    	<div class="row">
    		<div class="col-md-2">
		  	 <!--主菜单 -->
		  <%@ include file="BaseModel/UserMainMenu.jsp"%>
		  </div>  
            <div class="col-md-10">
            <div class="content-box-large">
                    <div class="panel-heading">
                        <div class="panel-title">用户详细信息</div>
                    </div>
                    <div class="panel-body">
                        <table class="table table-bordered table-striped" style="clear: both">
                        <tbody> 
                            <tr>         
                            <td width="35%">用户头像</td>
                            <td width="65%"><img src="../img/avater.jpg" style="width:100px;height:100px;"/></td>
                            </tr>
                            <tr>         
                            <td>用户ID</td>
                            <td><s:property value="user.usersId"/></td>
                            </tr>
                            <tr>         
                            <td>用户名</td>
                            <td><s:property value="user.onScreenName"/></td>
                            </tr>
                            <tr>         
                            <td>手机</td>
                            <td><s:property value="user.tel"/></td>
                            </tr>
                            <tr>         
                            <td>Email</td>
                            <td><s:property value="user.email"/></td>
                            </tr>
                            <tr>         
                            <td>真实姓名</td>
                            <td><s:property value="user.relName"/></td>
                            </tr>
                            <tr>
                            <td>身份证号码</td>
                            <td><s:property value="user.IDnumber"/></td>
                            </tr>
                        </tbody>
                    </table>
                    </div>
                    
    		</div>
            </div>
	</div>
	</div>
</body>
</html>
