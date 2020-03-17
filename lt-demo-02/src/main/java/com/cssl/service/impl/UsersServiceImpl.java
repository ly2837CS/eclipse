package com.cssl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cssl.dao.UsersDao;
import com.cssl.pojo.Users;
import com.cssl.service.UsersService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UsersServiceImpl implements UsersService {
	
	
	private UsersDao udao;
	
	@Autowired
	public void setUdao(UsersDao udao) {
		System.out.println("set:"+udao);
		this.udao = udao;
	}
	

	@Override
	public boolean saveUsers(Users user) {
		
		System.out.println("UsersServiceImpl saveUsers");
		if(udao.insertUsers(user)>0) {			
			return true;
		}			
		return false;
	}

	@Override
	public boolean deleteUsers(int id) {
		System.out.println("UsersServiceImpl deleteUsers..."+id);
		return false;
	}

	@Transactional(readOnly = false)
	@Override
	public Users getById(int id) {
		
		return udao.selectById(id);
	}


	@Override
	public Page<Users> queryByPage(int pageIndex, int pageSize) {
		Page<Users> page = PageHelper.startPage(pageIndex, pageSize);
		udao.selectPage();
		return page;
	}

}
