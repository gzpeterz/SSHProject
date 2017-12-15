package com.hc.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.hc.bean.User;
import com.hc.utils.State;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	public User login(User user) {
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User where user_code = ? and user_password = ? and user_state = ?",user.getUser_code(),user.getUser_password(),State.getState());
		if (list.size() < 1) {
			return null;
		}
		return list.get(0);
	}
	
}
