package scopes;
/*
        Java Bean

 */

/*
        Lifetime of a field
        Class Scope (Static Scope)
            -Accessible to all members of a class
        Method Scope (Local Scope)
            -Accessible within the method it is declared in
        Block Scope
            -Accessible inside of a block or control statement
        Instance Scope
            -Accessible inside that specific
        NO GLOBAL SCOPE
        {} - Defines the scope
*/
public class Human {

        private String name;
        private int age;
        private int weight;
        static private String homePlanet;

    public static String getHomePlanet() {
        return homePlanet;
    }

    public static void setHomePlanet(String homePlanet) {
        Human.homePlanet = homePlanet;
    }

    public Human() {

    }

    // no args constructor
        /*public Human(){
            super();
        }*/

    //accessors and mutators

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

    //constructor with fields
        public Human(String name, int age, int weight){
            this.name = name;
            this.age=age;
            this.weight=weight;
        }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ",home planet"+homePlanet+
                '}';
    }
}
