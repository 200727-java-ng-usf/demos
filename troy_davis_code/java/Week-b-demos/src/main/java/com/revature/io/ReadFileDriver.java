package com.revature.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDriver {
    public static void main(String[] args) {
        //using buffered reader

        //create a file object and use the relative path to the text file
        //relative root folder is week-b-demos
        File happyText = new File("src/main/resources/happytext.txt");

        if(!happyText.exists()){
            return;
        }

        try {
            //use buffered reader
            BufferedReader reader = new BufferedReader(new FileReader(happyText));
            String currentLine = reader.readLine();//set current line to new String

            while (currentLine != null){//while the line is not null (end of file)
                System.out.println(currentLine);//print current line
                currentLine = reader.readLine();//get next line
            }

            // "\n" <- new line literal
        } catch (IOException ioe){
            //I.R.L. WILL NEED MULTIPLE EXEPTIONS IN DIFFERENT CATCH BLOCKS
            ioe.printStackTrace();
            System.out.println("an exception occured while reading this file. ");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong... ");
        }

        System.out.println("++----------------------++");

        File users = new File("src/main/resources/users.txt");



    }
}
