package com.revature.compare;

import com.revature.compare.models.Car;
import com.revature.compare.models.Employee;
import com.revature.compare.util.CarComparator;

import java.util.ArrayList;

public class ComparatorDriver {
    public static void main(String[] args) {

        Car myCar = new Car(1232, "nissan","juke", "grey" );
        Car yourCar = new Car(48484, "batmobile", "tank", "black");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(myCar);
        cars.add(yourCar);
        cars.add(new Car(2322, "toyota", "corrola", "blue"));
        cars.add(new Car(1232, "Chevy", "avaio", "purple"));

        for (Car car: cars){
            System.out.println(car);
        }
        lineDivide();

        cars.sort(new CarComparator());
        for (Car car: cars){
            System.out.println(car);
        }

        lineDivide();

        Employee emp1 = new Employee("wez", "sing", 30);
        Employee emp2 = new Employee("matt", "knight", 30);
        Employee emp3 = new Employee("eli", "p", 99);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        employees.forEach(System.out::println);

        lineDivide();

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

    }
    public static void lineDivide(){
        System.out.println("-------------------------------------------------------------------");
    }
}
