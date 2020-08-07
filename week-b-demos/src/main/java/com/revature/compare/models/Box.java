package com.revature.compare.models;

import javax.sound.midi.VoiceStatus;
import java.util.Objects;

// Create a POJO * constructor  *getter and setter


public class Box implements Comparable<Box> {

    private double volume;
    private String color;

    public Box() {
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return Double.compare(box.getVolume(), getVolume()) == 0 &&
                Objects.equals(getColor(), box.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVolume(), getColor());
    }

    @Override
    public String toString() {
        return "Box{" +
                "volum=" + volume +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Box otherBox) {

        //  return  this.color.compareTo(box.color); // compare by color !

        if (this.volume > otherBox.volume) {
            return 1;
        } else if (this.volume < otherBox.volume) {
            return -1;
        } else
            return this.color.compareTo(otherBox.color);

        }
    }



