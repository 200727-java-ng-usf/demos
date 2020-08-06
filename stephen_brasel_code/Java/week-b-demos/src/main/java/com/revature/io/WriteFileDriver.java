package com.revature.io;

import com.revature.io.models.User;

import java.io.*;

public class WriteFileDriver {
    public static void main(String[] args) {
             /*
                1:sbrasel:drowssap
                2:wsingleton:manager
                3:skelsey:javascript
                4:rconnell:java
                5:krobinson:Fire"FOOL."0101
              */
        File userFile = new File("src/main/resources/users.txt");

        /*
            try-with-resources

                - introduced in Java 7
                - auto-closes objects declared as resources
                - only allows for the declaration oif resources that implement AutoCloseable interface
         */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(userFile, true));
//        BufferedReader reader = new BufferedReader(new FileReader(userFile));
//             User myUser = new user(); // not legal, as User does not implement the AutoCloseable interface

        ) {

            User newUser = new User(5, "mknighton", "rolltide");
            writer.write("\n" + newUser.toFileString());

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
