package com.ufes.inf.dwws.umdb.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceBean implements UserServiceBean {
	
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private RoleDAO roleDAO;
	

	
		
		
		
		
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
	public Optional<RoleDAO> findRoleDAOById(Long id) {
		return roleDAO.findById(id);
	}	
	
	@Override
	public List<RoleDAO> findAllRoleDAOs() {
		return roleDAO.findAll();
	}
	
	@Override
	public RoleDAO saveRoleDAO(RoleDAO roleDAO) {
		return roleDAO.save(roleDAO);
	}
	
	@Override
	public void deleteRoleDAO(RoleDAO roleDAO) {
		roleDAO.delete(roleDAO);
	}
	
	
	

	
	
	
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void updateUserRole(User user, Role role) {
		// TODO Auto-generated method stub
		return;
	}
	
}