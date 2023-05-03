package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.entity.User;
import com.crud.repository.UserRepository;

@SpringBootApplication
public class SpringbootUserCrudApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootUserCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		User u=new User(1, "pradeep","nishad","02/03/1999","pradeep35","1234","pradeepnishad354@gmail.com");
		
		userRepository.save(u);
	}

}
