package com.revature.varargs;


import java.util.Arrays;

/*
    POJO = Plain old Java object

        - Design pattern that encapsulates the states and behaviors of a domain object

        - Synonyms: models, entities, beans

        - Characteristics:
            +have private fields/attributes/states
            + one or more constructors for instantiating the class
            +exposes a getter and setter for each private fields
            +overrides the object class's .equals(), .hashcode(), and .toString() methods
 */
public class AppUser {

    private int id;
    private String username;
    private String password;
    private Role[] roles;

    public AppUser() {
        super(); // not required, it is implied; but Wezley hates empty constructors
    }

    public AppUser(String username, String pw, Role[] roles) {
        // use this to access instance scope variables that have the same name as method scoped variables
        this.username = username;

        // if there are no method scoped variables with the same name as the isntance scoped ones, no need for "this"
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

    /*
        Varargs
            - ... means you are taking in a variable number of args for that type.
            - have to be the last parameter in the method signature
                + which also means you can only have one vararg parameter per method
     */


    // Variables arguments
    public void addRoles(Role... newRoles) {

        // Make sure that roles is instantiated
        if (roles == null) {

            // if not set roles to newRoles and role from method early
            roles = newRoles;
            return;
        }

        // Make an int that holds the index position that we will start adding new roles at
        int startingIndexForNewRoles = roles.length;

        // Make a copy of the existing roles array, but with a length equal to (newRoles.length + roles.length)
        roles = Arrays.copyOf(roles, newRoles.length + roles.length);

        // Loop across the newRolesand add each new role into the roles array starting at the index we obtained earleir

        for (int i = startingIndexForNewRoles, j = 0; j < newRoles.length; i++, j++) {
            roles[i] = newRoles[j];
        }
        /*
            Note that the above for loop is slightly different
                -it has two initial variables declared in for loop
                - multi declaration of same type (might not be good practice outside for loop)
                - It is incrementing both i and j each iteration
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
