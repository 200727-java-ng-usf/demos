package com.revature.collections;

import com.revature.io.models.User;

import java.util.*;

public class CollectionsDriver {

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
//        userSet.add(null);

        System.out.println(u.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u == u2);

        userSet.forEach(user -> System.out.println(user));//no implicit order
        userSet.forEach(user -> System.out.println(user.hashCode()));// not even by hashcode

        System.out.println("--------------------------------------");

        /*
            Queue

                - follows

         */
        Queue<User> userQueue = new LinkedList<>();
        userQueue.add(u);
        userQueue.add(u2);
        userQueue.add(new User(34, "njurzcak", "microservices"));
        userQueue.add(null);

        userQueue.forEach(user -> System.out.println(user));

        User someUser = userQueue.poll();
        System.out.println(someUser);

        System.out.println("_______________________________");
        userQueue.forEach(user-> System.out.println(user));

        System.out.println("_______________________________");
        User anotherUser = userQueue.peek(); // peek returns the next value of the queue but does not remove it
        System.out.println(anotherUser);

        System.out.println("_______________________________");
        /*

            Dequeues

                -"double-ended" queues
                - insert and removal operations can be performed on both ends of the structure
         */
        ArrayDeque<User> userDeque = new ArrayDeque<>();
        userDeque.add(u);
        userDeque.add(new User(35, "bkruppa", "javascript"));
        System.out.println("_______________________________");

        /*
            Maps

                -
                - "maps" a key to a value
                - conceptually similar to dictionaries inPython
                - cannot have duplicate keys (one key can map to, at most, one value)
                - in most implementations, keys are allowed to be null - so long as there is only one null
         */
            Map<String, User> userMap = new HashMap();
            userMap.put("wsingleton", u);
            userMap.put(null, null);
            userMap.put("skelsey", new User(42, "skelsey", "manager" ));
            userMap.put("wsingleton", new User()); // will override prev. value associated w/singleton
            userMap.put(new String("wsingleton"), new User(123, "noone", "nope")); //also overrride

            User thisUser = userMap.get("wsingleton");
            System.out.println(thisUser);
            // if a duplicate key is given the last value added is associated with the key

            // all Collections are iterable
            //userMap.forEach();
            // you cannot iterate over a map... directly at least, however:
            for (String key : userMap.keySet()){
                System.out.println(userMap.get(key));
            }

            Iterator<Map.Entry<String, User>> mapEntries = userMap.entrySet().iterator();
            //while (mapEntries)
    }
}
