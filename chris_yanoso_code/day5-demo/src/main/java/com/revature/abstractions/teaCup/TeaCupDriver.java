package com.revature.abstractions.teaCup;

public class TeaCupDriver {
    public static void main(String[] args) {
        TeaCup teaCup1 = new TeaCup();
        System.out.println(teaCup1.getQuality());
        teaCup1.drop();
        System.out.println(teaCup1.getQuality());
        teaCup1.use();
        System.out.println(teaCup1.getQuality());

    }
}
