package com.revature.teacup;

public class TeaCup {
    private  int cupNum;
    private  boolean broken;

    public TeaCup() {
    }

    public TeaCup(int cupNum) {
        this.cupNum = cupNum;
    }

    public TeaCup(int cupNum, boolean broken) {
        this.cupNum = cupNum;
        this.broken = broken;
    }

    public void drop(int cupNum){
        broken = true;
        System.out.println(cupNum + " cups are dropping.");
    }

    public void onTable(int cupNum){
        System.out.println(cupNum + " cups are dropping.");
    }

    public boolean afterDrop(){
        this.broken = true;
        return true;
    }

    public int getCupNum() {
        return cupNum;
    }

    @Override
    public String toString() {
        return
                "cupNum=" + cupNum +
                ", broken=" + broken;
    }
}
