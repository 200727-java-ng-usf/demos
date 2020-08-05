package com.revature.abstractions;

public class TeaCup {


    int opacity;
    double height;
    double width;
    double durability;

    public TeaCup(int opacity, double height, double width, double durability) {
        this.opacity = opacity;
        this.height = height;
        this.width = width;
        this.durability = durability;
    }

    public int getOpacity() {
        return opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDurability() {
        return durability;
    }

    public void setDurability(double durability) {
        this.durability = durability;
    }

    public static void main(String[] args) {

        TeaCup teaCup = new TeaCup(100, 10,10,100);
        TeaCuptest.notTrasparent(teaCup.opacity);


    }

}
