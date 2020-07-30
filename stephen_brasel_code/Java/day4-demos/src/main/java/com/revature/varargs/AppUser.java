package com.revature.varargs;

import java.util.Arrays;

/*
    POJO = Plain Ol' Java Object

        - Design pattern that encapsulates the states and behaviors of a domain object

        - Synonyms: models, entities, beans
            + have private fields/attributes/states
            + has one or more constructors for instantiating the class
            + exposes a getter and setter for each private field
            + overrides the Object class's .equals(), .hashcode(), and .toString() methods
 */
public class AppUser {

    private int id;
    private String username;
    //    private String fname;
//    private String lname;
    private String password;
    private Role[] roles;

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }

    public AppUser() {
        super();
    }

    public AppUser(String username, String pw, Role[] roles) {
        // use htis to access instance scoped variables that have the same name as method scoped variables.
        this.username = username;
        // if there are no method scoped varialbles with the game name as the instance scoped ones, no need for this.
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

    /* Variable Arguments

        ... means you are taking in a variable number of arguments for this type
            + useful for not instantiation a container
                ex: user.addRoles(Role.DEV, Role.BLDG_MNGR);
        - has to be the last parameter in the method signature
            + which also means that you can only have 1 vararg parameter per method
    */
    public void addRoles(Role... newRoles) {

        //Make sure that roles is instantiated
        if (roles == null || roles.length == 0) {

            //If not, set roles to newRoles and return from the method early
            roles = newRoles;
            return;
        }

        //Make an int that holds the index position that we will start adding new roles at.
        int startingIndexForNewRoles = roles.length;

        // Make a copy of the existing roles array, but with a length = (newRoles.length + roles.length)
        roles = Arrays.copyOf(roles, newRoles.length + roles.length);

        // Loop across the newRoles and add each nor role into the roles array starting at the index we obtained earlier
        /*
            Note that the below for loop is slightly different than a typical one
                - It has TWO initial variables declared in the for loop
                - It is incrementing both i and j in each iteration
         */
        for (int i = startingIndexForNewRoles, j = 0; j < newRoles.length; i++, j++) {
            roles[i] = newRoles[j];
        }
//        for(int i = 0; i < newRoles.length; i++) {
//            roles[i] = newRoles[i];
//        }
    }
}
