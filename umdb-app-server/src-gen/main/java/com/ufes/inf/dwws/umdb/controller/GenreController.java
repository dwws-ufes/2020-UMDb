package com.ufes.inf.dwws.umdb.controller;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "genreController")
@ELBeanName(value = "genreController")
@Join(path = "FROM", to = "TO")
public class GenreController {

	
	@Autowired
	private GenreService genreService;
	

	
	private Genre genre;
	

	
	public void create() {
		// TODO Auto-generated method stub
		return;
	}
	
	public Genre get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void update() {
		// TODO Auto-generated method stub
		return;
	}
	
	public void delete() {
		// TODO Auto-generated method stub
		return;
	}
	
	
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	

}