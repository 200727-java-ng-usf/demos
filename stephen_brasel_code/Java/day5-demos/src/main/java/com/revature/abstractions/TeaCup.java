package com.revature.abstractions;

import java.awt.*;

public class TeaCup extends Cup implements Durability {
    public Color color = new Color(0, 255, 0);

    public TeaCup() {
        super();
        this.durability = 5.0;
    }

    public TeaCup(Color color) {
        this();
        this.color = color;
    }

    @Override
    public void damage(double dmgAmount) {
        if (durability - dmgAmount < 0.0) {
            durability = 0.0;
            color = new Color(255, 0, 0);
        } else {
            durability -= dmgAmount;
        }
    }
}