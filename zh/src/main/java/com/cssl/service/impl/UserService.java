package com.cssl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.cssl.dao.IUserDao;
import com.cssl.pojo.User;
import com.cssl.service.IUserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
@Transactional
public class UserService implements IUserService {

	@Autowired
	private IUserDao ud;
	
	public int insertUser(User u) {
		return ud.insertUser(u);
	}

	@Override
	public Page<User> fenye(@PathVariable int pageIndex,
			@PathVariable int pageSize) {
		Page<User> page = PageHelper.startPage(pageIndex, pageSize);
		ud.selectpage();
		return page;
	}

}
