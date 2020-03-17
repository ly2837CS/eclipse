package com.cssl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cssl.pojo.User;
import com.cssl.service.impl.UserService;
import com.github.pagehelper.Page;

@Controller
public class UserController {

	@Autowired
	private UserService us;
	
	@PostMapping("/xinzeng")
	public String xinzeng(User u) {
		if(us.insertUser(u)>0) {
			return "cg";
		}
		return "sb";
	}
	
	@ResponseBody
	@PostMapping("/fenye/{pageIndex}/{pageSize}")
	public Page<User> fenye(@PathVariable int pageIndex,
			@PathVariable int pageSize){
		System.out.println("1："+us.fenye(pageIndex, pageSize));
		return us.fenye(pageIndex, pageSize);
	}
	
}
