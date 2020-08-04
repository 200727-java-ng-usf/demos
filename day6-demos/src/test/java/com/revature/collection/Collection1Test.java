package com.revature.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Collection1Test {

    @Test
    public void test1() {
        Collection coll = new ArrayList();
      // add<T>
        coll.add("aaa");
        coll.add("BBB");
        coll.add(123);
        coll.add(new Date());

        //size()
        System.out.println(coll.size());  //4

        //addAll()
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CCC");
        coll.addAll(coll1);
        System.out.println(coll.size());
        //isEmpty
        System.out.println(coll.isEmpty());
        System.out.println(coll);
        //clear()
        System.out.println(coll.isEmpty());
        System.out.println(coll);

    }

    @Test
    public void test2() {
    Collection coll = new ArrayList();
    coll.add(123);
    coll.add("456");
    coll.add(false);
    coll.add(new String("Tom"));
    Person p = new Person(23,"mike");
    coll.add(p);

    //contains what kind of obj
        System.out.println(coll.contains(123));
        System.out.println(coll.contains(p));


    }



}