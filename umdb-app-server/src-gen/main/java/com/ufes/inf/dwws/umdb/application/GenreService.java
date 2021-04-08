package com.ufes.inf.dwws.umdb.application;

import java.util.List;
import java.util.Optional;

public interface GenreService {

	
	public Genre update(Genre genre);
	
	
	
	
	public Optional<Genre> findGenreById(Long id);
	public List<Genre> findAllGenres();
	public Genre saveGenre(Genre genre);
	public void deleteGenre(Genre genre);

}