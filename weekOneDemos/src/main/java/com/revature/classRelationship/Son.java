package com.revature.classRelationship;

public class Son {
    GrandDaughter grandDaughter;
    GrandSon grandSon;
    private int money;

    public Son() {
    }

    public int getMoney() {
        return money;
    }

    public Son(int money) {
        this.money = money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public GrandSon getGrandSon() {
        return grandSon;
    }

    public void setGrandSon(GrandSon grandSon) {
        this.grandSon = grandSon;
    }

    public GrandDaughter getGrandDaughter() {
        return grandDaughter;
    }

    public void setGrandDaughter(GrandDaughter grandDaughter) {
        this.grandDaughter = grandDaughter;
    }
}
