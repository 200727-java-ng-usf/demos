package com.revature.varargs;

import java.util.Arrays;

public class AppUser {

    /* POJO - plain old Java object (models, entities, beans)
    -they have private fields/states/attributes
    -one or more constructors
    -exposes a getter and setter for each private field
    -overrides the object class' .equals(), .hashcode(), and .toString()
     */
    private int id;
    private String username;
    private String password;
    private Role[] roles;

    public AppUser() {
        super(); //not required, implied
    }

    public AppUser(String username, String password, Role[] roles ){
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

    /*
        Variable arguments
            -must be the last parameter in the method signature
                + which also means that you can only have 1 vararg parameter per method
     */

    public void addRoles(Role...  newRoles) {
        //... take in variable number of arguments
        //Make sure that roles is instantiated
        if (this.roles == null){
            //If not, instantiate a new Role[] with a length equal to the newly added roles (newRoles)
            //this.roles = new Role[newRoles.length];
            roles = newRoles;
            //doesn't actually return anything due to void, just leaves early
            return;
        }

        //Make an int that holds the index position that we will start adding new roles
        int startingIndexForNewRoles = roles.length;

        //Make a copy of the existing roles array, but with a length equal to old roles + new roles
        roles = Arrays.copyOf(roles, newRoles.length +roles.length);

        //Loop across the newRoles and add each new role into the roles array starting at the index we obtained earlier
        for (int i = startingIndexForNewRoles, j = 0; j < newRoles.length; i++, j++){
            roles[i] = newRoles[j];
        }
        /*
            above for loop is different
            -it has two initial vars
            -incrementing both i and j
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
