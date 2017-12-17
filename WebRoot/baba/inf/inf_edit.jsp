<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <!-- Standard Meta -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

  <!-- Site Properties -->
  <title>inf_edit</title>

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
  <form action="inf_edit.action" id="infedit" namespace="/baba/inf" method="post">
    <div class="ui three column grid">
      <div class="two wide column"></div>
      <div class="twelve wide column">
        <div class="ui huge header">写下你的想法</div>
        
        <div class="ui form">
          <div class="field">
            <label>标题</label>
            <input type="text" name="inf.title">
            <input type="hidden" name="inf.user.id" value="2">
            <label>简介</label>
            <input type="text" name="inf.description">
          </div>
          <div class="field">
            <label>内容</label>
    <!-- 配置文件 -->
    <script type="text/javascript" src="../../plugin/ueditor/ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="../../plugin/ueditor/ueditor.all.js"></script>
    <!-- 实例化编辑器 -->
    <script type="text/javascript">
       var ue = UE.getEditor('container',{
        initialFrameHeight:400,
        initialFrameWidth:850,
        maximumWords:8000,
        autoHeightEnabled:false,
        allowDivTransToP: false
       });
    </script>
      <!-- 加载编辑器的容器 -->
    <script id="container" name="inf.content" type="text/plain">
    </script>
          </div>
          <div class="field">
            <div class="ui animated fade button" style="background-color:#1ABC9C;color:#FFFFFF;" tabindex="0">
              <div class="visible content">好了</div>
              <div class="hidden content" onclick="document.getElementById('infedit').submit()">投稿！</div>
            </div>
          </div>
        </div>
      </div>
      <div class="two wide column"></div>
    </div>
    </form>
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

