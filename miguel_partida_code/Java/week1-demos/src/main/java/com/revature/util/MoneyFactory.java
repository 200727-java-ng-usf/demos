package com.revature.util;

import com.revature.patterns.*;
/*
 * Pros:
 * 		1) Factory method design pattern decouples the calling class from
 * 		   the target class, which result in less coupled and highly cohesive code.
 *
 * 		2) Factory pattern in Java enables the subclasses to provide extended
 * 		   version of an object, because creating an object inside factory is more
 * 		   flexible than creating an object directly in the client. Since client is
 * 		   working on interface level any time you can enhance the implementation and
 * 		   return from Factory.
 *
 * 		3) Another benefit of using Factory design pattern in Java is that it encourages
 * 		   consistency in Code since every time object is created using Factory rather
 * 		   than using different constructor at different client side.
 *
 * 		4) Code written using Factory design pattern in Java is also easy to debug and
 * 		   troubleshoot because you have a centralized method for object creation and
 * 		   every client is getting object from same place.
 */
/*
 * Cohesion refers to what the class (or module) can do.
 *
 * Low cohesion would mean that the
 * class does a great variety of actions - it is broad, unfocused on what it should do.
 *
 * High cohesion means that the class is focused on what it should be doing, i.e. only
 * methods relating to the intention of the class.
 *
 * -------------------------------------------------------------------------------------
 *
 * Coupling refers to how related or dependent two classes/modules are toward each other.
 *
 * For low coupled classes, changing something major in one class should not affect the other.
 * Tight coupling would make it difficult to change and maintain
 * High coupling would make it difficult to change and maintain your code; since classes are
 * closely knit together, making a change could require an entire system revamp.
 *
 * Good software design has high cohesion and low coupling.
 */
public class MoneyFactory {

    public static Currency printMoney(String country){

        switch (country.toLowerCase()){
            case "usa":
            case "america":
                return new Dollar();
            case "germany":
            case "france":
            case "belgium":
            case "italy":
                return new Euro();
            case "venezuela":
                return new Bolivar();
            default:
                return new Bitcoin();
        }
    }
}
