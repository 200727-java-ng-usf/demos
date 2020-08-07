package com.revature.compare.util;

import com.revature.compare.models.Car;

import java.util.Comparator;

public class vinComparator implements Comparator<Car>{
    @Override
    public int compare(Car car1, Car car2) {

        // one-line version

      if(car1.getVin() > car2.getVin())  return 1;
      else if (car1.getVin() < car2.getVin())return -1;
      else return 0;
    }


}
