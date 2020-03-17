package com.cssl.service;

import com.cssl.pojo.User;
import com.github.pagehelper.Page;

public interface IUserService {

	public int insertUser(User u);
	
	public Page<User> fenye(int pageIndex,int pageSize);
}
