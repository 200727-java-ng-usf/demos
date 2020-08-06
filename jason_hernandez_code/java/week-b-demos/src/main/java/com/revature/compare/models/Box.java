package com.revature.compare.models;

public class Box implements Comparable<Box>{
    private double volume;
    private String color;

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
    public int compareTo(Box otherBox) {
        if(this.volume > otherBox.volume) {
            return 1;
        } else if (this.volume < otherBox.volume){
            return -1;
        } else {
            return 0;
        }
    }
}
