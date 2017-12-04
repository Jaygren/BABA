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
                        <div class="panel-title">用户的评论</div>
                        <div class="panel-options">
                          <a href="#" data-rel="collapse"><i class="glyphicon glyphicon-refresh"></i></a>
                        </div>
                    </div>
                    <div class="panel-body">
                       <table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example">
                        <thead>   
                                <tr>
                                  <th>#</th>
                                  <th>内容</th>
                                  <th>评论ID</th>
                                  <th>回复ID</th>
                                  <th>日期</th>
                                  <th>来自</th>
                                </tr>
                              </thead>
                              <tbody>
                                <s:iterator value="answers" var="answer" status="stu">    
                                <tr>
                                  <td><s:property value="#stu.count"/></td>
                                  <td><s:property value="#answer.content"/></td>
                                  <td><s:property value="#answer.user.usersId"/></td>                    
                                  <td><s:property value="#answer.user2.usersId"/></td>       
                                  <td><s:date name="#answer.date" format="yyyy-MM-dd  hh:mm:ss"/></td>	
                                   <s:if test="#answer.inf.id !=''">
                                  <td><a><s:property value="#answer.inf.title"/></a></td>
                                  </s:if>
                                   <s:elseif test="#answer.issue_detail.id !=''">
                                   <td><a><s:property value="#answer.issue_detail.title"/></a></td>
                                   </s:elseif>
                                   <s:else>
                                   <td><a><s:property value="#answer.plan.title"/></a></td>
                                   </s:else>
                                </tr>
                                </s:iterator>
                              </tbody>
                            </table>
                    </div>

    		</div>
            </div>
	</div>
</body>
</html>
		  