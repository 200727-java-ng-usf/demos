public class Q1Sample {
    private String name;
    private boolean happy = false;

    public Q1Sample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void testQ1 () {
        happy = true;
    }
}
