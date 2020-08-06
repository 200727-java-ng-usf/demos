package com.revature.collections;

import com.revature.io.models.User;
import sun.nio.cs.US_ASCII;

import java.util.*;

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

        System.out.println("+-------------------+");

        /*
        Queues
        - Follows the first-in, first-out Strategy
        - adding to a queue using .add is also know as enqueueing
        -removing from a queue using.
        - members in the middle of the queue are inaccessible
         */

        Queue<User> userQueue = new LinkedList<>();
        userQueue.add(u);
        userQueue.add(u2);
        userQueue.add(new User(45,"Rex","clone"));
        userQueue.add(null);

        userQueue.forEach(user -> System.out.println(user));
        User someUser = userQueue.poll();
        System.out.println(someUser);

        System.out.println("+-------------------+");

        userQueue.forEach(user -> System.out.println(user));

        System.out.println("+-------------------+");

        User anotherUser = userQueue.peek();
        System.out.println(anotherUser);

        System.out.println("+-------------------+");
        userQueue.forEach(user -> System.out.println(user));

        /*
        Deques
        -"double-ended" queues
        - insert adn removal operations can be performed on both ends of the structure
         */

        ArrayDeque<User> userDeque = new ArrayDeque<>();
        userDeque.add(u);
        userDeque.add(new User(45,"R2-D2","droid"));

        System.out.println("+---------------------");

        /*
        Maps
        - "maps" a key to a value
        - cannot have duplicate keys
        - in most implementations, keys are allowed to be null - so long as there is only one null key
        - values do not need to be unique
        -NOT A PART OF THE COLLECTIONS API
         */

        Map<String ,User> userMap = new HashMap<>();
        userMap.put("mpartida", u);
        userMap.put(null, null);
        userMap.put("steve", new User(87,"person","pword"));
        userMap.put("mpartida", new User());
        // this will override the previous value associated with mpartida
        userMap.put(new String("mpartida"), new User(456,"user","wow"));
        User thisUser = userMap.get("mpartida");
        System.out.println(thisUser);
// you cannot iterate over a map... directly at least, however
      for (String key : userMap.keySet()){
            System.out.println(userMap.get(key));
        }
       // Iterator<Map.Entry<String ,User>> m

    }
}
