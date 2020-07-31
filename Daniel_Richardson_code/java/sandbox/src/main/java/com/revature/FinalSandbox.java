package com.revature;

public class FinalSandbox {

    public FinalSandbox(){

        final String testString = "meow";
        System.out.println(testString);
        //testString = "bark"; <will never be accepted. so sad.
        //testString = testString.concat("MEOWWW"); <neither this one. tragic.
        System.out.println(testString);
    }

}
