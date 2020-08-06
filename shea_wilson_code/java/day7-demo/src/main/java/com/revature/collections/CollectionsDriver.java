package com.revature.collections;

import com.revature.io.models.User;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDriver {

    /*
        Set
        - cannot contain duplicate values
        - models the mathematical concept a "set"
        - contains only methods inherited from the collection interface
        - adds a stronger contract on the behaviors of the .equals() and .hashCode() operations
        - have no implicit order
     */

    public static void main(String[] args) {

        Set<User> userSet   = new HashSet<>();
        User u = new User(1, "swilson", "password");
        userSet.add(u);
        userSet.add(new User(2, "wsingleton","wpassword"));

    }
}
