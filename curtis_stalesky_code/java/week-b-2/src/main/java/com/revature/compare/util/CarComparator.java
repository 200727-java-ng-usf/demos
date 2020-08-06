package com.revature.compare.util;

import com.revature.compare.models.Cars;

import java.util.Comparator;

public class CarComparator  implements Comparator<Cars> {

    @Override
    public int compare(Cars car1, Cars car2)
    {
       if (car1.getVin() > car2.getVin())
       {return 1; }
       else if (car1.getVin() < car2.getVin())
       { return -1; }
       else return 0;



   }

}



