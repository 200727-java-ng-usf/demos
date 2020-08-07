package com.revature.compare;
import com.revature.compare.models.Employee;
import com.revature.compare.util.*;

/*
      Comparator

      - one method: int compare( T obj1 , T obj2)
      - function interface
      - returns an int value -1,1,0
 */

import com.revature.compare.models.Car;


import java.util.ArrayList;

public class ComparatorDriver {
    public static void main(String[] args) {

        Car myCar = new Car(1234, "Nissan", "rogue", "grey");
        Car youCar = new Car(3333, "Toyota", "Highlander", "Black");
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(myCar);
        cars.add(youCar);
        cars.add(new Car(5276, "Chevy", "Aveo", "purple"));
        cars.add(new Car(2212, "Honda", "Civic", "green"));

        for (Car c : cars) {
            System.out.println(c);
        }
        System.out.println("------------------------------------");

        Employee emp1 = new Employee("yuan", "Gu", 34);
        Employee emp2 = new Employee("cccc", "fd", 32);
        Employee emp3 = new Employee("vvvv", "bg", 43);
        Employee emp4 = new Employee("qqqq", "nj", 23);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        employees.forEach(System.out::println);// method reference


        System.out.println("+----------------------+");

        // using a lambda expression to create an inline implementation of a Employee Comparator
        employees.sort((employee1, employee2) -> {

            if (employee1.getAge() > employee2.getAge()){
                return 1;
            } else if (employee1.getAge() < employee2.getAge()) {
                return -1;
            } else {

                int result = employee1.getLastName().compareTo(employee2.getLastName());

                if (result == 0) {
                    return employee1.getFirstName().compareTo(employee2.getFirstName());
                } else {
                    return result;
                }

            }
        });

        employees.forEach(System.out::println);

        /*
            Rules for Lambda Expressions:
                1. Can only be used to implement a functional interface inline
                2. Usage of parenthesis with parameters:
                    - if 0 parameters, you must include an empty set of parenthesis
                    - if only 1 parameter, the parenthesis are optional
                    - if 2+ parameters, you must include parenthesis
                3. Usage of curly braces:
                    - if the implementation logic is a one-liner, no braces needed (also, no return keyword needed)
                    - if the implementation logic is more than one statement, braces are required
         */

    }

}