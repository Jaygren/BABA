<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

           <div class="sidebar content-box" style="display: block;">
                <ul class="nav">
                    <!-- Main menu -->
                    <li><a href="user_management.action?id=${id}"><i class="glyphicon glyphicon-user"></i>用户详细信息</a></li>
                <li><a href="user_management_inf_contributions.action?id=${id}"><i class="glyphicon glyphicon-edit"></i>用户的投稿资讯</a></li>
                <li  class="submenu"><a href="#"><i class="glyphicon glyphicon glyphicon-comment"></i>问答平台数据<span class="caret pull-right"></span></a>
                    <ul>
                            <li><a href="user_management_answer.action?id=${id}">用户的回答</a></li>
                            <li><a href="user_management_issue.action?id=${id}">用户的提问</a></li>
                            <li><a href="user_management_comment.action?id=${id}"/>用户的评论</a></li>
                    </ul>
                </li>
                <li class="current"><a href="user_managment_moment.action?id=${id}"><i class="glyphicon glyphicon glyphicon-picture"></i>用户的分享照片</a></li>
                <li class="submenu"><a href="#"><i class="glyphicon glyphicon-pencil"></i>用户的旅行计划<span class="caret pull-right"></span></a>
                    <ul>
                            <li><a href="#">用户的提出计划</a></li>
                            <li><a href="#">用户的参与计划</a></li>
                    </ul>
                </li>
                </ul>
             </div>
