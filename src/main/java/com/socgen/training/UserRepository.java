package com.socgen.training;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	//Writing my custom method here
	List<User> findByUserName(String userName);
	//List<User> findByUserEmail(String userEmail);
	
	
	//For writing our own queries with JPA
	//@Query("select * from user where email=(select email from locations)")
	//List<User> searchUsers();
	
	
	
	
}
