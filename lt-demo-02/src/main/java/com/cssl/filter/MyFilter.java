package com.cssl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// 过滤器
@WebFilter("/*")
public class MyFilter implements Filter {
		

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter before...");
		
		chain.doFilter(request, response);

		System.out.println("doFilter after...");
	}

}
