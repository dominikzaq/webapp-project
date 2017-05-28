package com.project.webapp.domain;

import org.hibernate.validator.constraints.Email;

/**
 * Created by domin on 5/24/17.
 */
public class Login {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}