package scopes;

public class Human {
    //bean plain old java object
    //bean is a representation of something
    // Lifetime of a reference
    //Types:
    //when we talk about scope it is in context of refrences
    // java does not have global scope
    //everything must belong to a class
    // static or class
    //-static accessible to all members of a class   //if another method needs to interact with a field it will have access to it
    //method or local
    //Accessible within the method it is declared in
    //block; instance
    //block accessible inside of a block or control statement
    //instance - accessible inside of that specific object
    //Shadowing - what occurs when variables in different scopes have the same name
    //What defines scope?-{}

    private String name;
    private int age;
    private int weight;
    static private String homePlanet = "Earth";

    public String getHomePlanet(){
        return homePlanet;
    }
    public void setHomePlanet(String homePlanet){
        this.homePlanet= homePlanet;
    }
    //how to make new methods create constructors
    //no args constructor
    public Human(){

    }
    //constructor with fields
    public Human(String name , int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    //getter and setters \\accessors and mutators


    public String getName() {
        return name;
    }

    public void setName(String name) {//name is method scope
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;// this . age refers to the specific instance's name field
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" + "name='" + name + '\'' + ", age=" + age + ", weight=" + weight + ", homePlanet=" + homePlanet +'}';
    }
}
