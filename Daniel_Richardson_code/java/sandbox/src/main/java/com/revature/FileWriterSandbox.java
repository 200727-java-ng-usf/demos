package com.revature;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWriterSandbox {

    public static void writer(){
        File userFile = new File("src/main/resources/FileSandboxText2");

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(userFile, true))){
            User newUser = new User( 4,"mknighten", "LAME");

            writer.write("\n"+newUser.toFileString());

        }catch(Exception E){
            System.out.println("OH GOD OH FUCK");
            return;
        }


    }

}
