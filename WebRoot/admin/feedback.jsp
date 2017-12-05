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
					<div class="panel-title">举报/反馈</div>
					<div class="panel-options">
								<a href="#" data-rel="collapse"><i class="glyphicon glyphicon-refresh"></i></a>
							</div>
				</div>
  				<div class="panel-body">
  					<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example">
						<thead>
				                <tr>
				                  <th>#</th>
				                  <th>举报/反馈模块</th>
				                  <th>举报/反馈原因</th>
				                  <th>举报者ID</th>
				                  <th>举报/反馈日期</th>
				                  <th>状态</th>
				                </tr>
				              </thead>
				              <tbody>
				               <s:iterator value="feedbacks" var="fb" status="stu">
				                <tr>
				                  <td><s:property value="#stu.count"/></td>
				                  <s:if test="#fb.table_from=='Inf'">
				                  <td>资讯反馈</td>
				                  </s:if>
				                  <s:else>
				                  <td>问答举报</td>
				                  </s:else>
				                  <s:if test="#fb.state=='已处理'">
				                  <td><a href="feedback_result.action?id=<s:property value="#fb.id"/>" target="_blank"><s:property value="#fb.title"/></a></td>
				                  <td><s:property value="#fb.user.usersId"/></td>
				                  <td><s:date name="#fb.date" format="yyyy-MM-dd  hh:mm:ss"/></td>	
				                  <td>已处理</td>
				                  </s:if>
				                  <s:else>
				                  <td><a href="feedback_details.action?id=<s:property value="#fb.id"/>" target="_blank"><s:property value="#fb.title"/></a></td>
				                  <td><s:property value="#fb.user.usersId"/></td>
				                  <td><s:date name="#fb.date" format="yyyy-MM-dd  hh:mm:ss"/></td>	
				                  <td style="color:red;">未处理</td>
				                  </s:else>
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