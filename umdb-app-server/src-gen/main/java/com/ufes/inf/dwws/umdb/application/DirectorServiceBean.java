package com.ufes.inf.dwws.umdb.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorServiceBean implements DirectorServiceBean {
	
	
	@Autowired
	private DirectorDAO directorDAO;
	

	
		
		
		
		
	@Override
	public Optional<DirectorDAO> findDirectorDAOById(Long id) {
		return directorDAO.findById(id);
	}	
	
	@Override
	public List<DirectorDAO> findAllDirectorDAOs() {
		return directorDAO.findAll();
	}
	
	@Override
	public DirectorDAO saveDirectorDAO(DirectorDAO directorDAO) {
		return directorDAO.save(directorDAO);
	}
	
	@Override
	public void deleteDirectorDAO(DirectorDAO directorDAO) {
		directorDAO.delete(directorDAO);
	}
	
	
	

	
	
	
	@Override
	public Director update(Director director) {
		// TODO Auto-generated method stub
		return null;
	}
	
}