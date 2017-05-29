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


	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			repository.save(new User("a","aa","dominik","prorok","poland"));
			repository.save(new User("d","d","kamil","dudzinski","poland"));
			repository.save(new User("d","d","mariola","krowa","poland"));
			repository.save(new User("d","d","ryszard","pudzian","poland"));
			repository.save(new User("d","d","aneta","kieltyka","poland"));
			repository.save(new User("d","d","marcin","kieltyka","poland"));
			repository.save(new User("d","d","tomek","kolasa","poland"));
			repository.save(new User("d","d","dominik","prorok","poland"));
			repository.save(new User("d","d","kamil","kolasa","poland"));
		};
	}
}
