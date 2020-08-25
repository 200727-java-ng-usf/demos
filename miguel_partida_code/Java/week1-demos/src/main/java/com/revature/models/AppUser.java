package com.revature.models;

import java.io.Serializable;
//Objects which will be serialized MUST implement the Serializable (marker) interface
//otherwise the application will throw a un

public class AppUser implements Serializable {
    //Serializable is a marker interface which means there are no mehtods inside of that interface

    private String username;
    private  String password;
    //transient keyword indicates that a member should not be serialized

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
