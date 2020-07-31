package com.revature.varargs;
//pojo
//design pattern encapsulates states and behaviors of a domain project

public class AppUser {

    private int id;
    private String username;
    private String password;
    private Role[] roles;

    public AppUser(){
        super();

    }

    public AppUser(String username, String password, Role[] roles){
        this.username = username;
        this.password = password;
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
    public void addRoles(Role... newRoles) {
        if (roles == null || roles.length != newRoles.length){
            roles = new Role[newRoles.length];
        }

        for ( int i = 0; i < newRoles.length; i++){
            roles[i] = newRoles[i];
        }




    }


}
