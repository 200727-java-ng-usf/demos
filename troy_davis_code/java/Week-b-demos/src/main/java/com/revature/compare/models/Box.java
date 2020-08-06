package com.revature.compare.models;

import java.util.Objects;

public class Box implements  Comparable<Box>{ // make it comparable to other boxes

    private double volume;
    private String color;
    //How to create a pojo
    //declare variables
    //declare constructors
    //declare getters and setters
    // override hashCode, equals and toString
    public Box(double volume, String color) {
        this.volume = volume;
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box{" +
                "volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return Double.compare(box.volume, volume) == 0 &&
                Objects.equals(color, box.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, color);
    }
    @Override
    public int compareTo(Box otherBox){
        //this.color.compareTo(box.color);
        //one liner:
        //return Double.compare(this.volume, otherBox.volume);
        if(this.volume > otherBox.volume){
            return 1;
        }else if(this.volume < otherBox.volume){
            return -1;
        }else {
            return -this.color.compareTo(otherBox.color); // secondary sort by color, if both boxes have equal volume
        }
    }
}
