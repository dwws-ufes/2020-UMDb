package com.ufes.inf.dwws.umdb.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceBean implements ActorServiceBean {
	
	
	@Autowired
	private ActorDAO actorDAO;
	

	
		
		
		
		
	@Override
	public Optional<ActorDAO> findActorDAOById(Long id) {
		return actorDAO.findById(id);
	}	
	
	@Override
	public List<ActorDAO> findAllActorDAOs() {
		return actorDAO.findAll();
	}
	
	@Override
	public ActorDAO saveActorDAO(ActorDAO actorDAO) {
		return actorDAO.save(actorDAO);
	}
	
	@Override
	public void deleteActorDAO(ActorDAO actorDAO) {
		actorDAO.delete(actorDAO);
	}
	
	
	

	
	
	
	@Override
	public Actor update(Actor autor) {
		// TODO Auto-generated method stub
		return null;
	}
	
}