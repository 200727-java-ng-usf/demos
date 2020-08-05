package com.revature.collections;

import com.revature.io.models.User;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDriver {
    /*
    set:
    - cannot contain duplicate values
    - models the mathematical concept of a "set"
    - contains only methods inherited from the Collection interface
    - adds a stronger contract on the behaviors of the .equals() and .hashcode() methods
    - have no implicit order / a mixed bag with no implicit order
    -
    -
     */
    public static void main(String[] args) {


        Set<User> userSet = new HashSet<>();
        User u = new User(1, "Mace-Windu", "jedi-concil");
        userSet.add(u);
        userSet.add(new User(2, "Grevious", "sith-general"));
        userSet.add(new User(13, "Asoka", "padawon"));
        userSet.add(new User(23, "Asoka", "padawon"));
        userSet.add(u);
        User u2 = new User(1, "obi-wan", "jedi");
        userSet.add(u2);

        System.out.println(u.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u==u2);

        userSet.forEach(user -> System.out.println(user));


    }
}
