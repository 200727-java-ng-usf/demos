package com.revature.io;

import com.revature.io.models.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileDriver {
    public static void main(String[] args) {
        File userFile = new File ("src/main/resources/users.txt");

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(userFile, true))) {
                User newUser = new User(5, "mcknighten", "rolltide");
                writer.write("\n" + newUser.toFileString());
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
