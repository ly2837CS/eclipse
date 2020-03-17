package com.cssl.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

// 拦截器
public class MyInterceptor implements HandlerInterceptor {

	// preHandle： 在业务处理器处理请求之前被调用。预处理，可以进行编码、安全控制、权限校验等处理
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle： 拦截器");
		return true;
	}

	// postHandle：在业务处理器处理请求执行完成后，生成视图之前执行后处理（调用了Service并返回ModelAndView，但未进行页面渲染）
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle： 拦截器");
	}

	// afterCompletion：在DispatcherServlet完全处理完请求后被调用，可用于清理资源等，返回处理（已经渲染了页面）
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion： 拦截器");
	}

}
