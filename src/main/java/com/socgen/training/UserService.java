package com.socgen.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;

	//Fetch all users from table
	List<User> getUsers() {
		return (List<User>)repo.findAll();
	}
	
	//Fetch all users from table by name
		List<User> getUsersByName(String userName) {
			return (List<User>)repo.findByUserName(userName);
		}
		
		
//		//Fetch all users from table by email
//				List<User> getUsersByEmail(String userEmail) {
//					return (List<User>)repo.findByUserEmail(userEmail);
//				}
//	
	//Insert a new user
	void addUser(User user) {
		repo.save(user);
	}
	
	//Other operations are copy/paste from the earlier project
	
}
