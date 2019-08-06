package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.UserRepository;
import com.example.demo.user.User;

@SpringBootApplication
public class NewregisterdemoApplication implements CommandLineRunner {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	UserRepository userrepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NewregisterdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userrepository.save(new User("krishna@gmail.com","krishna","password","myaddressssssss",22,'m'));
		userrepository.save(new User("bala@gmail.com","bala","password","myaddressssssss",22,'m'));
		userrepository.save(new User("newuser@gmail.com","newuser","password","myaddressssssss",22,'m'));
		
		logger.info("entered  run method 3 users registered manually");
		
	}

}
