package com.ufes.inf.dwws.umdb.application;

import java.util.List;
import java.util.Optional;

public interface UserService {

	
	public User login(User user);
	
	public void updateUserRole(User user, Role role);
	
	
	
	
	public Optional<User> findUserById(Long id);
	public List<User> findAllUsers();
	public User saveUser(User user);
	public void deleteUser(User user);

}