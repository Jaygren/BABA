<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>蹦跶蹦跶BABA后台系统</title>
    <%@ include file="BaseModel/BasePath.jsp"%>
  </head>
  <body>
    <%@ include file="BaseModel/FeedbackHead.jsp"%>
    <div class="page-content">
    	<div class="row">
    		<div class="col-md-7">
        		<div class="content-box-large">
  				<div class="panel-heading">
					<div class="panel-title">举报/反馈详细情况</div>
				</div>
  				<div class="panel-body">
  					<table class="table table-bordered table-striped" style="clear: both">
  						<tbody> 
							<tr>         
							<td width="35%">举报/反馈模块</td>
							<s:if test='feedback.table_from == "Inf"'>
							<td width="65%">资讯反馈</td>	
							</s:if>
							<s:else>
							<td width="65%">问答举报</td>	
							</s:else>
							</tr>
							<tr>         
							<td>举报/反馈用户ID</td>
							<td><a href="#" data-type="text"  class="editable editable-click editable-empty"><s:property value="feedback.user.usersId"/></a></td>
							</tr>
							<tr>         
							<td>被举报/反馈对象</td>
							<s:if test='feedback.table_from == "Inf"'>
							    <s:if test="feedback.inf.id ==null">
							    <td>目标已删除</td>
							    </s:if>
							    <s:else>
							<td><a href="#" data-type="text" class="editable editable-click editable-empty"><s:property value="feedback.inf.title"/></a>
              </td>
                                </s:else>
                             </s:if>
                             <s:else>
                            <s:if test="feedback.issue.id ==null">
							    <td>目标已删除</td>
							</s:if>
							 <s:else>
                            <td><a href="#" data-type="text" class="editable editable-click editable-empty"><s:property value="feedback.issue_detail.title"/></a>
              </td>
                            </s:else>
                            </s:else>
              </tr>
              <tr>         
              <td>被举报/反馈原因</td>
              <td><s:property value="feedback.title"/></td>
              </tr>
							<tr>
							<td>被举报/反馈详细说明</td>
							<td><s:property value="feedback.content"/></td>
							</tr>
						</tbody>
  					</table>
  				</div>
          <div class="panel-heading">
          <div class="panel-title">处理说明</div>
        </div>
          <div class="panel-body">
            <table class="table table-bordered table-striped" style="clear: both">
              <tbody> 
              <tr>         
              <td width="35%">处理回应</td>  
             <s:if test='feedback.table_from == "Inf"'>
					<s:if test="feedback.inf.id ==null">
				    <td width="65%">已删除该咨询</td>
				    </s:if>
				    <s:else>
				    <td width="65%">已下架该咨询</td>
                    </s:else>
              </s:if>
              <s:else>
	     		    <td width="65%">已删除该问题</td>
			  </s:else>
              </tr>
              <tr>         
              <td>补充说明</td>
              <td></td>
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