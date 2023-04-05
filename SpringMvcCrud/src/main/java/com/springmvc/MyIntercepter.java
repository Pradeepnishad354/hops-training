package com.springmvc;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyIntercepter extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
		
		
		System.out.println("this is prehandler ");
		return true;
	}

	
	
	
	
	
	


	



	
	

}
