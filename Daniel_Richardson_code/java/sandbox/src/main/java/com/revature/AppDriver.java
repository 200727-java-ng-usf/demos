package com.revature;


import com.revature.abstraction.Cat;
import com.revature.abstraction.Animal;

public class AppDriver {
    public static void main(String[] args) {
//        System.out.println("Hi");
//        StringSandbox newStringbox = new StringSandbox();
//        FinalSandbox anu_start = new FinalSandbox();

//
//        Cat cat = new Cat();
//        cat.makeSound();
//        Cat fatcat = new Cat(20, "Cowboy", true);
//        System.out.println(fatcat.getNumberOfLives());
//        System.out.println(fatcat.getBreed());
//        System.out.println(fatcat.getHasFur());
//        fatcat.makeSound();
//        System.out.println(fatcat.clawLength);//claw length taken from interface
//
//        Animal covCat = new Cat(); //covariance
//        System.out.println(covCat.getNumberOfLives()); //9 : taken from CAT method
//        System.out.println(covCat.numberOfLives); //1 : from Animal base
//        System.out.println("---------------");
//
//        //creating reference for Integers
//        GenericsSandbox<Integer> i;
//        i = new GenericsSandbox<Integer>(88);
//        //show type of i
//        i.showType();
//        //get value of i
//        int v=i.getOb();
//        System.out.println("value: "+v);
//
//        GenericsSandbox<String> s = new GenericsSandbox<String>("WAR EAGLE");
//        s.showType();
//        String str=s.getOb();
//        System.out.println("value: "+str);
//
//        ///
//        //ConsoleSandbox.consoleStuff();
//
//        FileSandbox.fileDriver();
//        FileWriterSandbox.writer();


        if(args.length <=0){
            System.out.println("No arguments provided");
        } else {
            for(String arg:args){
                System.out.println("Provided arguments: "+arg);
            }
        }


    }
}
