package com.revature.lambda;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaDriver {

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I love my home");
            }
        };

        r1.run();

        Runnable r2 = () -> System.out.println("I love my cat");

        r2.run();

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int result = comp.compare(12,34);
        System.out.println(result);

        Comparator<Integer> comp2 = Integer::compare;

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("I love my cat!");

        Consumer<String> stringConsumer = System.out::println;

        stringConsumer.accept("I love my son!");





        }

    }

