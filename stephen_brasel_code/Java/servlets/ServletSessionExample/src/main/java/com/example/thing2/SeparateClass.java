package com.example.thing2;

import com.example.thingy.SuperClass;

public class SeparateClass {
	static SuperClass c = new SuperClass(1, 2, 3, 4);

	public static void foo() {
		System.out.println(c.d);
	}
}
