<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>关于我</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/aboutv2.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/m.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/jquery.min.js" ></script>
<script src="${pageContext.request.contextPath}/js/ab.js"></script>
<!--[if lt IE 9]>
<script src="js/modernizr.js"></script>
<![endif]-->
    <script>
        $(function(){
            $("#btn").click(function(){
               $("#song").toggle();
            })
        })
    </script>
</head>
<body>
<%@ include file="top.jsp" %>
<article>
  <div class="photowall">
    <ul class="wall_a">
      <li><a href="javascript:void(0)"><img src="${pageContext.request.contextPath}/images/jxnu1.jpeg">
        <figcaption>
          <h2>今天很残酷，明天更残酷，后天很美好，但是大多数人死在明天晚上，看不到后天的太阳! </h2>
        </figcaption>
        </a></li>
      <li>
        <p class="text_b"><a href="javascript:void(0)">知世故而不世故，才是最善良的成熟。时间会慢慢沉淀，有些人会在你心底慢慢模糊。学会放手，你的幸福需要自己的成全。</a></p>
      </li>
      <li><a href="javascript:void(0)"><img src="${pageContext.request.contextPath}/images/jxnu2.jpeg">
        <figcaption>
          <h2>不再因为别人过得好而焦虑，在没有人看得到你的时候依旧能保持节奏。 </h2>
        </figcaption>
        </a></li>
      <li>
        <p class="text_b"><a href="javascript:void(0)">“梦想”是一个多么“虚无缥缈不切实际”的词啊。在很多人的眼里，梦想只是白日做梦，可是，如果你不曾真切的拥有过梦想，你就不会理解梦想的珍贵。</a></p>
      </li>
      <li>
        <p class="text_b"><a href="javascript:void(0)">人生就像一场豪赌。输了，你将永远失去青春。赢了，你将永远掌握青春。青春就是你的筹码。豪赌常有，而青春不常有。青春不再，但至少梦还在！</a></p>
      </li>
      <li><a href="javascript:void(0)"><img src="${pageContext.request.contextPath}/images/jxnu3.jpeg">
        <figcaption>
          <h2>孤单是一个人的狂欢，狂欢是一群人的孤单。 </h2>
        </figcaption>
        </a></li>
      <li>
        <p class="text_b"><a href="javascript:void(0)">死亡并不可怕，可怕的是，你辜负了所有人的眼泪，辜负了自己直到生命结束也未曾达到的高度，还有那未曾完成的梦想。</a></p>
      </li>
      <li><a href="javascript:void(0)"><img src="${pageContext.request.contextPath}/images/jxnu4.jpeg">
        <figcaption>
          <h2>守得住清贫、耐得住寂寞、挡得住诱惑、经得起考验、稳得住心神、负得起责任、挑得起使命。</h2>
        </figcaption>
        </a></li>
    </ul>
  </div>
  <div class="abox">
  <h2>博主简介</h2>
  <div class="biji-content" id="content"> 陈松，男，一个95后小伙子，江西人。15年上大学。软件工程专业，大三开始一直潜心研究Java技术，一边做项目一边积累经验。在平时，大家也亲切的都叫我“松哥”。
    但是博主真是个“dd”啊，写此个人博客网站目的就是以后可以记录一些文章之类。学习之路期间有很多的不易，但是都没有放弃过。入了这一行，就深深的喜欢上它。 </div>
  <div class="navlist">
    <ul>
      <li class="navcurrent"><a href="#top1">基本信息</a> </li>
      <li> <a href="#top2" >工作技能</a> </li>
      <li> <a href="#top3" >内心独白</a> </li>
      <li> <a href="#top4" >自带BGM</a> </li>
      <li> <a href="#top5" >博主帅照</a> </li>
    </ul>
  </div>
  <div class="navtab">
    <div class="navitem" style="display: block;" name = "top1">
      <div class="content">
        <p>网名：OrangeCsong | 陈松</p>
        <p>职业：Java研发工程师 </p>
                <p>邮箱：orangecsong@163.com</p>
        <p>个人微信：</p>
        <p><img src="${pageContext.request.contextPath}/images/my_vx2.jpg"></p>

      </div>
    </div>
    <div class="navitem" name = "top2">
      <div class="content">
        <p class="ab_t">工作技能：</p>
        <p>1、熟悉JAVA面向对象、集合、并发编程相关知识</p>
          <p>1、熟悉AJAX技术相关知识及使用场景进行前台后数据传输</p>
        <p>2、根据产品需求，配合后端开发人员协作实现前端页面效果和功能</p>
        <p>3、能够进行手机端和Pc端Html页面制作</p>
        <p>4、熟练使用html5，CSS3，javascript，熟悉页面架构和布局</p>
        <p>5、熟练使用Javascript框架</p>
      </div>
    </div>
    <div class="navitem" name = "top3">
      <div class="content">
        <p class="ab_t">内心独白：</p>
          <p>【摩羯座】摩羯座是十二星座中最有耐心，行事最小心、也是最善良的星座。他们做事脚踏实地，也比较固执，不达目的是不会放手的。他们的忍耐力也是出奇的强大，同时也非常勤奋。他们心中总是背负着很多的责任感，但往往又很没有安全感，不会完全地相信别人。</p>
          <p>【座右铭】 既然选择了远方，就只顾风雨兼程。我行。我可以。</p>
          <p>【我想说】优秀的人更懂得丰富自己生活且不断的学习来提升自己自身的价值。</p>
          <p>【特长】吃饭快,某人说我点黄焖鸡米饭总喜欢另加一盒饭=。= !学校三食堂三楼那家黄焖鸡关店不开了不是因为我(爆破音)。</p>
          <p>【纠结】在熬夜和担心掉头发中间有点纠结。年轻气盛的就开始想着三十岁之后焦虑的事了。</p>
          <p>【吐槽】待完善中。。（滑稽.jpeg）</p>
      </div>
    </div>
    <div class="navitem" name = "top4">
      <div class="content">
        <p class="ab_t">自带BGM：</p>
          <p>【很好奇吧 ?】为啥说是自带BGM呢？到底是哪首歌呢？这首歌貌似曾几何时被室友们吐槽过都TM单曲多少遍了！哈哈 怪我咯。我们一起来听一下吧！</p>
          <span id="btn" style="font-size: medium;color: #0da919">点击听歌</span>
          <div id="song" style="display: none">
              <iframe frameborder="0" border="1"
                      marginwidth="0" marginheight="0"
                      width=333 height=77
                      src="//music.163.com/outchain/player?type=2&id=70484&auto=0&height=66">
              </iframe>
          </div>
      </div>
    </div>
    <div class="navitem" name = "top5">
      <div class="content">
        <p class="ab_t">博主帅照：</p>
          <p><img src="${pageContext.request.contextPath}/images/bzsz.gif"></p>
      </div>
    </div>
  </div>
 </div>
</article>
<%@ include file="fonter.jsp" %>
<a href="#" class="cd-top">Top</a>
</body>
</html>
