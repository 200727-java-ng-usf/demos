package com.revature.compare.util;


import com.revature.compare.models.Car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Integer.compare(car1.getVin(), car2.getVin());
        //        if(car1.getVin()>car2.getVin()) return 1;
        //        else if (car1.getVin()<car2.getVin()) return -1;
        //        else return 0;
    }
}
