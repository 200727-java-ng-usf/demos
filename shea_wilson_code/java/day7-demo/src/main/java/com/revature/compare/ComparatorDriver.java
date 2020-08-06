package com.revature.compare;

/*
        Comparator
        - one method: int compare(T obj1, T obj2)
        - functional interface\
        - - returns an int vvalue which is eithr negative, zero, or positive (less than, equal to, or greater than)
 */

import com.revature.compare.models.Car;
import com.revature.compare.models.Employee;
import com.revature.compare.util.CarComparator;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class ComparatorDriver {

    public static void main(String[] args) {

        Car myCar = new Car(1354652, "Honda","Civic","Silver");
        Car sheaCar = new Car(13515325, "Chevy","Silverado","blue");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(myCar);
        cars.add(sheaCar);
        cars.add(new Car(1532135, "Toyota","Corolla","blue"));

        for (Car car: cars){
            System.out.println(car);
        }

        System.out.println("+------------------------------------------------+");

        cars.sort(new CarComparator());

        for (Car car: cars){
            System.out.println(car);
        }
        System.out.println("+------------------------------------------------+");

        Employee emp1 = new Employee("Shea", "Wilson",36);
        Employee emp2 = new Employee("Mike","diablo",50);
        Employee emp3 = new Employee("Gucci", "Mayne",30);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        employees.forEach(System.out::println);

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