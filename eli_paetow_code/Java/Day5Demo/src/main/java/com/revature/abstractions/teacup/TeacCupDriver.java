package com.revature.abstractions.teacup;

public class TeacCupDriver {
    public static void main(String[] args) {
        TeaCup teaCup = new TeaCup();
        System.out.println(teaCup.getQuality());
        teaCup.drop();
        System.out.println(teaCup.getQuality());

    }
}
