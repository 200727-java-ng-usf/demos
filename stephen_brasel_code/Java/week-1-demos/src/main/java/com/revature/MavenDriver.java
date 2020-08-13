package com.revature;

public class MavenDriver {
	public static void main(String[] args) {
		if(args.length <= 0){
			System.out.println("No Arguments provided.");
		} else{
			for (String arg : args) {
				System.out.println("Provided argument: " + arg);
			}
		}
	}
}
