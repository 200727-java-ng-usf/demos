package com.revature.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDriver {

    public static void main(String[] args) {

        //create a file object, and use the relative path of the text file
        File happyText = new File("src/main/resources/happy-text");

        if(!happyText.exists()){
            return;
        }
        try{
            BufferedReader reader = new BufferedReader(new FileReader(happyText));
            String currentLine = reader.readLine();
            // a loop to read the file
            while(currentLine != null){
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }

        } catch(Exception e){
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file")
        } catch (Exception e){

        }
    }
}
