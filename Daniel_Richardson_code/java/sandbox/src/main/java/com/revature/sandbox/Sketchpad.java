package com.revature.sandbox;

import java.util.Scanner;

public class Sketchpad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line

            System.out.print(s1);
            int size = s1.length();
            //System.out.println(size);
            int justify = 15;
            String whiteSpace = " ";
            while (size < justify) {
                System.out.print(whiteSpace);
                size++;
            }
            //reverse these
            if (x < 100) {
                System.out.print("0");
            } else if(x<10){
                System.out.print("00");
            } else if (x==0){
                System.out.print("000");
            }
            System.out.println(x);
        }
        System.out.println("================================");
    }
}
