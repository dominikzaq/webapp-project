package com.project.webapp;

import com.project.webapp.domain.User;
import com.project.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class WebappProjectApplication {

	@Autowired
	UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(WebappProjectApplication.class, args);
	}


	@PostConstruct
	public void goPost() {
		User u = new User();
		System.out.println(u);
		userRepository.save(u);
	}
}
