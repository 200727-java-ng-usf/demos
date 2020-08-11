package com.revature.studyimplementations;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


//MAP (interface)
// > SORTED MAP (interface)
// >>Tree Map (class)

// >Hashmap (class)
// >LinkedHashMap (class)

//map is an interface, so we'll need to use either:
//tree map, hashmap, or linkedhashmap



public class HashMapStudy {


    public Map mapMaker(){
        //generics: integer and Skittle object (K, V)
        Map <Integer,Skittle> map = new HashMap< Integer,Skittle >();
        int limit = 20;
        for(int i = 0; i < limit; i++){
            //using i as key, using same i as printed number
            map.put(i, new Skittle(true, i));
        }
        System.out.println("HashMap generated");
        return map;
    }

    public void mapPrinter(Map m){
        //using iterator
        Iterator itr = m.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            entry.toString();
            System.out.println(entry);
        }

    }


}
