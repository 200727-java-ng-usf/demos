package com.revature.IO.models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileDriver {
    public static void main(String[] args) {
        File userFile = new File("src/main/resources/user.txt");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(userFile,true))) {

            User newUser = new User(005,"jack","guy233");
            writer.write("\n"+newUser.toFileString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
