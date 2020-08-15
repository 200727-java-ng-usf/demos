package com.revature.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class StreamDriver {

        static int count = 0;
        int i = 0;

        public void changeCount() {
            while (i < 5) {
                i++;
                System.out.println("i: "+i);
                count++;
                System.out.println("count: "+ count);
            }
        }

        public static void main(String[] args) {
            StreamDriver check1 = new StreamDriver();
            StreamDriver check2 = new StreamDriver();
            check1.changeCount();
            check2.changeCount();
            System.out.println(check1.count + " : " + check2.count);
        }
    }


