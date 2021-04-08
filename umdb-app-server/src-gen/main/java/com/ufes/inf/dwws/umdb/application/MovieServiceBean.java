package com.ufes.inf.dwws.umdb.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceBean implements MovieServiceBean {
	
	
	@Autowired
	private MovieDAO movieDAO;
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	@Autowired
	private GenreDAO genreDAO;
	
	@Autowired
	private DirectorDAO directorDAO;
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private ActorDAO actorDAO;
	

	
		
		
		
		
	@Override
	public Optional<MovieDAO> findMovieDAOById(Long id) {
		return movieDAO.findById(id);
	}	
	
	@Override
	public List<MovieDAO> findAllMovieDAOs() {
		return movieDAO.findAll();
	}
	
	@Override
	public MovieDAO saveMovieDAO(MovieDAO movieDAO) {
		return movieDAO.save(movieDAO);
	}
	
	@Override
	public void deleteMovieDAO(MovieDAO movieDAO) {
		movieDAO.delete(movieDAO);
	}
	
		
		
		
		
	@Override
	public Optional<ReviewDAO> findReviewDAOById(Long id) {
		return reviewDAO.findById(id);
	}	
	
	@Override
	public List<ReviewDAO> findAllReviewDAOs() {
		return reviewDAO.findAll();
	}
	
	@Override
	public ReviewDAO saveReviewDAO(ReviewDAO reviewDAO) {
		return reviewDAO.save(reviewDAO);
	}
	
	@Override
	public void deleteReviewDAO(ReviewDAO reviewDAO) {
		reviewDAO.delete(reviewDAO);
	}
	
		
		
		
		
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
	public Optional<UserDAO> findUserDAOById(Long id) {
		return userDAO.findById(id);
	}	
	
	@Override
	public List<UserDAO> findAllUserDAOs() {
		return userDAO.findAll();
	}
	
	@Override
	public UserDAO saveUserDAO(UserDAO userDAO) {
		return userDAO.save(userDAO);
	}
	
	@Override
	public void deleteUserDAO(UserDAO userDAO) {
		userDAO.delete(userDAO);
	}
	
		
		
		
		
	@Override
	public Optional<ActorDAO> findActorDAOById(Long id) {
		return actorDAO.findById(id);
	}	
	
	@Override
	public List<ActorDAO> findAllActorDAOs() {
		return actorDAO.findAll();
	}
	
	@Override
	public ActorDAO saveActorDAO(ActorDAO actorDAO) {
		return actorDAO.save(actorDAO);
	}
	
	@Override
	public void deleteActorDAO(ActorDAO actorDAO) {
		actorDAO.delete(actorDAO);
	}
	
	
	

	
	
	
	@Override
	public Movie update(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Movie getWithActorsAndGenresAndDirector() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Movie getWithActorsAndGenresAndDirectorAndReviews() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void createReview(Review review, Movie movie, User user) {
		// TODO Auto-generated method stub
		return;
	}
	
	@Override
	public Movie filter(String diretor, String ator, String genero) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Movie search(String termo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}