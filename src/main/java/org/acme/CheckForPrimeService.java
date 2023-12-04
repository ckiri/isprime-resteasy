package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import java.math.BigInteger;

@ApplicationScoped
public class CheckForPrimeService {

    public boolean isPrime(BigInteger number) {
        if (number.compareTo(BigInteger.ONE) <= 0) {
            return false;   // Primes start at 2
        }

        for (BigInteger i = BigInteger.valueOf(2); i.multiply(i).compareTo(number) <= 0; i = i.add(BigInteger.ONE)) {
            if (number.mod(i).equals(BigInteger.ZERO)) {
                return false;   // number is dividable by a number other than 1 and itselve
            }
        }
        return true;    // no other divider then 1 and number found, number is a prime
    }
}
