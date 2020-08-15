package com.revature.streams;

import java.util.function.Function;

public class GeodeMapper implements Function<String, Geode> {

    @Override
    public Geode apply(String color) {

        switch (color.toLowerCase()) {
            case "red":
                return new Geode("ruby", color);
            case "blue":
                return new Geode("sapphire", color);
            case "black":
                return new Geode("obsidian", color);
            default:
                return new Geode("agate", color);

        }

    }
}
