package com.revature.compare;

import com.revature.compare.models.Car;
import com.revature.compare.models.Employee;
import com.revature.compare.util.VinComparator;

import java.util.ArrayList;
import java.util.Arrays;

public class ComparatorDriver {
    public static void main(String[] args) {
        Car myCar = new Car(123456, "Chevy", "Metro", "Silver");
        Car miaCar = new Car(987654, "Honda", "Civic", "White");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(miaCar);
        cars.add(new Car(3768945, "Toyota", "Corolla", "Blue"));
        cars.add(new Car(3768945, "Honda", "Accord", "Gray"));

        for(Car car : cars) {
            System.out.println(cars);
        }
        System.out.println("+----------------------+");

        cars.sort(new VinComparator());

        for(Car car : cars) {
            System.out.println(cars);
        }

        System.out.println("+--------------------------------+");

        Employee emp1 = new Employee("Wezley", "Singleton", 30);
        Employee emp2 = new Employee("Matt", "Knighten", 30);
        Employee emp3 = new Employee("Blake", "Kruppa", 28);
        Employee emp4 = new Employee("August", "Duet", 37);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        employees.forEach(System.out :: println);
        System.out.println("+---------------------+");

        employees.sort((employee1, employee2) -> {
            if(employee1.getAge() > employee2.getAge()) return 1;
            else if(employee2.getAge() < employee2.getAge()) return -1;
            else return employee1.getLastname().compareTo(employee2.getLastname());
        });

        employees.forEach(System.out :: println);
    }

}
