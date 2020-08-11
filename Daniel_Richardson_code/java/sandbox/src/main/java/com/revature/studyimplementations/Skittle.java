package com.revature.studyimplementations;

import java.util.Objects;

public class Skittle {

    private String color;
    private String flavor;
    private int printedNumber;

    public Skittle(String color, String flavor, int printedNumber) {
        this.color = color;
        this.flavor = flavor;
        this.printedNumber = printedNumber;
    }

    public Skittle(){};
    public Skittle(Boolean b){
        if(b==true){
            this.color = SkittleRandomizer.colorMaker();
            this.flavor = SkittleRandomizer.flavorMaker();
            this.printedNumber = SkittleRandomizer.numberPrinter();
        } else {
            System.out.println("Boolean must be true for randomization.");
        }
    }
    public Skittle(Boolean b, int uniqueNumber){
        if(b){
            this.color = SkittleRandomizer.colorMaker();
            this.flavor = SkittleRandomizer.flavorMaker();
            this.printedNumber = uniqueNumber;
        } else {
            System.out.println("Boolean must be true for randomization.");
        }
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrintedNumber() {
        return printedNumber;
    }

    public void setPrintedNumber(int printedNumber) {
        this.printedNumber = printedNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skittle skittle = (Skittle) o;
        return printedNumber == skittle.printedNumber &&
                Objects.equals(color, skittle.color) &&
                Objects.equals(flavor, skittle.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, flavor, printedNumber);
    }

    @Override
    public String toString() {
        return "Skittle{" +
                "color='" + color + '\'' +
                ", flavor='" + flavor + '\'' +
                ", printedNumber=" + printedNumber +
                '}';
    }
}
