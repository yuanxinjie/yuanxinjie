package com.yuanxinjie.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuanxinjie.pojo.User;
import com.yuanxinjie.service.ProductService;

@Controller
public class ProductController {

	@Resource
	private ProductService service;
	
	@RequestMapping("login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(String username,String password,Model model,HttpSession session) {
		User user = this.service.login(username,password);
		if(user!=null) {
			session.setAttribute("username", username);
			return "redirect:list";
		}else {
			model.addAttribute("mess", "用户名或者密码错误");
			return "redirect:login";
		}
		
	}
	
	@RequestMapping("list")
	public String list(HttpSession session) {
		session.invalidate();
		
		
		
		return "list";
	}
	
	
}
