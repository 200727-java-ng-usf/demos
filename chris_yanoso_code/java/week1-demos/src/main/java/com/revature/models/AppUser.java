package com.revature.models;

import java.io.Serializable;
import java.util.Objects;

// Objects which will be serialized MUST implement the Serializable (marker) interface
// otherwise the application will throw a unchecked NotSerializableException when we
// attempt to serialize the object.
public class AppUser implements Serializable {

    private String username;

    // the transient keyword indicates that a member should not be serialized
    private transient String password;

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) &&
                Objects.equals(password, appUser.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}