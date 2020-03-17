package com.cssl.dao;

import java.util.List;

import com.cssl.pojo.User;

public interface IUserDao {

	public int insertUser(User u);
	
	public List<User> selectpage();
}
