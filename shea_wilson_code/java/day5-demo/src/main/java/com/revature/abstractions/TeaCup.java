package com.revature.abstractions;

public class TeaCup {
    public boolean isBreakable;
    public int capacity;
    public int ouncesInCup;

    public TeaCup(){
        super();
        this.isBreakable = true;
        this.capacity = 100;
        this.ouncesInCup = 25;
    }

    public boolean isBreakable() {
        return isBreakable;
    }

    public void setBreakable(boolean breakable) {
        isBreakable = breakable;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOuncesInCup() {
        return ouncesInCup;
    }

    public void setOuncesInCup(int ouncesInCup) {
        this.ouncesInCup = ouncesInCup;
    }

    @Override
    public String toString() {
        return "TeaCup{" +
                "isBreakable=" + isBreakable +
                ", capacity=" + capacity +
                ", ouncesInCup=" + ouncesInCup +
                '}';
    }
}

