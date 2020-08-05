package com.revature.collections;

import com.revature.io.models.User;

import java.util.*;

public class CollectionsDriver {

    /*
        Set
            - cannot contain duplicate values
            - models the mathematical concept of a "set"
            - contains only methods inherited from the Collection interface
            - adds a stringer contract on the behaviors of the .equeals() and .hashcode() operations
            - have no implicit order
            - if you need order, dont use a set
     */
    public static void main(String[] args) {
        Set <User> userSet = new HashSet<>();
        User u = new User("sdfsdfs","troy",1 );
        User u2 = new User("sdfsdfs","troy",1 );
        User u3 = new User("pasdfsd","tsdfy",1 );
        User u4 = new User("passsdf","troy",1 );
        System.out.println(u.hashCode());
        System.out.println(u2.hashCode());//duplicate hashcodes

        userSet.add(u);
        userSet.add(u2);
        userSet.add(u3);
        userSet.add(u4);
        userSet.forEach(user -> System.out.println(user));
    }


}
