package com.revature.compare.util;

import com.revature.compare.models.Vehicle;

import java.util.Comparator;

public class VehicleComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle v1, Vehicle v2) {

        if (v1.getVin() < v2.getVin()) {
            return -1;
        } else if (v1.getVin() > v2.getVin()) {
            return 1;
        } else {
            return 0;
        }

        //one-liner version below
//        return Integer.compare(v2.getVin(), v1.getVin());
    }

}
