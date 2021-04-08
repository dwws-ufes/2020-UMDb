package com.ufes.inf.dwws.umdb.application;

import java.util.List;
import java.util.Optional;

public interface MovieService {

	
	public Movie update(Movie movie);
	
	public Movie getWithActorsAndGenresAndDirector();
	
	public Movie getWithActorsAndGenresAndDirectorAndReviews();
	
	public void createReview(Review review, Movie movie, User user);
	
	public Movie filter(String diretor, String ator, String genero);
	
	public Movie search(String termo);
	
	
	
	
	public Optional<Movie> findMovieById(Long id);
	public List<Movie> findAllMovies();
	public Movie saveMovie(Movie movie);
	public void deleteMovie(Movie movie);

}