package com.ufes.inf.dwws.umdb.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceBean implements GenreServiceBean {
	
	
	@Autowired
	private GenreDAO genreDAO;
	

	
		
		
		
		
	@Override
	public Optional<GenreDAO> findGenreDAOById(Long id) {
		return genreDAO.findById(id);
	}	
	
	@Override
	public List<GenreDAO> findAllGenreDAOs() {
		return genreDAO.findAll();
	}
	
	@Override
	public GenreDAO saveGenreDAO(GenreDAO genreDAO) {
		return genreDAO.save(genreDAO);
	}
	
	@Override
	public void deleteGenreDAO(GenreDAO genreDAO) {
		genreDAO.delete(genreDAO);
	}
	
	
	

	
	
	
	@Override
	public Genre update(Genre genre) {
		// TODO Auto-generated method stub
		return null;
	}
	
}