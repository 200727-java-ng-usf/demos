package com.revature.testing;

import java.math.BigInteger;

public class PrimeDetector {

    public boolean isPrime(int candidateNumber) {

        if (candidateNumber <= 1) return false;

        for (int i = 2; i <= candidateNumber/2; i++) {
            if (candidateNumber % i == 0) return false;
        }

        return true;

    }

}
