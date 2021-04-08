package com.ufes.inf.dwws.umdb.application;

import java.util.List;
import java.util.Optional;

public interface DirectorService {

	
	public Director update(Director director);
	
	
	
	
	public Optional<Director> findDirectorById(Long id);
	public List<Director> findAllDirectors();
	public Director saveDirector(Director director);
	public void deleteDirector(Director director);

}