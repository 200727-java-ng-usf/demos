package com.revature.scope;

import java.util.Objects;

public class Human {

    /*
        Global scope? Nope!
        everything must belong to a class
        Lifetime of a Variable!
        -Static or Class
            - Accessible to all members of a class
        -Instance
            - Accessible inside of specific object.
        -Method or Local
            - Accessible within the method it is declared in
        -Block
            - Accessible inside of a block or control statement

        - Shadowing
            - What occurs when variables in different scopes have the same name
            - this.name = name;

        What defines scope:
            {}
     */

    private String name;    //field
    private int age;        //field
    private int weight;     //field
    private static String homePlanet = "Mars";

    // no args constructor
    public Human() {
        //super();

    }
    private class Leg{
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    //parameterized constructor
    public Human(String name, int age, int weight) {
        this();
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //getters and setters (accessors and mutators)

    public String getName() {
        return name;
    }

    public void setName(String name) {      // name is in method scope
        this.name = name;                   // this.name refers to the speciifc instance's name field
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public static void setHomePlanet(String home_planet) {
        homePlanet = home_planet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                weight == human.weight &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", home planet=" + homePlanet +
                '}';
    }
}
