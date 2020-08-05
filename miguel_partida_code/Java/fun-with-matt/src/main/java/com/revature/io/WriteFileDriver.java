package com.revature.io;

import com.revature.io.models.User;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileDriver {

    public static void main(String[] args) {

        File userFile = new File("src/main/resources/users.txt");
        /*
        try-with-resources
        - introduc3ewd in java 7
        - auto-closes objects declared as resources (more than one is aloowed sperate with a semi colon
        only allows for the declaration of resources that implement the AutoCloser

         */
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(userFile, true))){

            User newUser = new User(5,"Darth-Vader","Anakin");
            writer.write("\n" + newUser.toFileString());

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}

