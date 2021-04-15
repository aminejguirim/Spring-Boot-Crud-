package spring.esprit.tn.service;

import java.util.List;

import spring.esprit.tn.entity.User;



public interface IUserService {
	

	List<User> retrieveAllUsers();
	
	User addUser(User u);
	
	void deleteUser(String id);
	
	User updateUser(User u);
	
	User retrieveUser(String id);
	void deleteUserById(long id);

}
