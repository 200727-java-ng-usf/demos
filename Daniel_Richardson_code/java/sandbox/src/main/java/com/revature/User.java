package com.revature;

import java.util.Objects;

public class User {

    private int id;
    private String userID;
    private String password;

    public User(){
        super();
    }

    public User(int id, String userID, String password) {
        this.id = id;
        this.userID = userID;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //convenience method
    //to convert object into file string
    public String toFileString(){
        return id+ ":"+userID+":"+password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(userID, user.userID) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userID, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
