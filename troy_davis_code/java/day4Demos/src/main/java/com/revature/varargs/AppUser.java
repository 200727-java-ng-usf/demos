package com.revature.varargs;

import java.util.Arrays;

/*
    POJO = plain old java object
        - Design pattern that encapsulates the states and behaviors of a domain object
        - Synonym: models, entities, beans

        - charic.
            + private fields/attributes/states
            + one or more constructos for instantiating the class
            + exposes a get and set method for each private field
            + overrides the objects class, equals, hashcode, and to string() methods
 */
public class AppUser {
    private int id;
    private String username;
    private String password;
    private Role[] roles;

    public AppUser(){
        //no args constructor
        super();//not required but implied
        //user can only have 2 rolls
        //roles = new Role[2];
    }
    public AppUser(String username, String pw, Role[] roles){
        //this used to access instance os variables that have same name as the method scoped vars
        this.username = username;
        this.password = pw;
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

    /*
           Variable argument Rules
            - the variable argument must be the last parameter
            - also means that there can only be one per method
            -
     */
    //Variables Arguments
    public void addRolls(Role... newRoles){

        //Make sure that roles is instantiated
        if (roles == null ){
            //if not set roles to newRoles and return from the method early
            roles = newRoles;
            return; //doesnt return anything, just leaves the method early
        }

        //make an int that holds the index position that we will start adding new roles
        int startingIndexForNewRoles = roles.length;

        //make a copy of the existing roles array but with a length equal to newroles.length + roles.length
        roles = Arrays.copyOf(roles, newRoles.length + roles.length);

        //loop accross newroles array and add each new role into the roles array starting at the index we obtained earlier
        for(int i = startingIndexForNewRoles, j = 0; j < newRoles.length; i++,j++){
            roles[i] = newRoles[j];
            /*
                the for loop above has two initial variables declared in for loop
                this for loop is incrementing both i and j
            */
        }

    }

    @Override //overriding annotator
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }
}
