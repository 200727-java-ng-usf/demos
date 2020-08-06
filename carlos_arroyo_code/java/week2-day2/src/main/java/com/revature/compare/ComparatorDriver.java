package com.revature.compare;

import com.revature.compare.models.Car;
import com.revature.compare.models.Employee;
import com.revature.compare.util.CarComparator;

import java.util.ArrayList;


/*
    Comparator
        -one method: int compare(T obj1, T obj2)
        - functional interface
        - returns an int value which is either negative, zero, or positive(less than, equal to, or greater than)

 */
public class ComparatorDriver {

    public static void main(String[] args) {

        Car myCar = new Car(123456, "Nissan", "Rogue", "grey");
        Car miaCar = new Car(987654, "Honda", "Civic", "white");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(miaCar);
        cars.add(myCar);
        cars.add(new Car(3768945, "Toyota", "Corolla", "blue"));
        cars.add((new Car(234565, "Chevy", "Aveo", "purple")));

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("----------");

        cars.sort(new CarComparator());

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("----------");

        Employee emp1 = new Employee("coarroyo", "Arroyo", 30);
        Employee emp2 = new Employee("Matt", "Arroyo", 28);
        Employee emp3 = new Employee("Carlos", "Smith", 25);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        employees.forEach(System.out::println);
//        employees.forEach(employee -> System.out.println(employee));

        System.out.println("+----------------------+");
        // using a lambda expression to create an inline implementation of a Employee Comparator

        employees.sort((employee1, employee2) ->{
            if (employee1.getAge() > employee2.getAge()) {
                return 1;
            }
            else if (employee1.getAge() < employee2.getAge()) {
                return -1;
            }
            else {

                int result = employee1.getLastName().compareTo(employee2.getLastName());

                if (result == 0) {
                    return employee1.getFirstName().compareTo(employee2.getFirstName());
                } else {
                    return result;
                }
            }
        });

        employees.forEach(System.out::println);// method reference

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
