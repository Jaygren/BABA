<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <!-- Standard Meta -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

  <!-- Site Properties -->
  <title>inf_list</title>

  <link rel="stylesheet" type="text/css" href="../dist/components/reset.css">
  <link rel="stylesheet" type="text/css" href="../dist/components/site.css">
  <link rel="stylesheet" type="text/css" href="../dist/components/container.css">
  <link rel="stylesheet" type="text/css" href="../dist/components/menu.css">
  <link rel="stylesheet" type="text/css" href="../dist/components/dropdown.css">
  <link rel="stylesheet" type="text/css" href="../dist/components/transition.css">
  <link rel="stylesheet" type="text/css" href="../dist/components/icon.css">
  <link rel="stylesheet" type="text/css" href="../dist/semantic.css">
  <link rel="stylesheet" type="text/css" href="../dist/components/icon.css">
  <script src="../dist/jquery.min.js"></script>
  <script src="../dist/components/transition.js"></script>
  <script src="../dist/components/visibility.js"></script>
  <script src="../dist/components/dropdown.js"></script>

<script>
  $(document)
    .ready(function() {

      // fix main menu to page on passing
      $('.main.menu').visibility({
        type: 'fixed'
      });

      // show dropdown on hover
      $('.main.menu  .ui.dropdown').dropdown({
        on: 'hover'
      });
      
    })
  ;
</script>

<style type="text/css">

  body {
    background-color: #FFFFFF;
  }
  .main.container {
    margin-top: 1em;
  }

  .main.menu {
    margin-top: 1em;
    border-radius: 0;
    border: none;
    box-shadow: none;
    transition:
      box-shadow 0.5s ease,
      padding 0.5s ease
    ;
  }
  .main.menu .item img.logo {
    margin-right: 1.5em;
  }

  .main.menu.fixed {
    background-color: #ffffff;
    border: 1px solid #DDD;
    box-shadow: 0px 3px 5px rgba(0, 0, 0, 0.2);
  }
  .ui.footer.segment {
    margin: 5em 0em 0em;
    padding: 5em 0em;
  }
</style>

</head>
<body>
  <br>
  <div class="ui borderless main menu">
    <div class="ui text container">
      <div href="#" class="header item">
        <img class="logo" src="../images/baba.png">
        蹦跶蹦跶BABA
      </div>
      <a href="#" class="item">INF</a>
      <a href="#" class="item">ISSUE</a>
      <a href="#" class="item">PLAN</a>
      <a href="#" class="item">MOMENT</a>
      <a href="#" class="ui right floated dropdown item">
        <img src="../images/rachel.png" class="ui avatar image"/>
        <i class="dropdown icon"></i>
        <div class="menu">
          <div class="item">Personal</div>
          <div class="item">Message</div>
          <div class="divider"></div>
          <div class="header">ACTION</div>
          <div class="item">Log out</div>
        </div>
      </a>
    </div>
  </div>
  <div class="ui container">
  <div class="ui two column grid">
      <div class="four wide column">
        <br>
        <br>
        <div class="ui header">Popular Destination for Tourists</div>
        <i class="red marker large icon"></i>
        <div class="ui middle aligned divided list">
          <div class="item">
            <div class="header">New York City</div>A lovely city </div>
          <div class="item">
            <div class="header">Chicago</div>同样也是一个可爱的城市 </div>
          <div class="item">
            <div class="header">Los Angeles</div>有时候是个可爱的城市 </div>
          <div class="item">
            <div class="header">San Francisco</div>充满爱的城市 </div>
        </div>
        <br>
        <div class="row">
          <a href="inf_edit_detail.action" target="_blank">
            <div class="ui animated fade button" style="background-color:#1ABC9C;color:#FFFFFF;" tabindex="0">
              <div class="visible content">想分享您的旅游想法吗？</div>
              <div class="hidden content">点击立刻写下来</div>
            </div>
          </a>
        </div>
      </div>
      <div class="twelve wide column">
      <div class="ui huge header">Latest Inf</div>
      <div class="ui relaxed divided items">
      
        <s:iterator value="infs" var="inf">
        <div class="item">
          <div class="ui small image">
            <img src="../images/image.png">
          </div>
          <div class="content">
            <a href="inf_detail.action?id=<s:property value="#inf.id"/>" class="header"><s:property value="#inf.title"/></a>
            <div class="meta">
             <s:date name="#inf.date" format="yyyy-MM-dd"/>
            </div>
            <div class="description">
             <s:property value="#inf.description"/>
            </div>
            <div class="extra">
              <img src="../images/square-image.png" class="ui circular avatar image"> <s:property value="#inf.user.onScreenName"/>
              &nbsp; <i class="like icon"></i><s:property value="#inf.likes"/> Likes
            </div>
          </div>
        </div>
        </s:iterator>
      </div>
      <div>页面导航位置</div>
    </div>
  </div>
 </div>
<div class="ui inverted vertical footer segment">
  <div class="ui center aligned container">
    <img src="../images/baba.png" class="ui centered mini image">
    <div class="ui horizontal inverted small divided link list">
      <a class="item" href="#">Contact Us</a>
      <a class="item" href="#">Privacy Policy</a>
    </div>
  </div>
</div>
</body>
</html>