package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;

@Repository
public class RoleDAOJPA implements RoleDAOJPA{

    @PersistenceContext
    EntityManager entityManager;
    
    
    @Override
	public void getByName(String name) {
		// TODO Auto-generated method stub
		return;
	}
	

}