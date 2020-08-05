package com.revature.collections;

import com.revature.IO.models.User;
import sun.font.FileFont;

import java.util.*;

public class CollectionsDriver {
    public static void main(String[] args) {

        Set<User> userSet = new HashSet<>();
        User u = new User(1,"shapo","aaaaa");
        userSet.add(u);
        userSet.add(new User(2,"yuqin","bbbb"));
        userSet.add(new User(3,"gugug","bbbb"));
        userSet.add(new User(5,"efefe","bbbb"));
        userSet.add(new User(4,"jkjkj","bbbb"));




        userSet.forEach(user -> System.out.println(user));

        System.out.println("use Iterator");
        System.out.println("------------------------------------------------");

        Iterator iterator = userSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //iterator.remove();    //remove All

        }

        System.out.println("use enhance for");
        System.out.println("---------------------------------------------");
        for (User i:userSet){
            System.out.println(i);
        }

// Queue   * FIFO  * member in the middle are inaccessible!

        Queue<User> useQueue = new LinkedList<>();
        useQueue.add(u);
        useQueue.add(new User(3,"mmm","12345"));
        useQueue.add(new User(6,"fffff","ddddd"));

        User someUser = useQueue.poll(); // poll removes yje first value in the queue and returns it
        User anotherUser = useQueue.peek(); // do not remove
        System.out.println(someUser);

        System.out.println("----------------------------");

        useQueue.forEach(user -> System.out.println(someUser));

        // Maps  * a key to a value  * can not have duplicate keys * value do not need to be unique!
        // NOT A Collections of API

        Map<String,User>userMap = new HashMap<>();
        userMap.put("a",u);
        userMap.put("b",new User(23,"hhhh","hdasj"));
        userMap.put("c",new User(45,"fffff","hdagdag"));

        //traversing !!
        Iterator<Map.Entry<String,User>> mapEntry = userMap.entrySet().iterator();
        while (mapEntry.hasNext()){
            System.out.println(mapEntry.next());
        }

        for(String key:userMap.keySet()){
            System.out.println(userMap.get(key));
        }




    }

}
