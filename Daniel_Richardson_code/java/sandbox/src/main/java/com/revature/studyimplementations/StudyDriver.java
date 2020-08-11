package com.revature.studyimplementations;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudyDriver {

    public static void main(String[] args) {


//        //HashMap
//        HashMapStudy mapWriter = new MapStudy(); //mapmaker object
//        Map map = mapWriter.mapMaker(); //assigned created map
//        mapWriter.mapPrinter(map); //send it back to print
//
//        map.put(0, new Skittle(true, 0)); //this overwrites the original key 0
//        System.out.println(map.get(0).toString());


        TreeMapStudy treemap = new TreeMapStudy();
        TreeMap map = treemap.treeMapCreate();
        System.out.println(map.get(0).toString());
        Object highestKey = map.lastKey();
        Object lowestKey = map.firstKey();
        Set<Integer> keysLessThan3 = map.headMap(3).keySet();
        Set<Integer> keysGreaterThanEqTo3 = map.tailMap(3).keySet();
        System.out.println(highestKey);
        System.out.println(lowestKey);
        System.out.println(keysLessThan3);
        System.out.println(keysGreaterThanEqTo3);


    }


}
