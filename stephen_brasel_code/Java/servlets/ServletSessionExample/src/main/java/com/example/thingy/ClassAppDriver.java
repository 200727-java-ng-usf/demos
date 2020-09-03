package com.example.thingy;

import com.example.thing2.SubClass2;

public class ClassAppDriver {

	public static void main(String[] args) {
		SubClass thing = new SubClass(1, 2, 3, 4, 5);
		System.out.println(thing.getA());
		System.out.println(thing.getB());
		System.out.println(thing.getC());
		System.out.println(thing.getD());
		System.out.println(thing.thing);
		SubClass2 thing2 = new SubClass2(1, 2, 3, 4, 5);
		System.out.println(thing2.getA());
		System.out.println(thing2.getB());
		System.out.println(thing2.getC());
		System.out.println(thing2.getD());
		System.out.println(thing2.e);
	}
}
