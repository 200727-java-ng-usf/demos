package com.revature.testing;

public class PrimeDetecter {

	public boolean isPrime(int num){
		//check edge cases
		if(num <= 1) return false;
		//create return

		for (int i = 2; i < num/2; i++) {
			if(num % i == 0) return false;
		}
		return true;

	}
}
