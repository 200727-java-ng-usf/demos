package com.revature.classRelationship;

public class RelationDriver {

    public static void main(String[] args) {

           int money = 100;
           int age = 5;

           Father father = new Father();
           Father father1 = new Father();
           father.setSon(new Son(money));
           father.getSon().setGrandSon(new GrandSon(5));

           father1.setSon(new Son(150));
           father1.getSon().setGrandDaughter(new GrandDaughter("effie"));

           

        System.out.println("the son's money is : "+father.getSon().getMoney());
        System.out.println("the grandson's age is " + father.getSon().getGrandSon().getAge());



    }









}
