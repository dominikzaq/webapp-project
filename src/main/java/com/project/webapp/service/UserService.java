package com.project.webapp.service;

import com.project.webapp.domain.Login;
import com.project.webapp.domain.User;

/**
 * Created by domin on 5/24/17.
 */
public interface UserService {
    Iterable<User> getAllUsers();
    User validateUser(Login login);
    void removeUser();
    void  insertUser();
    void updateUser();
    void saveUser(User user);
    User getByName(String name);
    User getByEmail(String email);
    User getByCountry(String country);
    User getByEmailAndPassword(String email, String password);
}
