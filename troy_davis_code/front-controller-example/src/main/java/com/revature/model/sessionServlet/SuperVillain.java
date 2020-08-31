package com.revature.model.sessionServlet;

import java.util.Objects;

public class SuperVillain {

    private String name;
    private String superPower;
    private int bounty;

    /**
     * no arg constructor
     * all arg constructor
     */
    public SuperVillain(){
        super();
    }

    public SuperVillain(String name) {
        this.name = name;
    }

    public SuperVillain(String name, String superPower, int bounty) {
        this.name = name;
        this.superPower = superPower;
        this.bounty = bounty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public int getBounty() {
        return bounty;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SuperVillain)) return false;
        SuperVillain that = (SuperVillain) o;
        return getBounty() == that.getBounty() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getSuperPower(), that.getSuperPower());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSuperPower(), getBounty());
    }

    @Override
    public String toString() {
        return "SuperVillain{" +
                "name='" + name + '\'' +
                ", superPower='" + superPower + '\'' +
                ", bounty=" + bounty +
                '}';
    }
}
