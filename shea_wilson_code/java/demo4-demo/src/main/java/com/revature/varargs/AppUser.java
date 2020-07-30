package com.revature.varargs;

import java.util.Arrays;

public class AppUser {

    private int id;
    private String username;
    private String password;
    private Role[] roles;

    public AppUser(){
        super ();

    }

    public AppUser(String username, String pw, Role[] roles){
        this.username = username;

        password = pw;

       this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }



    public void addRoles(Role... newRoles){
        if(roles == null ){

            roles = new Role[newRoles.length];
        }

        int startingIndexForNewRoles = roles.length;

        roles = Arrays.copyOf(roles, newRoles.length + roles.length);

        for(int i = startingIndexForNewRoles, j = 0 ; j < newRoles.length ; i++ , j++){
            roles[i] = newRoles[j];

        }

    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }
}