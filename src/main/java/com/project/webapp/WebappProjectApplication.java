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
			repository.save(new User("aaa@aaa.pl","aaa","dominik","prorok","poland"));
			repository.save(new User("bbb@bbb.pl","bbb","kamil","dudzinski","poland"));
			repository.save(new User("ccc@ccc.pl","ccc","mariola","krowa","poland"));
			repository.save(new User("ddd@ddd.pl","ddd","ryszard","pudzian","poland"));
			repository.save(new User("eee@eee.pl","eee","aneta","kieltyka","poland"));
			repository.save(new User("fff@fff.pl","fff","marcin","kieltyka","poland"));
			repository.save(new User("ggg@ggg.pl","ggg","tomek","kolasa","poland"));
			repository.save(new User("hhh@hhh.pl","hhh","dominik","prorok","poland"));
			repository.save(new User("iii@iii.pl","iii","kamil","kolasa","poland"));
		};
	}
}
