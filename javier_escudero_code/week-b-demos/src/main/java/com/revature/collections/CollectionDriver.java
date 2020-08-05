package com.revature.collections;

import com.revature.io.models.User;

import java.util.HashSet;
import java.util.Set;

public class CollectionDriver {

    /*
        Set
            - cannot contain duplicate values
            - models the mathematical concept of a "set"
            - contains only methods inherited from the Collection interface
            - adds a stronger contract on the behaviors of the .equals() and .hashcode() operations
            - have no implicit order (like getting a marble out of many from a bag)
     */
    public static void main(String[] args) {

        Set<User> userSet = new HashSet<>();
        User u = new User(1, "wsingleton", "password");
        userSet.add(u);
        userSet.add(new User(2, "skelsey", "manager"));
        userSet.add(new User(3, "skelsey", "manager"));
        userSet.add(new User(13, "skelsey", "manager"));
        userSet.add(u);
        User u2 = new User(1, "wsingleton", "password");
        userSet.add(u2); // different object, same values == duplicate

        System.out.println(u.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u == u2);

        userSet.forEach(user -> System.out.println(user));//no implicit order
        userSet.forEach(user -> System.out.println(user.hashCode()));// not even by hashcode
    }
}