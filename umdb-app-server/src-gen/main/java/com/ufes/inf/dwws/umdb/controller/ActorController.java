package com.ufes.inf.dwws.umdb.controller;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "actorController")
@ELBeanName(value = "actorController")
@Join(path = "FROM", to = "TO")
public class ActorController {

	
	@Autowired
	private ActorService actorService;
	

	
	private Actor actor;
	

	
	public void create() {
		// TODO Auto-generated method stub
		return;
	}
	
	public Actor get() {
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
	
	
	
	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}
	

}