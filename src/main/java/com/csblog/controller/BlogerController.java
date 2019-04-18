package com.csblog.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.csblog.annotation.SystemLog;
import com.csblog.model.Bloger;
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
     * @return
     */  
    @RequestMapping("/login")
    public String tologin(){
    	return "login";
    }  
      
    /** 
     * 验证用户名和密码 
     * @return
     */  
    @RequestMapping("/checkLogin")
    public String login(String username, HttpSession session, String password, Model model){
        Boolean isLogin = blogerService.validateLogin(username, password);
        if(! isLogin){
            model.addAttribute("error","用户名或密码错误");
            return "login";
        }
        session.setAttribute("user", blogerService.findUserByLoginName(username));
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
