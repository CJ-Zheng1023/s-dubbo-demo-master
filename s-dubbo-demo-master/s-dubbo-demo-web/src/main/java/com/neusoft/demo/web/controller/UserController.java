package com.neusoft.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neusoft.demo.facade.domain.User;
import com.neusoft.demo.facade.service.UserFacade;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserFacade userFacade;
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public String showUser(Model model){
		User user = userFacade.getUser();
		model.addAttribute(user);
		return "index";
	}
}
