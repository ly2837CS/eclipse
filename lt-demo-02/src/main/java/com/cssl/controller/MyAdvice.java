package com.cssl.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// 异常处理
@ControllerAdvice
public class MyAdvice {
	
	// Controller层面上异常处理 @ExceptionHandler
	@ExceptionHandler
	public String doException(Exception e) {
		System.out.println("doException:"+e.getMessage());
		return "error";
	}

}
