package com.revature.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDriver {

    public static void main(String[] args) {
        List<String> rockColors = Arrays.asList("red", "blue", "black");
        List<Geode> geodes = rockColors.stream().map(new GeodeMapper()).collect(Collectors.toList());

//        rockColors.stream()
//                .map(color -> {
//                    switch (color.toLowerCase()){
//                        case "red":
//                            return new Geode("ruby", color);
//                        case "blue":
//                            return new Geode("sapphire", color);
//                        case "black":
//                            return new Geode("obsidian", color);
//                        default:
//                            return new Geode("agate", color);
//
//                    }
//                })
//                .collect(Collectors.toList());
//
        geodes.forEach(System.out::println); // This does the same as above when there is a class
                                                //that extends Function and has the cases
    }
}

