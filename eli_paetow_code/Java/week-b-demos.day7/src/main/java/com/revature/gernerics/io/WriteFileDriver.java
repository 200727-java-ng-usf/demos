package com.revature.gernerics.io;

import com.revature.gernerics.io.models.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileDriver {
    public static void main(String[] args) {

        File UserFile = new File("src/main/resources/users.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(UserFile, true))) {

            User newUser = new User(5,"mattK", "rolltide" );
            writer.write("\n" + newUser.toFileString());




        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
