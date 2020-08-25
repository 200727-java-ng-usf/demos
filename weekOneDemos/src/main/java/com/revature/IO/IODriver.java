package com.revature.IO;

import java.io.*;

public class IODriver {

    public static void main(String[] args) {

//        File file = new File("src/main/resources/helloWorld.txt");

//        try {
//            FileWriter fileWriter = new FileWriter(file,true);
//
//            fileWriter.write("hello world! This is Gu.\n");
//            fileWriter.write("I am doing QC now.");
//
//            fileWriter.flush();
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//         String line;
//        try {
//            FileReader reader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(reader);
//            while ((line=bufferedReader.readLine())!= null) {
//                System.out.println(line);
//            }
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file = new File("src/main/resources/data.txt");

//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            fileWriter.write("Hello world, I am doing QC now \n");
//            fileWriter.write("This saturday, I am coding now");
//
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
