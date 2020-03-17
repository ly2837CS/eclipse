package com.cssl.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cssl.pojo.Users;
import com.cssl.service.UsersService;
import com.github.pagehelper.Page;


@Controller
public class UsersController {
	
	/**
	 * 	@PostConstruct该注解被用来修饰一个非静态的void（）方法。
	 * 	被@PostConstruct修饰的方法会在服务器加载Servlet的时候运行，
	 * 	并且只会被服务器执行一次。PostConstruct在构造函数之后执行，
	 * 	init（）方法之前执行。
	 */
	@PostConstruct
	public void init() {
		System.out.println("init...................");
	}
	
	@Autowired
	private UsersService service;
	
	@ResponseBody
	@GetMapping("/query/{pageIndex}/{pageSize}")
	public Page<Users> query(@PathVariable int pageIndex,
			@PathVariable int pageSize){
		System.out.println("query:"+pageIndex+":"+pageSize);
		//int i = 10/0;
		return service.queryByPage(pageIndex, pageSize);
	}
	
	@PostMapping("/regist")
	public String regist(Users user) {
		System.out.println("regist:"+user.getUsername());		
		
		if(service.saveUsers(user))			
			return "success";
		return "index";
	}
	
	/*
	 * @PostMapping("/regist") public String regist(UsersVo uvo) {
	 * System.out.println("regist:"+uvo.getUsername());
	 * 
	 * //vo->pojo Users user = new Users(); BeanUtils.copyProperties(uvo, user);
	 * if(service.saveUsers(user)) //没有配置视图解析器 //return "redirect:/success.jsp";
	 * return "success"; return "index"; }
	 */

}
