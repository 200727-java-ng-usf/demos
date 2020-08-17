package com.revature.patterns;

/*
	Singletons:

	-
 */
public class LazySingleton {

	//A static member of type LazySingleton holds the one and only instance of this type
	// lazy singleton (not pre-instantiated)
	private static LazySingleton onlyInstance;

	// private constructor, so that other classes cannot invoke it
	private LazySingleton() {
		super();
		System.out.println("LazySingleton.new invoked");
	}

	public static LazySingleton getInstance() {
		return onlyInstance == null
				? onlyInstance = new LazySingleton()
				: onlyInstance;
	}

	//Object supports cloning by default. Singletons should override that so multiple copies do not exist.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
}
