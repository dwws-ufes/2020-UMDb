package com.ufes.inf.dwws.umdb.controller;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "userController")
@ELBeanName(value = "userController")
@Join(path = "FROM", to = "TO")
public class UserController {

	
	@Autowired
	private UserService userService;
	

	
	private User user;
	
	private String repeatPassword;
	

	
	public User register() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public User login() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}
	

}