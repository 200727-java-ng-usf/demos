package com.revature.abstractions.teacup;

public class TeaCup implements NotBroken, Worn {
    private String madeOf;
    private boolean hashandle;
    private int volume;
    private int quality;

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public boolean isHashandle() {
        return hashandle;
    }

    public void setHashandle(boolean hashandle) {
        this.hashandle = hashandle;
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

    public TeaCup(){
        this.madeOf = "ceramic";
        this.hashandle = true;
        this.volume =8;
        this.quality =10;
    }

    public TeaCup(String madeOf, boolean hashandle, int volume, int quality) {
        this.madeOf = madeOf;
        this.hashandle = hashandle;
        this.volume = volume;
        this.quality = quality;
    }

    @Override
    public void drop() {
        System.out.println("you dropped your tea cup");
        this.quality =- 5;
    }

    @Override
    public void use() {
        System.out.println("you enjoyed your tea");
        this.quality =- 1;

    }
}
