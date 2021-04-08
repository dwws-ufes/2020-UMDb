package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;

@Repository
public class ActorDAOJPA implements ActorDAOJPA{

    @PersistenceContext
    EntityManager entityManager;
    
    
    @Override
	public Actor getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}