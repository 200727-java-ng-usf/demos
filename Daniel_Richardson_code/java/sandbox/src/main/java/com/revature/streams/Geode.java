package com.revature.streams;

public class Geode {

    private String name;
    private String color;

    public Geode(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Geode{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
