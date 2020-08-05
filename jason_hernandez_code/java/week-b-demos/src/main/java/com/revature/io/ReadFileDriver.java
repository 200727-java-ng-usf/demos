package com.revature.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDriver {
    public static void main(String[] args) {

        // Use relative path, from week-b-demos
        File happy_text = new File("src/main/resources/happy_text.txt");

        if(!happy_text.exists()) {
            return;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(happy_text));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        }

        System.out.println("+--------------------------+");

        File users = new File("src/main/resources/users.txt");
    }
}
