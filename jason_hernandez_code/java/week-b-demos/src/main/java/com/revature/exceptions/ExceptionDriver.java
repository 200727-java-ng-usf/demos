package com.revature.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDriver {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try{
                String input = getInput(reader);
            } catch(IOException e) {
                e.printStackTrace();
            }

            Scanner scanner = new Scanner(System.in);
            try {
                int somenumber = scanner.nextInt();
            } catch (InputMismatchException ime){
                    ime.printStackTrace();
                }

            finally {
                System.out.println("This will always print?");
            }
        }


        public static String getInput(BufferedReader reader) throws IOException {
            return reader.readLine();
        }
    }

