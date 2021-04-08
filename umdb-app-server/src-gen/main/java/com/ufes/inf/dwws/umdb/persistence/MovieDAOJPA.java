package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;

@Repository
public class MovieDAOJPA implements MovieDAOJPA{

    @PersistenceContext
    EntityManager entityManager;
    
    
    @Override
	public Movie getByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public Movie getAllByGenre(Genre genre) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public Movie getAllByActor(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public Movie getAllByDirector(Director director) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public Movie getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public Movie getWithReviews(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public Movie getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public Movie filter(String genre, String director, String actor) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public Movie getWithActorsAndGenresAndDirector(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public Movie getWithActorsAndGenresAndDirectorAndReviews(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}