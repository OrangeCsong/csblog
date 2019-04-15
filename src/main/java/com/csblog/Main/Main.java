package com.csblog.Main;

import java.util.concurrent.CountDownLatch;

import com.csblog.model.Blog;
import com.csblog.service.BlogService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 测试系统的并发量
 * @author Administrator
 *
 */
public class Main {
  ApplicationContext ac =
      new FileSystemXmlApplicationContext("classpath:spring/applicationContext-*.xml");
  BlogService blogService = ac.getBean(BlogService.class);

  private void testThread() throws InterruptedException {
    final CountDownLatch startGate = new CountDownLatch(1);
    final CountDownLatch endGate = new CountDownLatch(100);
    for (int i = 0; i < 20; i++) {
      new Thread("" + i) {
        public void run() {
          try {
            startGate.await();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          Blog blog = blogService.selectBlogById(95);
          System.out.println(Thread.currentThread().getName() + "-" + blog.getClicknum());
          endGate.countDown();// 任务执行完毕,计数器减1;
        }
      }.start();
      // Thread.sleep(100);
    }
    long start = System.nanoTime();
    startGate.countDown(); // 到此处,说明所有线程准备就绪,可以开始执行任务
    endGate.await();// 阻塞等待所有线程执行完毕.
    long end = System.nanoTime();
    System.out.println((end - start) + " ns");
  }

  public static void main(String[] args) {
    //new Main().testThread();
      String str = "最近做项目中，我碰到取客户端浏览器和操作系统信息的问题，网上找了很久";
      System.out.println(str.length());
      String xxx = "最近做项目中，我碰到取客户端浏览器和操作系统信息的问题，网上找了很久，大多都是在页面中嵌入JS实现的，无法满足我的要求。所以，就自己写了个方法。我是根据每个浏览器User-Agent的特征，来判断的。";
      System.out.println(xxx.substring(0,34));


  }
}
