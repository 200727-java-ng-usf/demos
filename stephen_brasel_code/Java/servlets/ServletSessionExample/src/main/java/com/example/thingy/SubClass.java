package com.example.thingy;

public class SubClass extends SuperClass {
	public int thing = 0;

	public SubClass(int a, int b, int c, int d, int thing) {
		super(a, b, c, d);
		this.thing = thing;
	}
}
