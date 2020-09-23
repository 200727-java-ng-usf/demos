package com.revature.abstractions.teacup;

public class TeacupDriver {

    public static void main(String[] args) {
        Teacup teacup1 = new Teacup();
        System.out.println(teacup1.getQuality());
        teacup1.drop();
        System.out.println(teacup1.getQuality());
        teacup1.use();
        System.out.println(teacup1.getQuality());
        System.out.println(teacup1.toString());

    }
}
