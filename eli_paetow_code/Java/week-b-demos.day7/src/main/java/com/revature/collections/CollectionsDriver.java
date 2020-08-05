package com.revature.collections;

import com.revature.gernerics.io.models.User;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDriver {

    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();
        User u = new User(1, "eli", "psswrd");
        userSet.add(u);
        userSet.add(new User(2, "matt", "psrd"));
        userSet.add(new User(3, "idk", "idkdidk"));

        System.out.println(u.hashCode());

    }


}
