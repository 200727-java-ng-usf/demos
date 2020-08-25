package com.revature.classRelationship;

public class Father {

    Son son;
    private int a;
    private String s;

    public Father() {
    }

    public Father(Son son) {
        this.son = son;

    }

    public Son getSon() {
        return son;
    }

    public void setSon(Son son) {
        this.son = son;
    }
}
