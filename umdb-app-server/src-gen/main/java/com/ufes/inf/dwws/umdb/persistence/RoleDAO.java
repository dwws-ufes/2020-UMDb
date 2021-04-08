package com.ufes.inf.dwws.umdb.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO extends JpaRepository<RoleDAO, Long> {

	
	
	public void getByName(String name);
	

}