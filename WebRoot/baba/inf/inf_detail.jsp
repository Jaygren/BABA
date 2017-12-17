<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
  <!-- Standard Meta -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

  <!-- Site Properties -->
  <title>inf_detail</title>

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
  <script src="../dist/semantic.js"></script>
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
  .ui.breadcrumb a{
    color:#1ABC9C;
  }
  img {
 max-width: 70%; /*图片自适应宽度*/
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
  <br>
  <div class="ui text container">
    <div class="ui large breadcrumb">
      <a class="section">INF</a>
      <i class="right chevron icon divider"></i>
      <div class="active section"><s:property value="inf.title"/></div>
    </div>
  </div>
  <br>
<div class="ui container">
    <div class="ui two column grid">
      <div class="one wide column"></div>
      <div class="fifteen wide column">
        <div class="row">
          <center>
            <div class="ui huge header"><s:property value="inf.title"/></div>
            <div class="extra" style="color:grey;">
              <img src="../images/eve.png" class="ui circular avatar image"><s:property value="inf.user.onScreenName"/>
              &nbsp;
             <s:date name="inf.date" format="yyyy-MM-dd"/>
            </div>
          </center>
        </div>
        <br>
        <div class="row">
          <div class="ui text container,img">
            ${inf.content}
          </div>
        </div>
        <br>
        <br>
        <div class="row">
          <center>
            <div class="ui labeled button" tabindex="0">
              <div class="ui red button"><i class="heart icon"></i> Like </div>
              <a class="ui basic red left pointing label">
               <s:property value="inf.likes"/>
              </a>
            </div>
          </center>
        </div>
        <br>
        <h4 class="ui horizontal divider header">
          <i class="comment icon"></i>
          Suggestion
        </h4>
        <div class="ui form">
          <div class="ui text container">
            <label>意见或建议</label>
            <form>
            <textarea></textarea>
            <br>
            <br>
            <button class="ui button" type="submit">提交</button>
            </form>
          </div>
        </div>
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
