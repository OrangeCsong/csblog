package com.csblog.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.csblog.annotation.SystemLog;
import com.csblog.service.BlogerService;
import com.csblog.util.CipherUtil;
import com.csblog.util.ConstantUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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
     * @param request 
     * @return 
     */  
    @RequestMapping("/checkLogin")
    @SystemLog(description = ConstantUtil.LOGIN_IN,userType=ConstantUtil.USERTYPE_ADMIN)
    public String login(String username, HttpSession session, String password, Model model){
        String result = "";
        //取得 密码，并用MD5加密  
        password = CipherUtil.generatePassword(password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);  
        Subject currentUser = SecurityUtils.getSubject();  
        try {  
            if (!currentUser.isAuthenticated()){//使用shiro来验证  
                token.setRememberMe(true);  //记住密码
                currentUser.login(token);//验证角色和权限  
            }
            result = "admin/index";//验证成功  
            session.setAttribute("username", username);
        } catch(Exception e){
            result = "login";//验证失败
            model.addAttribute("message", "用户名或密码错误");
        }
        return result;
    }
    
    /** 
     * 退出 
     * @return 
     */  
    @RequestMapping(value = "/admin/logout")  
    @SystemLog(description = ConstantUtil.LOGIN_OUT,userType=ConstantUtil.USERTYPE_ADMIN) 
    public String logout() {    
        Subject currentUser = SecurityUtils.getSubject();    
        String result = "login";    
        currentUser.logout();    
        return result;    
    } 
}
