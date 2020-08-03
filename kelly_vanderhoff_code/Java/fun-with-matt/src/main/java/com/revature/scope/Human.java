package com.revature.scope;

public class Human {
    /* Global Scope? No!
        everything must belong to a class
        Lifetime of a variable
         - Static or Class
            + Accessible to all members of a class
         - Method or Local
            + Accessible within the method in which it is declared
         - Block
            + Accessible inside of a block or control statement
         - Instance or Object
            + Accessible inside of that specific object

        Shadowing
          what occurs when variables of different scope have the same name (identifier)


         What defines scope?  {...}
     */

    private String name;
    private int age;
    private int weight;
    private static String homePlanet = "Earth";

    // no-args constructor
    public Human() {
        // super(); // implicitly called
    }

    // parameterized constructor
    // constructor w/ fields
    public Human(String name, int age, int weight) {
        this();
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // accessors and mutators (getters and setters)
    public String getName() {
        return name;
    }

    // this is an example of shadowing vvv
    public void setName(String name) {// name is method scope
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

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", homePlanet=" + homePlanet +
                '}';
    }
}
