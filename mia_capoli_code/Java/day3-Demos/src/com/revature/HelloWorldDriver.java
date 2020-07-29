package com.revature;

import com.revature.arrays.ArrayDemo;
import com.revature.question1Test.Question1;

public class HelloWorldDriver {

    public static void  main(String[] args) {
        System.out.println("Hello wurld, welcome to Java Development with an IDE!");

//      ArrayDemo arrayDemo = new ArrayDemo();
//      arrayDemo.learningArrays();
        Question1 q1 = new Question1();
        q1.bubbleSort();
    }

}
