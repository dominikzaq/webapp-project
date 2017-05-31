package com.project.webapp.service.impl;

import com.project.webapp.domain.Login;
import com.project.webapp.domain.User;
import com.project.webapp.repository.UserRepository;
import com.project.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by domin on 5/23/17.
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(Login login) {
        return null;
    }


    @Override
    public void deleteUser(int id) {
        userRepository.delete(id);
    }

    @Override
    public void insertUser() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void saveUser(User user) {
        userRepository.saveAndFlush(user);
    }


    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User getByCountry(String country) {
        return userRepository.findByCountry(country);
    }

    @Override
    public User getByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }
}
