package com.jungle.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jungle.entity.User;
import com.jungle.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value="/userList")
	public String showUserList(String id, HttpServletRequest request){
		User user = userService.getUserById(Integer.valueOf(id));
		request.setAttribute("user", user);
		return "userList";
	}

}
