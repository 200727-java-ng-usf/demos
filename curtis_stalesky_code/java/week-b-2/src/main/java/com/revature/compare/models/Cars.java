package com.revature.compare.models;

import java.util.Objects;


// POJO's
// Make Variables
// Make Constructors
// Make Getters and Setters
// Make .equals() and .hashCode()
// Make .toString()

public class Cars {

    private int vin;
    private String make;
    private String model;
    private String color;

    public Cars(int vin, String make, String model, String color) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        Cars cars = (Cars) o;
        return vin == cars.vin &&
                make.equals(cars.make) &&
                model.equals(cars.model) &&
                color.equals(cars.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, make, model, color);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "vin=" + vin +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
