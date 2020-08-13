package com.revature.serials;

import java.io.Serializable;
import java.util.Objects;

public class UserSerial implements Serializable {

    //to be serialized, MUST IMPLEMENT SERIALIZABLE
    //they called it a marker interface, which predates annotations
    //truly ancient technology
    private String username;
    private transient String password;
    //transient keyword won't serialized

    public UserSerial(String username, String password) {
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
        UserSerial that = (UserSerial) o;
        return Objects.equals(username, that.username) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "UserSerial{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
