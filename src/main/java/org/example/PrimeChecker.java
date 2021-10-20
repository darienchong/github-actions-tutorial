package org.example;

public class PrimeChecker {
	public static boolean isPrime(int x) {
		// Test all divisors up to sqrt(x)
		int limit = (int) Math.floor(Math.sqrt(x));
		for (int divisor = 2; divisor <= limit; divisor++) {
			if (x % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
