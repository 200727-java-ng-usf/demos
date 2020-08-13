package com.revature.models;

import java.io.Serializable;

public class AppUser implements Serializable {
    private String username;
    private transient String password;

    public AppUser(String uName, String pw) {
        username = uName;
        password = pw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
