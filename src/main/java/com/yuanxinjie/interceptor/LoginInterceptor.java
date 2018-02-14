package com.yuanxinjie.interceptor;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		StringBuffer Url = request.getRequestURL();
		String url = Url.toString();
		if(url.indexOf("login")>=0) {
			return true;
		}
		
		String contextPath = request.getContextPath();
		
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		if(username!=null) {
			return true;
		}

		response.sendRedirect(contextPath+"/login");
		System.out.println("拦截了");
		return false;
	}

}
