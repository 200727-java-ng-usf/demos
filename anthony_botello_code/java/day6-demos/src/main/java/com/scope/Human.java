package com.scope;

import java.io.Serializable;

/*
    Java Bean example
*/

// Must be serializable
public class Human implements Serializable {

/* Scope
    - Scope can be thought of as the lifetime of a variable.

    - Java does NOT have global scope; everything must belong to a class.

    - Four types of scope:
        1) Class (or static) - accessible to all members of a class

        2) Instance - accessible inside of that specific object

        3) Method (or local) - accessible within the method it is declared in

        4) Block - accessible inside of a block or control statement

    - Scope is defined by braces {}.

*/

/* Shadowing
    - Shadowing is what occurs when varaibles in different scopes have the same name
*/

    // All members are private
    private String name;
    private int age;
    private int weight;
    
    private static String homePlanet = "Earth"; // same for all instances of 'Human'
    
    // No-args constructor
    public Human() {
    }

    // Optional: Constructor with fields
    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Getters and setters (accessors and mutators) for all private members
    public String getName() {
        return name;
    }

    // Example of shadowing
    public void setName(String name) {// parameter name is method scope
        this.name = name; // this.name refers to the specific instance's name field
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

    @Override
    public String toString() {
        return "Human [age=" + age + ", name=" + name + ", weight=" + weight + ", homePlanet=" + homePlanet + "]";
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }
    
}