package com.revature.varargs;

import java.util.Arrays;

// POJO = Plain ol' Java Object
//  - Design patter that encapsulates the states and behaviors of a domain object
//  - synonyms: models, entities, beans
//  - Characteristics:
//      - private fields, attributes, states,
//      - has one or more constructors for instantiating the class
//      - exposes a getter and setter for each private dield
//      - overrides the Object class's .equals(), .hashcode(), and .toString() methods
public class AppUser {

    private int id;
    private String username;
    private String password;
    private Role[] roles;

    public AppUser(){
        super(); //not required, implied, but Wezley doesnt like empty constructors

    }

    public AppUser(int id, String username, String password, Role[] roles){
        this.id = id;
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

    public void addRoles(Role... newRoles){ //can pass in 0 to many different variables
       //make sure that roles is instantiated
        if (this.roles == null  ){
           //if not, set roles to newRoles and return from the method early
            roles = newRoles;
            return; //doesnt actually return anything, it just leaves the method early
        }

        //Make and int that holds the index position what we will start appending new roles
        int startingIndexForNewRoles = roles.length;

        //make a copy of the existing roles array, but with a length equal to (newRoles.length + roles.length)
        roles = Arrays.copyOf(roles,newRoles.length + roles.length);

       //loop across the newRoles and add each new role into the roles array starting at the index we obtained earlier
        for (int i = startingIndexForNewRoles, j = 0; j < newRoles.length; i++, j++){
            roles[i] = newRoles[j];
        }
        /*
            Note that the above for loop is slightly different than a typical one
                -it has two initial variables declared in the for loop
                - it is incrementing both i and j each time the loop makes and iteration
         */

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
