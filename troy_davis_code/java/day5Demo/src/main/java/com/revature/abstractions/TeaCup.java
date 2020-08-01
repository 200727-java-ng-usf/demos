package com.revature.abstractions;

public class TeaCup {
    public boolean isBreakable;
    public int capacity;
    public int ouncesInCup;
    public int opacity;
    public boolean microwavable;
    public int height;
    public int width;
    public String material;
    public boolean clean;
    public String brand;

    public TeaCup(){
        this.isBreakable = true;
        this.capacity = 100;
        this.ouncesInCup = 25;
        this.opacity = 90;
        this.microwavable = true;
        this.height = 4;
        this.width = 3;
        this.clean = true;
        this.material = "glass";
    }

    public TeaCup(boolean isBreakable, int capacity, int opacity,
                  boolean microwavable, int height, int width){

        this.isBreakable = isBreakable;
        this.capacity = capacity;
        this.ouncesInCup = 25;
        this.opacity = opacity;
        this.microwavable = microwavable;
        this.height = height;
        this.width = width;
        this.clean = true;
        this.material = "glass";
    }

    public String getMaterial() {
        return material;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
    public void setDirty() {
        this.clean = false;
    }

    @Override
    public String toString() {
        return "TeaCup{" +
                "isBreakable=" + isBreakable +
                ", capacity=" + capacity +
                ", ouncesInCup=" + ouncesInCup +
                ", opacity=" + opacity +
                ", microwavable=" + microwavable +
                ", height=" + height +
                ", width=" + width +
                ", material='" + material + '\'' +
                '}';
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isMicrowavable() {
        return microwavable;
    }

    public void setMicrowavable(boolean microwavable) {
        this.microwavable = microwavable;
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

    public int getOpacity() {
        return opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }

}
