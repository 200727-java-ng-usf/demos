package com.revature.varargs;

/*
    POJO = Plain Ol' Java Object

        - Design pattern that encapsulates the states and behaviors of a domain object

        - Synonyms: models, entities, beans
            + have private fields/attributes/states
            + has one or more constructors for instantiating the class
            + exposes a getter and setter for each private field
            + overrides the Object class's .equals(), .haschode(), and .toString() methods
 */
public class AppUser {

    private int id;
    private String username;
//    private String fname;
//    private String lname;
    private String password;
    private Role[] roles;

    public AppUser() {
        super();
    }

    public AppUser(String username, String pw, Role[] roles){
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

    // Variable Arguments
    public void addRoles(Role... newRoles){
        if(roles == null || roles.length != roles.length){
            roles = new Role[newRoles.length];
        }

        for(int i = 0; i < newRoles.length; i++) {
            roles[i] = newRoles[i];
        }
    }
}
