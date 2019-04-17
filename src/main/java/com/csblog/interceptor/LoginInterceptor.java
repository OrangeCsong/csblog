package com.csblog.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @创建人 : chensong
 * @创建时间 2019/4/17
 * @描述 :
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if ("GET".equalsIgnoreCase(request.getMethod())) {
           // RequestUtil.saveRequest();
        }
        String requestUri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String url = requestUri.substring(contextPath.length());
        if ("/userController/login".equals(url)) {
            return true;
        } else {
            String username = (String) request.getSession().getAttribute("user");
            if (username == null) {
                request.getRequestDispatcher("/admin").forward(request, response);
                return false;
            } else{
                return true;
            }

        }
    }
}