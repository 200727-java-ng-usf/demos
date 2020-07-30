package com.revature;

public class Question1 {
 private String name;

    public Question1() {
    }

    public Question1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Question1{" +
                "name=" + name + "}";
    }
}
