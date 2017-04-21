package com.neusoft.demo.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.demo.bizservice.UserBS;
import com.neusoft.demo.facade.domain.User;
import com.neusoft.demo.facade.service.UserFacade;
@Service("userFacade")
public class UserFacadeImpl implements UserFacade {

	@Autowired
	private UserBS userBS;
	@Override
	public User getUser() {
		return userBS.getUser();
	}

}
