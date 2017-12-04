<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
    <div class="sidebar content-box" style="display: block;">
                <ul class="nav">
                    <!-- Main menu -->
                    <li class="current"><a href="index.jsp"><i class="glyphicon glyphicon-home"></i> Dashboard</a></li>
                <li>
                <a href="user_list.action"><i class="glyphicon glyphicon-user"></i>用户数据管理</a>
                </li>
                                <li  class="submenu">
                                <a href="#"><i class="glyphicon glyphicon glyphicon-edit"></i>资讯模块管理 <span class="caret pull-right"></span></a>
                <ul>
                            <li><a href="inf_publishing.action">发布中资讯</a></li>
                            <li><a href="inf_toBePublished.action">待发布资讯</a></li>
                            <li><a href="inf_contributions.action">最新投稿资讯</a></li>
                            <li><a href="inf_rectification.action">已下架资讯</a></li>
                        </ul></li>
                <li><a href="issue.action"><i class="glyphicon glyphicon-comment"></i>问答平台数据管理</a></li>
                
                <li><a href="moment.action"><i class="glyphicon glyphicon-picture"></i>分享模块管理</a></li>
                <li><a href="#"><i class="glyphicon glyphicon-pencil"></i>计划模块管理</a></li>
                <li><a href="feedback.action"><i class="glyphicon glyphicon-envelope"></i>举报反馈模块</a></li>
                </ul>
    </div>
