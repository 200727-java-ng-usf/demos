package com.revature.streams;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDriver {

    public static void main(String[] args) {

        List<String> rockColors = Arrays.asList("red", "blue", "purple");
        List<Geode> geodes = rockColors.stream()
                .map(color ->{
                    switch (color.toLowerCase()){
                        case "red":
                            return new Geode("ruby", color);
                        case "blue":
                            return new Geode("sapphire", color);
                        case "purple":
                            return new Geode("rock", color);
                        default:
                            return new Geode("agate", color);
                    }
                })
                .collect(Collectors.toList());
        geodes.forEach(System.out::println);

    }

}
