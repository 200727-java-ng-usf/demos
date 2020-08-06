package com.revature.collections;

import com.revature.io.models.User;

import java.util.*;

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

        userSet.forEach(user -> System.out.println(user.hashCode()));

        Queue<User> userQueue = new LinkedList<>();
        userQueue.add(u);
        userQueue.add(new User(34, "njurzcak", "microservices"));
        userQueue.add(null);
        userQueue.add(u2);

        userQueue.forEach(user -> System.out.println(user));

        User someUser = userQueue.poll();
        System.out.println(someUser);

        User anotherUser = userQueue.peek();
        System.out.println(anotherUser);

        Map<String, User> userMap = new HashMap<>();
        userMap.put("wsingleton", u);
        userMap.put("jhernandez", new User(47, "jhernandez", "onPoint"));

        User thisUser = userMap.get("jhernandez");
        System.out.println(thisUser);

        for(String key : userMap.keySet()) {
            System.out.println(userMap.get(key));
        }

    }

}
