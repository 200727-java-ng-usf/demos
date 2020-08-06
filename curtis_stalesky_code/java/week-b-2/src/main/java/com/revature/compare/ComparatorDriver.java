package com.revature.compare;

import com.revature.compare.models.Cars;
import com.revature.compare.models.Employee;
import com.revature.compare.util.CarComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/*
    Comparator

        - one method: int compareTo(T obj1, obj 2)
        - Functional interface (one abstract method); can be used with lambda
        - utility classes such as Arrays and Collections have sorting methods that thake in Comparable types
        -
        - returns an int value which is either negative, zero, or positive (less than, equal to, or greater than)

 */

public class ComparatorDriver {

    public static void main(String[] args) {

        Cars myCar = new Cars(12345, "Nissan", "Rogue", "Grey");
        Cars miaCar = new Cars(98766, "Honda", "Civic", "White");

        ArrayList<Cars> cars = new ArrayList<>();
        cars.add(miaCar);
        cars.add(myCar);
        cars.add(new Cars(975432, "Toyota", "Corolla", "Blue"));
        cars.add(new Cars(972432, "Chevy", "Aveo", "Purple"));

        for(Cars car : cars){
            System.out.println(car);
        }
        System.out.println("+-------------------------------------------------+");

        cars.sort(new CarComparator());
        for(Cars car : cars){
            System.out.println(car);
        }

        System.out.println("+-------------------------------------------------+");

        Employee emp1 = new Employee("Curis", "Stalesky", 30);
        Employee emp2 = new Employee("Matt", "Knighten", 30);
        Employee emp3 = new Employee("Blake", "Druppa", 28);
        Employee emp4 = new Employee("August", "Duet", 37);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        // System.out.println(employees);
        employees.forEach(System.out::println);

        employees.sort((employee1, employee2) ->{
            if (employee1.getAge() > employee2.getAge())
            {
                return 1;
            }
            else if (employee1.getAge() < employee2.getAge())
            {
                return -1;
            }
            else
                {

                    int result = employee1.getLastName().compareTo(employee2.getLastName());
                    if (result == 0)
                    {
                        return employee1.getFirstName().compareTo(employee2.getFirstName());
                    }
                    return result;
                }



        });
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
