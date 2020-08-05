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
        System.out.println("++-----------------------------++");
        /*
            Queue
                - LinkedList
                - follows the first-in first-out strategy
                - adding to a Queue using .add is also known as enqueueing
                -remove with queue . poll is also known as dequeuing
                - members in the middle of the queue are inaccesable
                -



         */
        Queue<User> userQueue = new LinkedList<>();
        userQueue.add(u);
        userQueue.add(u);
        userQueue.add(new User("sdfsd","erwrw",5));
        userQueue.add(null);

        userQueue.forEach(user -> System.out.println(user));
        System.out.println(userQueue);
        System.out.println("++-----------------------------++");
        User someUser = userQueue.poll();//poll removes the first value in the queue and returns it
        System.out.println(someUser);
        userQueue.forEach(user -> System.out.println(user));

        System.out.println("++-----------------------------++");
        User anotherUser = userQueue.peek();//peek returns next value but does not remove it
        userQueue.forEach(user -> System.out.println(user));

        /*
            Deque - doubel ended queues
            insert and removal from both ends
         */
        ArrayDeque<User> userDeque = new ArrayDeque<>();
        userDeque.add(u);
        userDeque.add(u2);

        System.out.println("++-----------------------------++");
        /*
            Maps
                - NOT A PART OF THE COLLECTIONS API
                - "maps" a key to a value
                - dictonary word is key, definition is value
                - cannot have duplicate keys (one key can map to, at most, one value)
                - in most implememntations, keys are allowed to be null - so long as there is only
                one null key
                - values do not need to be uniques
         */
        System.out.println("++-----------------------------++");
        Map<String, User> userMap = new HashMap<>();
        userMap.put("tmd1990us", u);
        userMap.put(null, null);
        userMap.put("tmd1990us", new User("erfwew","eedrqwe",5));
        //userMap.put("tmd1990us", new User());
        userMap.put(null, u2);

        User thisUser = userMap.get("tmd1990us");
        System.out.println(thisUser);

        //you cannot iterate over a map, howvever
        Set s = userMap.keySet();
        for(String key : userMap.keySet()){
            System.out.println(userMap.get(key));
        }

        Iterator<Map.Entry<String, User>> mapEntries = userMap.entrySet().iterator();
        while (mapEntries.hasNext()){
            System.out.println(mapEntries.next());
        }

    }



}
