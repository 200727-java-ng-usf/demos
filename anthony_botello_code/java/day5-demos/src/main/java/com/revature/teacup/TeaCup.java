package com.revature.teacup;

public class TeaCup {
    
    private int volume = 8; // defaults to 8 oz
    private int condition = 100; // wear and tear on the teacup;
    private String material = "Ceramic";
    private String color = "White";
    private boolean broken = false;

    public TeaCup() {}

    public TeaCup(int volume, int condition, String material, String color) {
        this.volume = volume;
        this.condition = condition;
        this.material = material;
        this.color = color;
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

    public void drink(){
        if(volume > 0) volume--;
    }

    public void drop(){
        if(condition > 0) condition -= 25;
        if(condition == 0) broken = true;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }
    
}