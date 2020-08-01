package com.revature.abstractions;

public class teaCup implements holdsLiquid {
    public boolean magic;

    public teaCup(){
    this.magic = true;

    }


    public boolean isMagic() {
        return magic;
    }

    public void setMagic(boolean magic) {
        this.magic = magic;
    }

    public void holding(){
        System.out.println("I am holding liquid");

    }

}
