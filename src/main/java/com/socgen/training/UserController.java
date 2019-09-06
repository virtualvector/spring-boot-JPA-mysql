package com.socgen.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService service;

	@RequestMapping("/users")
	List<User> getUsers(){
		return service.getUsers();
	}
	
	@RequestMapping("/users/{userName}")
	List<User> getUsersByName(@PathVariable String userName){
		return service.getUsersByName(userName);
	}
	
//	@RequestMapping("/users/{userEmail}")
//	List<User> getUsersByEmail(@PathVariable String userEmail){
//		return service.getUsersByEmail(userEmail);
//	}
//	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody User user) {
		service.addUser(user);
	}
}
