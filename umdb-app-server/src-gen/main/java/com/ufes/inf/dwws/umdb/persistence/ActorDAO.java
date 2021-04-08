package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorDAO extends JpaRepository<ActorDAO, Long> {

	
	
	public Actor getByName(String name);
	

}