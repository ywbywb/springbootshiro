package com.erp.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.erp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;//用户登录服务层
	
	//路径是什么 就跳转到对应的页面
    @RequestMapping("{page}")
	public String page(@PathVariable String page) {
	   return page;
	}
	
	@RequestMapping("/loginn")
	public String login2() {
		return "/login";
		
	}
	//登录认证
	@RequestMapping("/login2")
	public String login(String username,String PASSWORD,Model model,HttpSession session) {
	//使用Shiro编写认证
    //获取Subjet
	Subject subject=SecurityUtils.getSubject();
	//封装用户数据
	UsernamePasswordToken token=new UsernamePasswordToken(username, PASSWORD);
	//执行登录方法
		try {
			subject.login(token);
			session.setAttribute("username", username);
			//成功
			System.out.println("登录成功");
			return "index";
		} catch (UnknownAccountException e) {
			e.printStackTrace();
			//登录失败:用户名不存在
			System.out.println("登录失败1");
			model.addAttribute("msg", "用户名或密码不正确");
			return "login";
		} catch (IncorrectCredentialsException e) {
			e.printStackTrace();
			//登录失败:密码错误
			System.out.println("登录失败2");
			model.addAttribute("msg", "用户名或密码不正确");
			return "login";
		}
		
	}
	
	
	
	

}
