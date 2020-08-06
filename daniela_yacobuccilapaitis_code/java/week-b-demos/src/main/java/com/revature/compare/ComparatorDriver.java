package com.revature.compare;

import com.revature.compare.models.Car;
import com.revature.compare.models.Employee;
import com.revature.compare.util.CarComparator;
import com.sun.javaws.IconUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorDriver {

    public static void main(String[] args) {


        Car myCar = new Car (123456, "Nissan", "Rogue", "grey");
        Car miaCar = new Car (987654, "Honda", "Civic", "white");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(myCar);
        cars.add(new Car(193752, "Toyota", "Corolla", "blue"));
        cars.add(miaCar);

        for(Car car : cars) {
            System.out.println(car);
        }

        cars.sort(new CarComparator());

        System.out.println("+-------------------+");

        for(Car car : cars) {
            System.out.println(car);
        }

        System.out.println("+-------------------+");

        Employee emp1 = new Employee("Dani","Yaco",22);
        Employee emp2 = new Employee("Mia","Capp",22);
        Employee emp3 = new Employee("Joa","Mica",21);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        employees.forEach(System.out::println);

        System.out.println("+-------------------+");

        employees.sort((employee1, employee2) -> {
           if (employee1.getAge() > employee2.getAge()) return 1;
           else if (employee1.getAge() < employee2.getAge()) return -1;
           else return employee1.getLastName().compareTo(employee2.getLastName());
           //can also add comparing name, got github
        });

        employees.forEach(System.out::println);

    }
}
