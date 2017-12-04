<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>蹦跶蹦跶BABA后台系统</title>
    <%@ include file="BaseModel/BasePath.jsp"%>
  </head>
  <body>
    <%@ include file="BaseModel/FeedbackHead.jsp"%>
    <div class="page-content">
    	<div class="row">
    		<div class="col-md-5">
        		<div class="content-box-large">
  				<div class="panel-heading">
					<div class="panel-title">举报/反馈详细情况</div>
				</div>
  				<div class="panel-body">
  					<table class="table table-bordered table-striped" style="clear: both">
  						<tbody> 
							<tr>         
							<td width="35%">举报/反馈模块</td>
							<td width="65%">资讯反馈</td>
							</tr>
							<tr>         
							<td>举报/反馈用户ID</td>
							<td><a href="#" data-type="text"  class="editable editable-click editable-empty">1540129502</a></td>
							</tr>
							<tr>         
							<td>被举报/反馈对象</td>
							<td><a href="#" data-type="text" class="editable editable-click editable-empty">XXX资讯</a>
              </td>
              </tr>
              <tr>         
              <td>被举报/反馈原因</td>
              <td>不实信息</td>
              </tr>   
							<tr>         
							<td>被举报/反馈详细说明</td>
							<td>不是！没有！不存在！别瞎说！…………………………………………………………</td>
							</tr>    
							                                 
						</tbody>
  					</table>
  				</div>
  				</div>
  			</div>
  		    <div class="col-md-7">
        		<div class="content-box-large">
  				<div class="panel-heading">
					<div class="panel-title">如果是资讯的执行处理暂时想到这样，其他的还没想</div>
				</div>
  				<div class="panel-body">
            <form class="form-horizontal" action="">
              <div class="form-group">
                      <label class="col-md-2 control-label" for="select-1">处理回应</label>
                      <div class="col-md-10">
      
                        <select class="form-control" id="select-1">
                          <option>已删除该资讯，感谢您的反馈</option>
                          <option>已下架该资讯，等待内容核实工作，感谢您的反馈</option>
                          <option>已将该资讯内容进行修改，感谢您的反馈</option>
                          <option>反正这些官方回复以后再想过</option>
                        </select> 
                      </div>
                    </div>
              <div class="form-group">
                      <label class="col-md-2 control-label">补充说明</label>
                      <div class="col-md-10">
                        <textarea class="form-control" placeholder="这些东西都是发给举报人的对吧？那其他的模块中要通知被举报人又是什么操作？" rows="4"></textarea>
                      </div>
              </div>
              <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary">确认</button>
                  </div>
              </div>
            </form>
  				</div>
  			</div>
  		</div>
    	</div>
    </div>
</body>
</html>