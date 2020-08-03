package com.revature.scopes;

//this is a java Bean demonstration
public class Human {
    /*
        Does Java have Global Scope?
            - NO!
            - Everything must belong to a class
            - Scope is the LIFETIME of a variable!
        Types of Scopes in Java:
            - Static or Class
                - Accessible to all members of a class
                    - (Constructors, Methods, Fields, Blocks{stuff on curly braces} )
            - Method or Local
                - Accessible within method it is declared in
            - Block
                - Accessible inside of a block or control statement
                - loops variables, etc..
            - Instance
                - Accessible inside of that specific object

            Shadowing:
                - what occurs when diff. variables of the same scope have the same name.
                - only applicable to fields

         What defines scope? - {}
     */

    private String name;
    private int age;
    private int weight;
    static private String homePlanet = "Earth";

    //no args constructor for java bean
    public Human(){
        //super();
    }

    //constructor with fields
    public Human(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    //Example of shadowing
    public void setName(String name) {//name is method scope
        this.name = name; //this.name refers to the specific instance name field.

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
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", home planet=" + homePlanet +
                '}';
    }

}
