package com.revature.teacup;

public class Teacup {

    private int volumeOfTeacup = 8; //ounces
    private int condition = 100; //condition / durability
    private String material = "ceramic";
    private String color = "white";
    private boolean broken = false;

    public Teacup() {
    }

    public void drink() {
        if (volumeOfTeacup > 0) {
            volumeOfTeacup--;
        }
    }

    public void drop() {
        if (condition > 0) {
            condition -= 25;
        }
        if (condition == 0) {
            broken = true;
        }
    }

    public Teacup(int volumeOfTeacup, int condition, String material, String color) {
        this.volumeOfTeacup = volumeOfTeacup;
        this.condition = condition;
        this.material = material;
        this.color = color;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public int getVolumeOfTeacup() {
        return volumeOfTeacup;
    }

    public void setVolumeOfTeacup(int volumeOfTeacup) {
        this.volumeOfTeacup = volumeOfTeacup;
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
}
