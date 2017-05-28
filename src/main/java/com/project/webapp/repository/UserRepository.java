package com.project.webapp.repository;

import com.project.webapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by domin on 5/23/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
    User findByEmail(String email);
    User findByCountry(String country);
    User findByEmailAndPassword(String email, String password);
    /*@Query("select *from User limit 1")
    User findLatest5Post();*/
}
