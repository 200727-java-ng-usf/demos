package com.revature.collections;

import com.revature.io.models.User;

import java.util.*;

public class CollectionsDriver {

    public static void main(String[] args) {

    /*
        Set

            - cannot contain duplicate values
            - models the mathematical concept of a "set"
            - contains only methods inherited from the Collection interface
            - adds a stronger contract on the behaviors of the .equals() and .hashcode() ops
            - have no implicit order
     */
        Set<User> userSet = new HashSet<>();
        User u = new User(1, "cyanoso", "password");
        userSet.add(u);
        userSet.add(new User(2, "skelsey", "manager"));
        userSet.add(new User(3, "rconnell", "rolltide"));
        userSet.add(new User(13, "tester", "test"));
        userSet.add(u); //compiles just fine, but doesn't add duplicate, no error, just ignores it
        userSet.add(new User(1, "cyanoso", "password")); //new object in memory however hashcode is the same
        // set sees above as a duplicate and will ignore it

        userSet.forEach(user -> System.out.println(user));

        System.out.println("+-----------------------------------+");

        /*
            Queue

                - follows FIFO
                - adding to a queue using .add is also known as enqueueing
                - removing from a queue using .poll is also known as dequeueing
                - members in the middle of the queue are inaccessible

         */
        Queue<User> userQueue = new LinkedList<>();
        userQueue.add(u);
        userQueue.add(new User(2, "skelsey", "manager"));
        userQueue.add(new User(3, "rconnell", "rolltide"));
        userQueue.add(new User(13, "tester", "test"));

        userQueue.forEach(user -> System.out.println(user));
        System.out.println("+------------------------------+");

        User someUser = userQueue.poll();
        System.out.println(someUser);
        System.out.println("+------------------------------+");
        userQueue.forEach(user -> System.out.println(user));
        System.out.println("+------------------------------+");
        User anotherUser = userQueue.peek();
        System.out.println(anotherUser);
        System.out.println("+------------------------------+");
        userQueue.forEach(user -> System.out.println(user));


        /*
            Deques

                - "double-ended" queues
                - insert and removal operations can be performed on both ends of the structure
                - stack and queue combined

         */

        ArrayDeque<User> userDeque = new ArrayDeque<>();
        userDeque.add(u);
        userDeque.add(new User(2, "skelsey", "manager"));

        System.out.println("+--------------------------------------+");

        /*
            Maps

            - NOT APART OF THE COLLECTIONS API
            - "maps" a key to a value
            - conceptually similar to dictionaries in Python
            - cannot have duplicate keys
            - in most implementations, keys are allowed to be null - so long as there is only one
            - values do not need to be unique

         */

        Map<String, User> userMap = new HashMap<>();
        userMap.put("cyanoso", u);
        userMap.put(null, null);
        userMap.put("skelsey", new User(42, "skelsey", "manager"));
        userMap.put("kelsey1", new User(45, "skelsey", "manager"));
        User thisUser = userMap.get("cyanoso");
        System.out.println(thisUser);
        System.out.println("+------------------------+");

        for (String key: userMap.keySet()) {
            System.out.println(userMap.get(key));
        }


    }

}
