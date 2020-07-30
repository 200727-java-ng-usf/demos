package com.revature.varargs;

import java.util.Arrays;

public class AppUser {

    private int id;
    private String username;
    private String password;
    private Role[] roles;

    public AppUser() {
        super();    //not required, implied
    }

    public AppUser(String username, String password, Role[] roles) {
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

    // Variables arguments
    public void addRoles(Role... newRoles) {
        // Make sure that roles is instantiated
        if (roles == null) {
            // If not, set roles to newRoles and return from the method early
            roles = newRoles;
            return; //doesnt actually return anything, just exits method early
        }
        // Make an int that holds the index position that we will start adding new roles
        int startingIndexForNewRoles = roles.length;
        // Make a copy of the existing roles array, but with a length equal to (newRoles.length + roles.length)
        roles = Arrays.copyOf(roles, newRoles.length + roles.length);
        // Loop across the newRoles and add each new role into the roles array starting at the index we obtained earlier
        for (int i = startingIndexForNewRoles, j = 0; j < newRoles.length; i++, j++) {
            roles[i] = newRoles[j];
        }
        /*
            Note that the above for loop is slightly different than a typical one
                - It has TWO initial variables declared in for loop
                - It is incrementing both i and j each time the loop makes an iteration
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
