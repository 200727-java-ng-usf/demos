package com.revature.abstractions;

import java.awt.*;

public class TeaCup implements Pourable, Durability{
    public int volume = 10;
    public int mass = 10;
    public int velocity;
    public int density;
    public int molecularCount;
    public double durability = 5.0;
    public final double MAXDURABILITY = 5.0;
    public final int MAXVOLUME = 9000;
    public Color color = new Color(0, 255, 0);


    @Override
    public int pour(int amount) {
        if(volume - amount < 0) {
            volume = 0;
        } else {
            volume -= amount;
        }

        return volume;
    }

    @Override
    public int fill(int amount) {
        if(volume + amount > MAXVOLUME) {
            volume = MAXVOLUME;
        } else {
            volume += amount;
        }
        return volume;
    }

    @Override
    public void damage(double dmgAmount) {
        if(durability - dmgAmount < 0.0) {
            durability = 0.0;
            color = new Color(255, 0, 0);
        } else {
            durability -= dmgAmount;
        }
    }
}
