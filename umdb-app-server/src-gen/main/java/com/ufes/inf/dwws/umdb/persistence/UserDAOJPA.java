package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;

@Repository
public class UserDAOJPA implements UserDAOJPA{

    @PersistenceContext
    EntityManager entityManager;
    
    
    @Override
	public User getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	

}