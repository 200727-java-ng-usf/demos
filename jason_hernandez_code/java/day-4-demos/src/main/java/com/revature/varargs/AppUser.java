package com.revature.varargs;

import java.util.Arrays;

public class AppUser {
    private int id;
    private String username;
    private String password;
    private Role[] roles;

    public AppUser() {
        super();
        roles = new Role[2];
    }

    public AppUser(String username, String pw, Role[] roles) {
        this.username = username;
        password = pw;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    public void addRoles(Role... newRoles) {
        // Ensure roles is instantiated
        if (roles == null) {
            roles = newRoles;
            return;
        }
        // Hold the index position to add new roles
        int startingIndexNewRoles = roles.length;

        // Copy existing array, with new length for additional roles
        roles = Arrays.copyOf(roles, newRoles.length + roles.length);

        for (int i = startingIndexNewRoles, j = 0; j < newRoles.length; i++, j++) {
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

