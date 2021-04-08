package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDAO extends JpaRepository<MovieDAO, Long> {

	
	
	public Movie getByID(Long id);
	
	@Query("")
	public Movie getAllByGenre(Genre genre);
	
	
	public Movie getAllByActor(Actor actor);
	
	
	public Movie getAllByDirector(Director director);
	
	
	public Movie getByName(String name);
	
	
	public Movie getWithReviews(Long id);
	
	
	public Movie getAll();
	
	
	public Movie filter(String genre, String director, String actor);
	
	
	public Movie getWithActorsAndGenresAndDirector(Long id);
	
	
	public Movie getWithActorsAndGenresAndDirectorAndReviews(Long id);
	

}