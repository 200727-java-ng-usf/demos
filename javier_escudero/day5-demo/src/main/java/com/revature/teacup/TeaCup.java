package com.revature.teacup;

public class TeaCup {
    private int volume = 8; //ounces
    private int condition = 100; // durability
    private String material = "ceramic"; //material
    private String color = "white"; // color
    private boolean broken = true;

    public void drink(){
        if( volume > 0)
        {
            volume--;
        }
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public void drop(){
        if (condition > 0){
            condition -= 25;
        }
        if (condition == 0){
            broken = true;
        }
        else {
            broken = true;
        }
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TeaCup() {
        this.volume = volume;
        this.condition = condition;
        this.material = material;
        this.color = color;


    }
}
