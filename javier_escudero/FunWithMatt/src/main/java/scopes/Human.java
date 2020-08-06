package scopes;

public class Human {
/* Global Scope? No
everything must belong to a class

    Lifetime of a variable!
    Types:
    -Static or Class
        -Accessible to all members of a class: i.e. methods and fields
    -Method or local
        - Accessible within the method it is declared in
    -Block
        -Accessible inside of a block or control statement
        (i.e. loop)
    -Instance
        -Accessible inside of that specifi object

    Shadowing
        what occurs when variables in different scope have
        the same name. In this example, the setters

    What defined scope- {}
 */
    private String name;
    private int age;
    private int weight;
    static private String homePlanet = "Earth";
    // every human is from Earth, the static keyword makes it
    // belong to every instance of the object
    public String getHomePlanet() {
        return homePlanet;
    }

    public static void setHomePlanet(String homePlanet) {
        Human.homePlanet = homePlanet;
    }

    // no args constructor
    public Human(){
        //super();
    }
    public Human(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

//Human h = new Human();

    //getters and setters also called the accessors and mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {// name is a method scope
        this.name = name; // this.name refers to the
        // specific instance's field name
    }

    public int getAge() {// the font color is gray because is never used
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
                ", homePlanet=" + homePlanet +
                '}';
    }
}


