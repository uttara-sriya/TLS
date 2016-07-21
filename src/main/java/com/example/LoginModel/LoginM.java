package com.example.LoginModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by sriya on 20/07/16.
 */
@Entity
@Table(name="USERS_ALL")
public class LoginM {

    @Id
    @Column(name="USERID")
    private long userId;
    @Column(name="EMAIL")
    private String email;
    @Column(name="PASSWORD")
    private String password;
    public LoginM(){}
    public LoginM(long userId, String email, String password) {
        this.userId = userId;
        this.email = email;
        this.password = password;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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