package com.revature.compare;

/*
    Comparator
        - one method: int compaer(T obj1, Tobj2)
        - functional interface - lambda expressions
        - returns an int value wich is either negative, 0, or positive(less than, equal to, greater than)
        -
 */

import com.revature.compare.models.Car;
import com.revature.compare.models.Employee;
import com.revature.compare.util.CarComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

public class ComparatorDriver {
    public static void main(String[] args) {
        Car myCar = new Car(12345, "Ford", "Mustang", "brown");
        Car miaCar = new Car(98484, "Honda", "civic", "white");


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(miaCar);
        cars.add(myCar);
        cars.add(new Car(48486, "Toyota", "Corrola", "Blue"));
        cars.add(new Car(65454, "Chevy", "Aveo", "purple"));

        for(Car car : cars){
            System.out.println(car);
        }


//        public void sort(Comparator<? super E> c) {
//            final int expectedModCount = modCount;
//            Arrays.sort((E[]) elementData, 0, size, c);
//            if (modCount != expectedModCount) {
//                throw new ConcurrentModificationException();
//            }
//            modCount++;
//        }
        System.out.println("++------------------------++");

        cars.sort(new CarComparator()); // Actually sort the array

        for(Car car : cars){
            System.out.println(car);
        }
        System.out.println("++------------------------++");
        Employee emp1 = new Employee("Wezlet", "singl", 30);
        Employee emp2 = new Employee("Matt", "Knighten", 30);
        Employee emp3 = new Employee("Blake", "Kruppa", 28);
        Employee emp4 = new Employee("tro", "dav", 37);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        employees.forEach(System.out::println); //<-- method reference

        //usong Lambda expression to create an inline representation of a comparator

        //
        employees.sort((employee1, employee2) ->{
            if(employee1.getAge() > employee2.getAge()){
                return 1;
            }
            else if (employee1.getAge() < employee2.getAge()){
                return -1;
            }
            else {
                int result = employee1.getLastName().compareTo(employee2.getLastName());

                return employee1.getLastName().compareTo(employee2.getLastName());
            }
        });

        employees.forEach(System.out::println); //<-- method preference
        /*
            Rules for Lambda expressions
                1. can only be used to implement a functional interface inline
                2. Usage of paranthesis with parameters:
                    - if 0 parameters, you must include an empty set of parenthesis
                    - if only 1 parameter, the parenthesis are optional
                    - If 2 plus parameters you must include parenthesis

                3. usage of curly braces
                    - if the implementation logic is a one liner, no braces needed (also no return keyword need)
                    - if the implementation logic is more than two statements then curly braces are needed.
         */
    }

}
