package com.revature.streams;


import jdk.internal.dynalink.linker.LinkerServices;

import java.util.Arrays;
import java.util.List;


public class StreamDriver {

    public static void main(String[] args) {
        List<String> rockColors = Arrays.asList( "red","blue","black");
        List<String> geodes =rockColors.stream()
                                     .map(color ->){
                                        switch (color.toLowerCase()){

                                        }
        }
    }
}
