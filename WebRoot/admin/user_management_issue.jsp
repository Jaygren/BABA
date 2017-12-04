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
                        <div class="panel-title">用户的提问</div>
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
                                  <th>日期</th>
                                  <th>操作</th>
                                </tr>
                              </thead>
                              <tbody>
                              <s:iterator value="issue_details" var="id" status="stu">
                                <tr>
                                  <td><s:property value="#stu.count"/></td>
                                  <td><a><s:property value="#id.content"/></a></td>
                                  <td><s:date name="#id.date" format="yyyy-MM-dd  hh:mm:ss"/></td>	
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
</body>
</html>