package spring.esprit.tn.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import spring.esprit.tn.entity.User;
import spring.esprit.tn.service.UserServiceImpl;



@RestController
public class UserController {
	
	@Autowired
	UserServiceImpl service;
	
	// http://localhost:4023/SpringMVC/servlet/add-user
	
		@PostMapping("/add-user")
		@ResponseBody
		public User addUser(@RequestBody User u) {
		User user = service.addUser(u);
		return user;
		}

	// http://localhost:4023/SpringMVC/servlet/retrieve-all-users
		@GetMapping("/retrieve-all-users")
		@ResponseBody
		public List<User> getUsers() {
		List<User> list = service.retrieveAllUsers();
		return list;
		
		}
		// http://localhost:4023/SpringMVC/servlet/modify-user
		@PutMapping("/modify-user")
		@ResponseBody
		public User modifyUser(@RequestBody User user) {
		return service.updateUser(user);
		}
		
		// http://localhost:4023/SpringMVC/servlet/remove-user/{user-id}
		@DeleteMapping("/remove-user/{user-id}")
		@ResponseBody
		public void removeUser(@PathVariable("user-id") Long userId) {
		service.deleteUserById(userId);
		}		
}
