package com.revature.collections;

import com.revature.io.models.User;

import java.util.HashSet;
import java.util.Set;

public class collectionsDriver {

    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();
        User u = new User (1,"beanie","babiePass");
        userSet.add(u);

        userSet.forEach(user -> System.out.println(user));

    }

}
