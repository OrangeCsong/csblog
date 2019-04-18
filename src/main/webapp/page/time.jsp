<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>时间轴</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/time.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/m_v2.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/jquery.min.js" ></script>
<script src="${pageContext.request.contextPath}/js/scrollReveal.js"></script>
<script src="${pageContext.request.contextPath}/js/time.js" ></script>
<!--[if lt IE 9]>
<script src="js/modernizr.js"></script>
<![endif]-->
</head>
<body>
<%@ include file="top.jsp" %>
<article>
  <div class="timebox">
    <ul>
        <c:forEach var="blog" items="${blogs}">
            <li><span>${blog.time}</span><i><a href="${pageContext.request.contextPath}/find/${blog.id}.html" target="_blank">${blog.title}</a></i></li>
        </c:forEach>
    </ul>
  </div>
</article>
<a href="#" class="cd-top">Top</a>
</body>
</html>
