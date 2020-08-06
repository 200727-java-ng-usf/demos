package com.revature.compare.models;

// This is a standard POJO or Plain Ol' Java Object template

import java.util.Comparator;
import java.util.Objects;

/*
    How to create a POJO
        - Declare Variables
        -


*/



public class Box implements Comparable<Box> {

    private double volume;
    private String color;



    public Box(double volue, String color) {
        this.volume = volue;
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volue) {
        this.volume = volue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.volume, volume) == 0 &&
                Objects.equals(color, box.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, color);
    }

    @Override
    public String toString() {
        return "Box{" +
                "volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }
    @Override
    public int compareTo(Box otherBox)
        {
        if ( this.volume > otherBox.volume)
        {
            return 1;
        }
        else if (this.volume > otherBox.volume){
            return -1;
        }
        else {
            return Double.compare(this.volume, otherBox.volume); // if both boxes have equal volume,
                                                                 // compare by color
            }

        // One-liner version of the above code (because Double implements Comparable
            //
    }


}
