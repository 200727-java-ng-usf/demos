package com.revature.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDriver {


        public static void main(String[] args) {

            // First make a list
            List<Person> people = new ArrayList<>();
            people.add(new Person("yuanfeng",34));
            people.add(new Person("eden",4));
            people.add(new Person("effie",30));
            people.add(new Person("shao",63));
            people.add(new Person("yuqin",62));
            people.add(new Person("simba",5));



            Person[] family = new Person[]{new Person("shao",63),
                    new Person("yuqin",62),new Person("simba",5)};

            int [] arr = new int[]{1,2,3,4,5,6};

            IntStream arrStream = Arrays.stream(arr);
            Stream<Person> personStreamByArray= Arrays.stream(family);

            // To stream
            Stream<Person> personStream = people.stream();
            Stream<Person> familySteam = Stream.of(family);

            Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

            // tools
           // familySteam.filter(f -> f.getAge()>60).forEach(System.out::println);
            //Stream.of(family).limit(3).forEach(System.out::println);

            System.out.println("-------------------------");

            //Stream.of(family).skip(1).forEach(System.out::println);

            // use Comparator to sort Object
            people.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);

            // end operation

            System.out.println(people.stream().allMatch(p -> p.getAge() > 6)); // all people older than 6 return boolean

            System.out.println(Arrays.stream(family).anyMatch(f -> f.getAge() < 10)); // anyone <10 return

            Optional<Person> firstPerson = people.stream().filter(person -> person.getAge() > 10).findFirst();

            //max or min
            Optional<Person> maxAge = people.stream().max(Comparator.comparingInt(Person::getAge));

            System.out.println(maxAge);

            //reduce
            List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            Integer total = numberList.stream().reduce(0, Integer::sum); // form index o run sum();
            System.out.println(total);

            // get the ageStream
            Stream<Integer> ageStream = people.stream().map(Person::getAge);
            Optional<Integer> totalAge = ageStream.reduce(Integer::sum);
            System.out.println(totalAge);

            //collect
            List<Person> list = people.stream().filter(person -> person.getAge() < 10).collect(Collectors.toList());
            list.forEach(System.out::println);


        }
    }


