package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;

@Repository
public class DIrectorDAOJPA implements DIrectorDAOJPA{

    @PersistenceContext
    EntityManager entityManager;
    
    
    @Override
	public Director getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}