package spring.esprit.tn.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.esprit.tn.entity.User;
import spring.esprit.tn.repository.UserRepository;




@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserRepository userRepository;
	
	private static final Logger L = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public List<User> retrieveAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		for (User user : users) {
			L.info("user :" + user);
		}
		return users ;
	}

	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return userRepository.save(u) ;
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(Long.parseLong(id));
	}

	@Override
	public User updateUser(User u) {
		// TODO Auto-generated method stub
		return userRepository.save(u);
	}

	@Override
	public User retrieveUser(String id) {
		// TODO Auto-generated method stub
		return (User) userRepository.findAll();
	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		this.deleteUserById(id);
	}

}
