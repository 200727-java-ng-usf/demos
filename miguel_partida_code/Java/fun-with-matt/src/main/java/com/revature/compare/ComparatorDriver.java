package com.revature.compare;

import com.revature.compare.models.Car;
import com.revature.compare.models.Employee;
import com.revature.compare.models.util.CarComparator;

import java.util.ArrayList;

public class ComparatorDriver {
    /*
    Comparator
    - one method: int compare (t obj, t obj)
    - functional interface
    -returns
     */
    public static void main(String[] args) {

        Car myCar = new Car(456564, "Nissan", "Skyline", "Midnight-purple");
        Car miaCar = new Car(546455, "Honda", "Civic", "white");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(miaCar);
        cars.add(myCar);
        cars.add(new Car(456785, "Toyota", "Supra", "orange"));
        cars.add(new Car(123789, "Chevy", "Aveo", "green"));

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("+_______________+");

        cars.sort(new CarComparator());

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("+---------------------+");

        Employee emp1 = new Employee("Wezley", "singelton", 30);
        Employee emp2 = new Employee("Matt", "Knigthen", 30);
        Employee emp3 = new Employee("Blake", "Kruppa", 28);
        Employee emp4 = new Employee("August", "Duet", 37);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        employees.forEach(System.out::println);

        System.out.println("+----------------+");

        employees.sort((employee1, employee2) -> {
            if (employee1.getAge() > employee2.getAge()) {
                return 1;
            } else if (employee1.getAge() < employee2.getAge()) {
                return -1;
            } else {
                return employee1.getLastname().compareTo(employee2.getLastname());
            }
        });
        employees.forEach(System.out::println);
    }
}
/*
Rules for lambda expressions
- Can only be used to implement a functional interface inline
- Usage of parenthesis with parameters
    + if 0 parameters, you must include an empty set of parenthesis
    + if only 1 parameter, the parenthesis are optional
    + if 2+ parameters, you must include parenthesis
- Usage of curly braces
    + if the implementation is a one-liner,no braces needed or return
    + if the implementation logic is more than one statement
 */


