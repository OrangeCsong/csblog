<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>列表页_个人博客 - 一个在Java道路上的技术员个人博客网站</title>
<link rel="shortcut icon"
  href="${pageContext.request.contextPath}/images/favicon.ico">
<meta name="keywords" content="个人博客,csblog个人博客,csblog" />
<meta name="description" content="csblog个人博客，是一个在Java道路上的技术员个人博客网站" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="${pageContext.request.contextPath}/css/style.css"
  rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/animate.css"
  rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/loaders.css"
  rel="stylesheet">

<style type="text/css">
.loader-inner>div {
  background-color: #907f819e
}

.whitebg {
  background: #fff;
  border-radius: 3px;
  padding: 20px;
  margin-bottom: 20px;
  overflow: hidden;
}

.lanmu img {
  height: 100px;
  float: left;
  margin-right: 20px;
}

.lanmu h1 {
  font-size: 22px;
  margin-bottom: 15px;
}

.lanmu p {
  color: #666;
}
</style>
</head>
<body
  style="background:url(${pageContext.request.contextPath}/images/bj.png) repeat top left scroll">
  <%@ include file="top.jsp"%>
  <article>
    <div class="lbox">
      <div class="whitebg lanmu">
        <img src="${pageContext.request.contextPath}/images/lm01.jpg">
        <h1>个人日记</h1>
        <p>个人博客日记，我想，你并没有忘记当初建立个人博客的初衷吧！记录生活中一些小事;记录学习中一些笔记;以及分享一些资源。最后再次感谢您，来到我的个人博客，你，我生命中一个重要的过客，我们之所以是过客，因为你未曾会为我停留。</p>
      </div>
      <div class="newblogs bloglist">
        <h2 class="hometitle">
          <span class="tagTitle"> </span>技术专栏
        </h2>
        <ul>

        </ul>
        <p class="page" style='display:none'>
        <p>
        <p class="pageMin">
        <p>
      </div>
    </div>
    <div class="rbox">
    <input name="keyword" id="keyword" value="${keyword}"
          type="hidden">
      <div class="cloud animated fadeIn whitebg">
        <h2 class="cloud_hometitle">标签云</h2>
        <ul>

        </ul>
      </div>
      <div class="tuijian2  animated fadeIn whitebg">
        <h2 class="cloud_hometitle">推荐文章</h2>
        <ul class="tjpic animated fadeIn">
          <i><img src="${pageContext.request.contextPath}/images/t03.jpg"></i>
        </ul>
        <ul class="sidenews">

        </ul>
      </div>

      <div class="djpaihang dj whitebg dianji animated fadeIn"
        style="display:none;animation-delay:0.3s">
        <h2 class="cloud_hometitle">点击排行</h2>
        <ul class="click">

        </ul>

      </div>
      <div class="guanzhu gd whitebg animated fadeIn" style="display:none"
        id="follow-us">
        <h2 class="cloud_hometitle">联系我</h2>
        <ul>
          <li class="qq"><a href="javascript:void(0)"><span>QQ号</span>2822739876</a></li>
          <li class="email"><a href="javascript:void(0)"><span>邮箱帐号</span>orangecsong@163.com</a></li>
          <li class="wxgzh"><a href="javascript:void(0)"><span>微信号</span>cs-fighting-WN</a></li>
        </ul>
      </div>
    </div>
    <a href="#" class="top cd-top animated ">Top</a>
  </article>
  <%@ include file="fonter.jsp" %>
  <script src="${pageContext.request.contextPath}/js/page/list.js"></script>
  <script src="${pageContext.request.contextPath}/js/layer/layer.js"></script>
</body>
</html>
