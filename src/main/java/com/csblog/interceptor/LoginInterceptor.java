package com.csblog.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @创建人 : chensong
 * @创建时间 2019/4/17
 * @描述 :
 */
public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String urlString = request.getRequestURI();
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        System.out.println("user是"+user);
        System.out.println("输入的地址"+urlString);
        if(urlString.contains("admin") && user == null){
            //后台地址 判断有没有登录
            System.out.println("经过这里了吗");
           return false;
        }
       return true;
    }
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}