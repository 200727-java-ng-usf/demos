package com.revature.compare;

import com.revature.compare.models.Car;
import com.revature.compare.util.CarComparator;

import java.util.ArrayList;

public class ComparatorDriver {

    //comparator
    //method: int compare(T obj1, T obj2)
    //functional interface
    //returns int

    public static void main(String[] args) {

        Car myCar = new Car(42842, "Nissan", "Rogue", "Grey");
        Car yourCar = new Car(91919, "Mitsubishi", "Zero", "White");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(myCar);
        cars.add(yourCar);
        cars.add(new Car(12392, "Toyota", "Knight", "Red"));
        for (Car car : cars){
            System.out.println(car);
        }
        System.out.println("---");

//        cars.sort(new CarComparator());


        //this is an inline comparator implementation
        //uses a lambda expression to implement comparator
        cars.sort((car1, car2) ->{
            if(car1.getVin() > car2.getVin()) return 1;
            else if (car1.getVin() < car2.getVin()) return -1;
            //else return 0;
            else return car1.getMake().compareTo(car2.getMake()); //fallback to comparing make, returns 0 etc
            });
        //lambda expressions:
        //can only be used to implement a functional interface inline
        //use of parenthesis in parameters
        //if 0 parameters, must include empty set of parenthesis
        //if only 1 param, parenthesis optional
        //2+ params require parenthesis
        //usage of curly braces
          // if implementation is one-line, no braces needed.
          //if implementation is multiline/multi-statement, require braces


        for (Car car : cars){
            System.out.println(car);
        }

    }

}
