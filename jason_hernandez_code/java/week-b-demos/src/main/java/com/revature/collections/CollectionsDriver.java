package com.revature.collections;

import com.revature.io.models.User;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDriver {
    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();
        User u = new User(1, "wsingleton", "p4ssw0rd");
        userSet.add(u);
        userSet.add(new User(2, "skelsey", "manager"));
        userSet.add(new User(2, "rconell", "rolltide"));
        userSet.add(u); // Complies, but not added because it is a duplicate.

        User u2 = new User(1, "wsingleton", "p4ssw0rd");
        userSet.add(u2); // also a duplicate, even though it a separate object.

        userSet.forEach(u System.out.println(u.hashCode()));
    }


}
