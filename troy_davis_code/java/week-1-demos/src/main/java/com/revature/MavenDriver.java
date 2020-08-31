package com.revature;

public class MavenDriver {
    public static void main(String[] args) {
        if(args.length !=0){
            for(String s : args) {
                System.out.println("Provided Argument" + s);
            }
        } else {
            System.out.println("no args provided!");
        }
    }
}
