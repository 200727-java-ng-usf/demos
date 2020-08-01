package com.revature.abstractions;

public class TeaCup {

    private final int size = 8;
    private int volume = 0;
    private String drink = "";

    public boolean isEmpty() {
        return this.volume == 0;
    }

    public void fill(String drink) {
        this.volume = this.size;
        this.drink = drink;
    }

    public String getDrink() {
        return this.drink;
    }

    public boolean hasHandle() {
        return true;
    }

    public int size() {
        return this.size;
    }

    public void drink() {
        this.volume = 0;
    }

    public int getRemainder() {
        return this.volume;
    }

    public void drink(int ounces) {
        if (this.volume > ounces) {
            this.volume -= ounces;
        } else {
            this.volume = 0;
        }
    }
}
