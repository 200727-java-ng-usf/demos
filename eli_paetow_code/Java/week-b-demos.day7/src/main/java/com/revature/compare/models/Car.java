package com.revature.compare.models;

import java.util.Objects;

public class Car {

    private int vin;
    private String make;
    private String Color;
    private String model;

    public Car(int vin, String make, String color, String model) {
        this.vin = vin;
        this.make = make;
        Color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", make='" + make + '\'' +
                ", Color='" + Color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getVin() == car.getVin() &&
                Objects.equals(getMake(), car.getMake()) &&
                Objects.equals(getColor(), car.getColor()) &&
                Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVin(), getMake(), getColor(), getModel());
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

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
