package com.csblog.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.csblog.annotation.SystemLog;
import com.csblog.service.BlogerService;
import com.csblog.util.CipherUtil;
import com.csblog.util.ConstantUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogerController {

	@Resource(name = "blogerServiceImpl")
	private BlogerService blogerService;
	
	 /** 
     * 初始登陆界面 
     * @param request 
     * @return 
     */  
    @RequestMapping("/login")
    public String tologin(HttpServletRequest request, HttpServletResponse response, Model model){  
    	return "login";
    }  
      
    /** 
     * 验证用户名和密码 
     * @return
     */  
    @RequestMapping("/checkLogin")
    public String login(String username, HttpSession session, String password, Model model){

        //取得 密码，并用MD5加密
        password = CipherUtil.generatePassword(password);
        System.out.println(password+"密码为。。。。。。。。。。。。。。");
        return "admin/index";
    }
    
    /** 
     * 退出 
     * @return 
     */  
    @RequestMapping(value = "/admin/logout")  
    @SystemLog(description = ConstantUtil.LOGIN_OUT,userType=ConstantUtil.USERTYPE_ADMIN) 
    public String logout() {    
        return "login";
    } 
}
