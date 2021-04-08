package com.ufes.inf.dwws.umdb.controller;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "movieController")
@ELBeanName(value = "movieController")
@Join(path = "FROM", to = "TO")
public class MovieController {

	
	@Autowired
	private MovieService movieService;
	

	
	private Movie movie;
	
	private Review review;
	
	private String titleToSearch;
	
	private String directorName;
	
	private String actorName;
	
	private String genreName;
	

	
	public void create() {
		// TODO Auto-generated method stub
		return;
	}
	
	public void update() {
		// TODO Auto-generated method stub
		return;
	}
	
	public void delete() {
		// TODO Auto-generated method stub
		return;
	}
	
	public void getWithActorsAndGenresAndDirector() {
		// TODO Auto-generated method stub
		return;
	}
	
	public void getWithActorsAndGenresAndDirectorAndReviews() {
		// TODO Auto-generated method stub
		return;
	}
	
	public void createReview() {
		// TODO Auto-generated method stub
		return;
	}
	
	public void filter() {
		// TODO Auto-generated method stub
		return;
	}
	
	public void search() {
		// TODO Auto-generated method stub
		return;
	}
	
	
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	
	public String getTitleToSearch() {
		return titleToSearch;
	}

	public void setTitleToSearch(String titleToSearch) {
		this.titleToSearch = titleToSearch;
	}
	
	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	
	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	
	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	

}