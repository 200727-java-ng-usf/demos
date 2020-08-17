package com.revature;

import com.revature.patterns.*;
import com.revature.util.MoneyFactory;

public class PatternDriver {

//	private static EagerSingleton eagerSingleton = EagerSingleton.getInstance();

	public static void main(String[] args) {

		System.out.println("Main Method started");

//		getSingletons();

//		case "usa": case "america":
//		return new Dollar();
//		case "germany":
//		case "france":
//		case "belgium":
//		case "italy":
//		return new Euro();
//		case "venezuela":
//		return new Bolivar();
//		case "japan":

		String country = "america";
		Currency usa = MoneyFactory.printMoney(country);
		System.out.println("USA Currency symbol: " + usa.getSymbol());

		country = "venezuela";
		Currency vnzla = MoneyFactory.printMoney(country);
		System.out.println(country.toUpperCase() + " Currency symbol: " + vnzla.getSymbol());

		country = "germany";
		Currency germany = MoneyFactory.printMoney(country);
		System.out.println("Germany Currency symbol: " + germany.getSymbol());

		country = "south korea";
		Currency south_korea = MoneyFactory.printMoney(country);
		System.out.println("South Korea Currency symbol: " + south_korea.getSymbol());

		System.gc();

	}

	private static void getSingletons() {
		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
		EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
		System.out.println(eagerSingleton1 == eagerSingleton2);

		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println(lazySingleton1 == lazySingleton2);
	}
}
