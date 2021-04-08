package com.ufes.inf.dwws.umdb.controller;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "directorController")
@ELBeanName(value = "directorController")
@Join(path = "FROM", to = "TO")
public class DirectorController {

	
	@Autowired
	private DirectorService directorService;
	

	
	private Director director;
	

	
	public void create() {
		// TODO Auto-generated method stub
		return;
	}
	
	public Director get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void update() {
		// TODO Auto-generated method stub
		return;
	}
	
	public void delete() {
		// TODO Auto-generated method stub
		return;
	}
	
	
	
	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	

}