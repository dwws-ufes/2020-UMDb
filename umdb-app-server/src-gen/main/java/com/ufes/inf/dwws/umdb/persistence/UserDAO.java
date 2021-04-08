package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserDAO, Long> {

	
	
	public User getByName(String name);
	
	
	public User getByEmail(String email);
	

}