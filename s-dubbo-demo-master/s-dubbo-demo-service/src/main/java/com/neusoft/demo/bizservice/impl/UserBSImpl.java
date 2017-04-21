package com.neusoft.demo.bizservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.demo.bizservice.UserBS;
import com.neusoft.demo.dao.UserDAO;
import com.neusoft.demo.facade.domain.User;

@Service("userBS")
public class UserBSImpl implements UserBS {
	@Autowired
	private UserDAO userDAO;
	
	public User getUser() {
		return userDAO.queryUser();
	}
}
