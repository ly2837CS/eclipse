package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 	在SpringBootApplication上使用@ServletComponentScan注解后，
 * 	Servlet、Filter、Listener可以直接通过@WebServlet、@WebFilter、@WebListener注解自动注册，无需其他代码 
 */
@ServletComponentScan(basePackages = {"com.cssl.filter","com.cssl.listener"})
@MapperScan("com.cssl.dao")
//默认扫描本包及其子包
@SpringBootApplication
//@ComponentScan(basePackages = "com.cssl")
public class AppDemo {

	/**
	 * 启动项目
	 * @param args
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(AppDemo.class, args);
	}

}
