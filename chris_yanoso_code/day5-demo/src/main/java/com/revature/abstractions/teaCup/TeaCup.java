package com.revature.abstractions.teaCup;

public class TeaCup implements NotBroken, Worn {

    private String madeOf;
    private boolean hasHandle;
    private int volume;
    private int quality;

    public TeaCup() {
        this.madeOf = "Ceramic";
        this.hasHandle = true;
        this.volume = 8;
        this.quality = 10;
    }

    public TeaCup(String madeOf, boolean hasHandle, int volume, int quality) {
        this.madeOf = madeOf;
        this.hasHandle = hasHandle;
        this.volume = volume;
        this.quality = quality;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public boolean isHasHandle() {
        return hasHandle;
    }

    public void setHasHandle(boolean hasHandle) {
        this.hasHandle = hasHandle;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public void drop() {
        System.out.println("You dropped your teacup!");
        this.quality -= 5;

    }

    @Override
    public void use() {
        System.out.println("You enjoyed some tea from your teacup!");
        this.quality -= 1;
    }

    @Override
    public String toString() {
        return "TeaCup{" +
                "madeOf='" + madeOf + '\'' +
                ", hasHandle=" + hasHandle +
                ", volume=" + volume +
                ", quality=" + quality +
                '}';
    }

}
