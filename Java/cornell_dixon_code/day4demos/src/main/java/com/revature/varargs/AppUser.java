package com.revature.varargs;


// POJO = Plain ol' Java object
// its a design patter that encapsulates the states and behaviors of a domain object
// synonyms include: models, entities, beans
// characteristics: private fields/attributes/states, one or more constructors for instantiating the class, exposes a getter and setter for each private field, and overrides the Object class's .equals(), .hashcode(), and .toString() methods

import java.util.Arrays;

public class AppUser {

    private  int id;
    private String username;
    private String password;
    private Role[] roles;

    public AppUser(){
        super(); //not required, it is implied

    }

    public AppUser(String username, String pw, Role[] roles){
        this.username = username;
        password= pw;
        this.roles= roles;

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

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }

    //adda single role by creating a method
    public void addRoles(Role...newRoles){
        // ... means you are taking in a variable number of arguments for this type
        //variable arguments must be the last parameter in the method signature which also means that you can only have 1 vararg parameter per method

        //make sure that roles is instantiated
        if (roles == null){

            //if not, set roles to newRoles and return from the method early
            roles = newRoles;
            return; //doesn't return anything, just leaves this method early
        }

        //Make an int that holds the index position that we will start adding new roles
        int startingIndexforNewRoles= roles.length;

        //Make a copy of the existing Roles[] but with a length equal to (newRoles.length + roles.length)
        roles = Arrays.copyOf(roles, newRoles.length + roles.length);

     // loop across the newRoles and add each new role into the roles array starting at the index we obtained earlier
        for(int i = startingIndexforNewRoles, j = 0; j<newRoles.length; i++, j++){
            roles[i]= newRoles[j];
        }
        /* Note that the above loop is slightly different that a typical one
            - 2 initial variables declared in for loop
            - incrementing both i and j each time the loop makes an iteration*/
        }

    }
