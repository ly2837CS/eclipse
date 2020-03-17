package com.cssl.service;

import com.cssl.pojo.Users;
import com.github.pagehelper.Page;

public interface UsersService {
	
	public boolean saveUsers(Users user);
	
	public boolean deleteUsers(int id);
	
	public Users getById(int id);
	
	public Page<Users> queryByPage(int pageIndex,int pageSize);

}
