package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepository;
import com.example.demo.user.User;

@RestController
@RequestMapping("/")
public class Usercontroller {

	@Autowired
	UserRepository userrepository;
	@GetMapping("/allusers")
	public List<User> getAllusers(){
		return userrepository.findAll();
	}
	//get function
	@GetMapping("/{username}")
	public User getEmployeeById(@PathVariable(name="username") String username) {
		return userrepository.getOne(username);
	}
	
	//post function
	
	@PostMapping("/saveusers")
	public List<User> saveUsers(@RequestBody User user){
		
		userrepository.save(user);
		return userrepository.findAll();
	}
	//delete function

	@DeleteMapping("/deleteuser/{username}")
	public List<User> deleteById(String username){
		userrepository.deleteById(username);
		return userrepository.findAll();
	}
	
	
	
}
