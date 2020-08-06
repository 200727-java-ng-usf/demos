package com.revature.compare;

import com.revature.compare.models.Employee;
import com.revature.compare.models.Vehicle;
import com.revature.compare.util.VehicleComparator;

import java.util.ArrayList;

/*
    Comparator

        - one method: int compare(T obj1, Tobj2)
        - functional interface
        - returns an int value which is either negative, zero, or positive (by default: lass than equal to, or greater than)

 */
public class ComparatorDriver {
    public static void main(String[] args) {

        Vehicle myCar = new Vehicle(123456, "Nissan", "Rogue", "grey");
        Vehicle miaCar = new Vehicle(987654, "Honda", "Civic", "white");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(myCar);
        vehicles.add(new Vehicle(3546748, "Toyota", "Corola", "blue"));
        vehicles.add(new Vehicle(2354748, "Chevy ", "Aveo", "purple"));
        vehicles.add(miaCar);

        for (Vehicle vic : vehicles) {
            System.out.println(vic);
        }

        System.out.println("+-----------------------------------------+");

        vehicles.sort(new VehicleComparator());

        for (Vehicle vic : vehicles) {
            System.out.println(vic);
        }

        System.out.println("+-----------------------------------------+");

        Employee emp1 = new Employee("Wezley", "Singleton", 30);
        Employee emp2 = new Employee("Matt", "Knighten", 30);
        Employee emp3 = new Employee("Blake", "Kruppa", 28);
        Employee emp4 = new Employee("August", "Duet", 37);
        Employee emp5 = new Employee("Nicole", "Singleton", 30);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        employees.forEach(System.out::println); // <---- method reference
        System.out.println("+-----------------------------------------+");

        employees.sort((em1, em2) -> {
            if(em1.getAge() > em2.getAge()) return 1;
            else if(em1.getAge() < em2.getAge()) return -1;
            else{
                int result = em1.getLastName().compareTo(em2.getLastName());
                if(result == 0){
                    return em1.getFirstName().compareTo(em2.getFirstName());
                } else return result;
            }
        });
        employees.forEach(System.out::println); // <---- method reference

        /*
            Rules for Lambda Expressions:

                1. Can only be used with (abstract) functional interface inline.
                2. Usage of parenthesis with parameters:
                    - if 0 parameters, you must include an empty set of parentheses
                    - if only 1 parameter, the parentheses are optional.
                    - if 2+ parameters, you must include parameters
                3. Usage of curly braces:
                    - if the implementation loic is a one-liner, no braces needed (also, no return keyword needed either)
                    - if hte implementation logic is more than one statement, braces are required.

         */

    }
}
