package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;

@Repository
public class GenreDAOJPA implements GenreDAOJPA{

    @PersistenceContext
    EntityManager entityManager;
    
    
    @Override
	public Genre getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}