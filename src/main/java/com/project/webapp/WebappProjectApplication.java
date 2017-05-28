package com.project.webapp;

import com.project.webapp.domain.User;
import com.project.webapp.repository.UserRepository;
import com.project.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class WebappProjectApplication {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(WebappProjectApplication.class, args);
	}

}
