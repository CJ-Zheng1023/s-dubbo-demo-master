package com.neusoft.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.neusoft.demo.dao.UserDAO;
import com.neusoft.demo.facade.domain.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Override
	public User queryUser() {
		return new User("zheng", 18);
	}

}
