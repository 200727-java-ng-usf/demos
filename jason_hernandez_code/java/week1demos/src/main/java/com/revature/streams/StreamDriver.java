package com.revature.streams;

import java.util.Arrays;
import java.util.List;

public class StreamDriver {

    public static void main(String[] args) {
        List<String> rockColors = Arrays.asList("red", "blue", "black");
        rockColors.stream()
                .map(color -> {
                    switch (color.toLowerCase()){
                        case "red":
                            return new Geode("ruby", color);
                        case "blue":
                            return new Geode("sapphire", color);
                        case "black":
                            return new Geode("obsidian", color);
                        default:
                            return new Geode("agate", color);

                    }
                })
        geodes.forEach(System.out::println);
    }
}

