<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="baidu-site-verification" content="Eg9tVrHSEK" />
<title>首页:一个在Java道路上的爬行的码农</title>
<link rel="shortcut icon"
  href="${pageContext.request.contextPath}/images/favicon.ico">
<meta name="keywords" content="个人博客,陈松个人博客,陈松" />
<meta name="description" content="陈松个人博客，是一个在Java道路上的爬行的码农" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="${pageContext.request.contextPath}/css/animate.css"
  rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/loaders.css"
  rel="stylesheet">
<link
  href="${pageContext.request.contextPath}/css/plugins/sweetalert/sweetalert.css"
  rel="stylesheet">

<style type="text/css">
.loader-inner>div {
  background-color: #907f819e
}
</style>
</head>
<body
  style="background:url(${pageContext.request.contextPath}/images/bj.png) repeat top left scroll;z-index:-2">
  <%@ include file="top.jsp"%>
  <article style="opacity:0">
    <div class="lbox ">
      <div class="banbox">
        <div class="banner">
          <div id="banner" class="fader">
            <li class="slide" style=" "><a
              href="javascript:void(0)" target="_blank"><img
                src="${pageContext.request.contextPath}/images/q1.jpg"></a></li>

            <li class="slide" style=" "><a
              href="javascript:void(0)"
              target="_blank"><img
                src="${pageContext.request.contextPath}/images/q2.jpg"></a></li>

            <li class="slide" style=""><a
              href="javascript:void(0)" target="_blank"><img
                src="${pageContext.request.contextPath}/images/q3.jpg"></a></li>
            <div class="fader_controls">
              <div class="pic_page prev" data-target="prev"></div>
              <div class="pic_page next" data-target="next"></div>
              <ul class="pager_list">

              </ul>
            </div>
          </div>
        </div>
      </div>
      <div class="headline">
        <ul>
          <li><a href="find/20400.html"
            title="【2019,我毕业了】回首大学四年"><img
              src="${pageContext.request.contextPath}/images/nav1.jpg"><span>【2019,我毕业了】<br> 回首大学四年 </span></a></li>
          <li><a href="find/19873.html"
            title="【匆匆校园招聘季】总结校招经历的这几个月…"><img
              src="${pageContext.request.contextPath}/images/nav2.jpg"><span>【匆匆校园招聘季】<br>总结校招经历的这几个月</span></a></li>
        </ul>
      </div>

      <div class="clearblank"></div>

      <div class="tab_box whitebg">

        <div class="tab_buttons">
          <ul>
            <li class=""></li>
            <li class=""></li>
          </ul>
        </div>
        <div class="newstab">
          
        </div>
      </div>

      <div class="zhuanti whitebg">
        <h2 class="htitle">特别推荐</h2>
        <ul class="animated ">

        </ul>
      </div>

      <div class="newblogs bloglist whitebg animated fadeIn"
        style="display:none;animation-delay:0.3s">
        <h2 class="htitle">最新文章</h2>
        <ul class="animated ">

        </ul>
        <p class="page" style='display:none'>
        <p>
        <p class="pageMin">
        <p>
      </div>
    </div>

    <div class="rbox">
      <div class="card">
        <h2>个人名片</h2>
        <p>座右铭：你尽管try,我都catch | csblog</p>
        <p>职业：男程序员，Java研发工程师</p>
        <p>家乡：江西省-抚州市</p>
        <p>Email：orangecsong@163.com</p>
        <ul class="linkmore">
          <li><a href="47.106.148.234/csblog" target="_blank"
            class="iconfont icon-zhuye" title="网站主页"></a></li>
          <li><a
            href="http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&email=-MTIxcrLz8jMyLyNjdKfk5E"
            target="_blank" class="iconfont icon-youxiang" title="我的邮箱"></a></li>
          <li><a
            href="http://wpa.qq.com/msgrd?v=3&uin=2822739876&site=qq&menu=yes"
            target="_blank" class="iconfont icon---" title="QQ联系我"></a></li>
          <li id="weixin"><a href="javascript:void(0)" target="_blank"
            class="iconfont icon-weixin" title="关注我的微信"></a><i><img
              src="${pageContext.request.contextPath}/images/my_vx.jpg"></i></li>
        </ul>
      </div>

    <div class="whitebg notice">
      <h2 class="htitle">热门文章</h2>
      <ul>
      
     </ul>
    </div>

      <div class="dj paihang animated fadeIn"
        style="animation-delay:0.3s">
        <h2 class="htitle">点击排行</h2>
        <ul class="">

        </ul>
      </div>
      <div class="weixin whitebg animated fadeIn"
        style="display:none;animation-delay:0.3s">
        <h2 class="htitle">微信号</h2>
        <ul class="animated fadeIn">
          <img src="${pageContext.request.contextPath}/images/my_vx.jpg">
        </ul>
      </div>
      <div class="link links whitebg animated fadeIn"
        style="display:none;animation-delay:0.3s">
        <h2 class="htitle">友情链接</h2>
        <ul class="animated fadeIn">

        </ul>
        <div class="msg"
          style="clear: both;text-align: center;margin: 25px 0px 15px;">
          <a href="javascript:void(0)"></a>
        </div>
      </div>

      <div class="guanzhu gd whitebg animated fadeIn"
        style="display:none" id="follow-us">
        <h2 class="cloud_hometitle">关注一下</h2>
        <ul>
          <li class="qq"><a href="javascript:void(0)"
            target="_blank"><span>QQ号</span>2822739876</a></li>
          <li class="email"><a href="javascript:void(0)"
            target="_blank"><span>邮箱帐号</span>orangecsong@163.com</a></li>
          <li class="wxgzh"><a href="javascript:void(0)"
            target="_blank"><span>微信号</span>cs-fighting-WN</a></li>
        </ul>
      </div>
    </div>
    <a href="#" class="top cd-top animated ">Top</a>
  </article>
  <!-- 全局js -->
  <script src="${pageContext.request.contextPath}/js/page/index.js"></script>
  <script src="${pageContext.request.contextPath}/js/layer/layer.js"></script>
  <script
    src="${pageContext.request.contextPath}/js/plugins/sweetalert/sweetalert.min.js"></script>
</body>

</html>
