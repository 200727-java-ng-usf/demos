package com.revature.io;

import com.revature.io.models.User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileDriver {
    //we will add to existing file
    public static void main(String[] args) {

        File userFile = new File("src/main/resources/users.txt");
        /*
            try with resources block, introduced in java 7
            auto-closes object declared as resources
            only allows for the declaration of resources that implement
            the autoclosable interface

            Functional interfaces have one abstract method
         */

        //make sure to use the append: true
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(userFile, true))){

            User newUser = new User("rolltide", "mknighten", 5);
            writer.write("\n"+newUser.toFileString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

