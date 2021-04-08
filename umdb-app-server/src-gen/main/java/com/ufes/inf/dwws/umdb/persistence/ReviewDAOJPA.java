package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;

@Repository
public class ReviewDAOJPA implements ReviewDAOJPA{

    @PersistenceContext
    EntityManager entityManager;
    
    
    @Override
	public Review getAllByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	

}