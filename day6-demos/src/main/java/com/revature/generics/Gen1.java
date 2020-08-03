package com.revature.generics;

public class Gen1<T> {

    T ob;

    public Gen1(T ob) {
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is : " + ob.getClass().getName());
    }
}
