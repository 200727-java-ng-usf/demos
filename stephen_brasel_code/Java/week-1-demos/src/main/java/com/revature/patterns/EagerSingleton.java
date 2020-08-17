package com.revature.patterns;

/*
	Singletons:

	-
 */
public class EagerSingleton {

	//A static member of type MySingleton holds the one and only instance of this type
	//eager singleton (will be pre-instantiated.
	private static EagerSingleton onlyInstance = new EagerSingleton();

	// private constructor, so that other classes cannot invoke it
	private EagerSingleton() {
		super();
		System.out.println("EagerSingleton.new invoked!");
	}

	public static EagerSingleton getInstance() {

		return onlyInstance; // no need to do a null check for eager singletons.
	}

	//Object supports cloning by default. Singletons should override that so multiple copies do not exist.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
}
