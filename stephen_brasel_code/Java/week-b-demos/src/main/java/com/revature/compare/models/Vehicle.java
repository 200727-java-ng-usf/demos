package com.revature.compare.models;

import java.util.Comparator;
import java.util.Objects;

public class Vehicle{
    private int vin;
    private String make;
    private String model;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int vin, String make, String model, String color) {
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
        Vehicle vehicle = (Vehicle) o;
        return vin == vehicle.vin &&
                Objects.equals(make, vehicle.make) &&
                Objects.equals(model, vehicle.model) &&
                Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, make, model, color);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN=" + vin +
                ", Make='" + make + '\'' +
                ", Model='" + model + '\'' +
                ", Color='" + color + '\'' +
                '}';
    }
}
