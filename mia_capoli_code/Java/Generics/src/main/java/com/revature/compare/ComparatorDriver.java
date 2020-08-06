package com.revature.compare;

/*
    Comparator

        -one method: int compare(T obj1, T obj2)
        -compares two separate objects
        -functional interface
        -returns an int value which is either negative, zero, or positive (indicate less than, equal to or greater than)
 */

import com.revature.compare.models.Car;
import com.revature.compare.models.Employee;
import com.revature.compare.util.CarComparator;

import java.util.ArrayList;

public class ComparatorDriver {
    public static void main(String[] args) {

        Car myCar = new Car(123456, "Nissan", "Rouge", "Grey");
        Car miaCar = new Car(180324, "Honda", "Civic", "White");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(172949, "Toyota", "Corolla", "Blue"));
        cars.add(myCar);
        cars.add(new Car(238438, "Chevy", "Aveo", "Purple"));
        cars.add(miaCar);

        for (Car car : cars) {
            System.out.println(car);
        }

        cars.sort(new CarComparator());

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        Employee emp1 = new Employee("Wezley", "Singleton", 30);
        Employee emp2 = new Employee("Matt", "Knighten", 30);
        Employee emp3 = new Employee("Blake", "Kruppa", 28);
        Employee emp4 = new Employee("Mia", "Capoli", 22);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        employees.forEach(System.out::println); // <------ method reference

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        employees.sort((employee1, employee2) -> {
            if (employee1.getAge() > employee2.getAge()) {
                return 1;
            } else if (employee1.getAge() < employee2.getAge()) {
                return -1;
            } else {
                int result = employee1.getLastName().compareTo(employee2.getLastName());

                if (result ==0) {
                    return employee1.getFirstName().compareTo(employee2.getFirstName());
                } else {
                    return result;
                }
            }
        });
        employees.forEach(System.out::println);

        /*
        Rules for lambda expressions:
            -can only be used to implement a functional interface inline
	        -Usage of parentheses with parameters
		        -If 0 parameters, you must include an empty set of parentheses
		        -If only one parameter, parentheses are optional
		        -If two or more parameters, parentheses are required.
	        -Usage of curly braces
		        -If the implementation logic is a one-liner, no braces needed. (also no return   keyword)
		        -If the implementation logic is more than one line, braces are required.

         */
    }
}

