package com.revature.models;

import java.util.Objects;


public class Location {

    private int id;
    private int managerId;
    private String street;
    private String city;
    private String state;
    private int zip;

    public Location(int id, int managerId, String street, String city, String state, int zip) {
        this.id = id;
        this.managerId = managerId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", managerId=" + managerId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return id == location.id &&
                managerId == location.managerId &&
                zip == location.zip &&
                Objects.equals(street, location.street) &&
                Objects.equals(city, location.city) &&
                Objects.equals(state, location.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, managerId, street, city, state, zip);
    }
}
