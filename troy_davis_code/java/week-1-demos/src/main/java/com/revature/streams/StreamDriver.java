package com.revature.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDriver {
    public static void main(String[] args) {
        List<String> rockColors = Arrays.asList("red", "green", "blue");
//        rockColors.stream()
//                .map(color -> {
//                    switch (color.toLowerCase()){
//                        case "red":
//                            return new Geode("ruby", color);
//                        case "blue":
//                            return new Geode("sapphire", "color");
//                        case "black":
//                            return new Geode("obsidian", color);
//                        default:
//                            return new Geode("agate", color);
//                    }
//                })
//                .collect(Collectors.toList());
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int sum = nums.stream().reduce(0, (subtotal, num) -> subtotal +num);
        System.out.println(sum);
        //create new thread object
        Thread t = new Thread();
        //invoke runable method, change to running state
        t.start();


    }
}
