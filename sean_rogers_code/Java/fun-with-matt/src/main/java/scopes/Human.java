package scopes;

public class Human {
    // does java have global scope?
    // no, everything must belong to a class
    // Lifetime of a variable
    // scopes:
    // Static (Class) - accessible to all members of a class

    // Method (local) - accessible to only the method it's declared in

    // Block - inside a block or control statement

    // Instance (object) accessible inside of that specific object

    // Shadowing what occurs when variables in different scopes have the same name




    // What defines scope? - curly braces {}
    private String name;
    private int age;
    private int weight;
    static private String homePlanet = "Earth";

    public Human() {
        //super();
    }

    //constructor w/ fields
    public Human(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //getters and setters (accessors and mutators)


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setHomePlanet(String str) {
        homePlanet = str;
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
