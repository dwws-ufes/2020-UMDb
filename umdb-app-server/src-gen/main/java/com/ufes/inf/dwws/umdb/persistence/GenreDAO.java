package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreDAO extends JpaRepository<GenreDAO, Long> {

	
	
	public Genre getByName(String name);
	

}