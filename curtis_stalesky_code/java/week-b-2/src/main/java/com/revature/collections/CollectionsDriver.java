package com.revature.collections;

import com.revature.io.models.User;

import java.util.*;

public class CollectionsDriver {

    /*Set
    - cannot contain duplicate values
    - models the mathematical concept of a "set"
    - contains only methods inherited from the Collection Interface
    - adds a stronger contract on the behaviors of the .equals() and .hashcode() operations
    - have no implicit order (Think like a mixed bag)
    -
    */


    public static void main(String[] args) {

        Set<User> userSet = new HashSet<>();

        User u = new User(1, "wsingleton", "password");
        userSet.add(u);
        userSet.add(new User(2, "skelsey", "manager"));
        userSet.add(new User(2, "rconnell", "rolltide"));
        userSet.add(new User(3, "tester", "test"));
        userSet.add(u); // compiles just fine but just doesn't add the duplicate
        User u2 = new User(1, "wsingleton", "password");
        userSet.add(u2);

        System.out.println(u.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u == u2);

        System.out.println("+-------------------------------------------------------------+");

        userSet.forEach(user -> System.out.println(user)); // No implicit order, implicit referring to "no particular"
        userSet.forEach(user -> System.out.println(user.hashCode())); // Prints the hash code of the users in the set

        System.out.println("+----------------------QUEUES---------------------------------------+");

        /*
        *
        * Queue
        *
        *   - follows the first in first out strategy (FIFO)
        *   - adding to a queue using .add is also known as a enqueueing
        *   - removing from a queue using .poll is also known as dequreueing
        *   - members in the middle of the queue are inaccessible
        *   -
        * */

        Queue<User> userQueue = new LinkedList<>(); // Using a Linked List
        userQueue.add(u);
        userQueue.add( new User (34, "hjurzcak", "microserves"));
        userQueue.add(null);
        userQueue.add(u2);

        userQueue.forEach(user -> System.out.println(user));

        User someUser = userQueue.poll(); // poll removes the first value in the queue and returns it
        System.out.println((someUser));

        System.out.println("+-------------------------------------------------------------+");

        userQueue.forEach(user -> System.out.println(someUser));

        System.out.println("+-------------------------------------------------------------+");

        User anotherUser = userQueue.peek(); // peek returns the next value in the queue, but does not remove it
        System.out.println(anotherUser);

        System.out.println("+-------------------------------------------------------------+");
        userQueue.forEach(user -> System.out.println(user));

        System.out.println("+-------------------------------------------------------------+");

        /*
        *   Dequeues
        *
        *   - "double-ended" queues
        *   - insert and removal operations can be performed on both ends of the structure
        *
        * */
        System.out.println("+-------------------------------------------------------------+");

        ArrayDeque<User> userDeque = new ArrayDeque<>();

        userDeque.add(u);
        userDeque.add(new User(5, "Some Dude","Knarly"));

        System.out.println("+----------------------------MAPS---------------------------------+");

        /*
        *   Maps
        *       - Not apart of the Collections API
        *       - "maps" a key to a value
        *       - conceptually similar to dictionaries in Python
        *       - cannot have duplicate keys (one key can map to, at most, one value
        *       - In most implementations, keys are allowed to be null - so long as there is only one null key
        *       - Values themselves do not need to be unique
        *
        * */

        Map<String, User> userMap = new HashMap<>();
        userMap.put("Some Dude", u);
        userMap.put(null, null);
        userMap.put("skelsey", new User(42, "skelsey", "manager"));
        userMap.put("Some Dude", new User()); // this will override the previous value associated with "Some Dude"

        // This will also override that previously overridden value
        userMap.put(new String("Some Dude"), new User(123, "none", "nope"));

        User thisUser = userMap.get("Some Dude");
        System.out.println(thisUser); // if a duplicate key is given the last value added is associated with the key

        // you Cannot iterate over a map.... directly at least, however:
        for (String key : userMap.keySet())
        {
            System.out.println(userMap.get(key));
        }

        // The longer, older, and harder way to iterate over Map entries???
        Iterator<Map.Entry<String, User>> mapEntries = userMap.entrySet().iterator();
        while (mapEntries.hasNext())
        {
            System.out.println(mapEntries.next());
        }




    }


}
