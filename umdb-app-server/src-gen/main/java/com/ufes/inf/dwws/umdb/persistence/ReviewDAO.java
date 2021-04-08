package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewDAO extends JpaRepository<ReviewDAO, Long> {

	
	
	public Review getAllByUser(User user);
	

}