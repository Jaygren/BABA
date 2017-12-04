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
                        <div class="panel-title">用户的投稿资讯</div>
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
                                  <th>投稿日期</th>
                                  <th>状态</th>
                                  <th>操作</th>
                                </tr>
                              </thead>
                              <tbody>
                               <s:iterator value="infs" var="inf" status="stu">
                                <tr>
                                  <td><s:property value="#stu.count"/></td>
                                  <td><s:property value="#inf.title"/></a></td>
                                  <td><s:date name="#inf.date" format="yyyy-MM-dd  hh:mm:ss"/></td>	
                                   <s:if test="#inf.state=='未采纳'">
                                   <td>并没有采纳</td>
                                  </s:if>
                                  <s:elseif test="#inf.state=='投稿'">
                                  <td>投稿</td>
                                  </s:elseif>
                                  <s:else>
                                   <td>已采纳【<s:property value="#inf.state"/>】</td>
                                  </s:else>
                                   <td>
				                  	<div class="btn-group">
					                    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown">管理			                      
					                    	<span class="caret"></span>
					                    	<span class="sr-only">Toggle Dropdown</span>
					                    </button>
					                    <ul class="dropdown-menu" role="menu">
					                       <s:if test="#inf.state=='发布'">
					                      <li><a href="#">删除</a></li>
					                      <li><a href="#">下架整改</a></li>
					                      </s:if>
					                      <s:elseif test="#inf.state=='待发布'">
					                      <li><a href="#">删除</a></li>
					                      <li><a href="#">发布</a></li>
					                      </s:elseif>
					                      <s:elseif test="#inf.state=='投稿'">
					                      <li><a href="#">删除</a></li>
					                      <li><a href="#">待发布</a></li>
					                      </s:elseif>
					                      <s:else>
					                      <li><a href="#">删除</a></li>
					                      </s:else>
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
