package com.hc.service;

import org.springframework.transaction.annotation.Transactional;

import com.hc.bean.User;
import com.hc.dao.UserDao;
import com.hc.utils.MDUtils;

@Transactional
public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(User user) {
		String user_password = user.getUser_password();
		String md5 = MDUtils.md5(user_password);
		user.setUser_password(md5);
		return userDao.login(user);
	}

}
