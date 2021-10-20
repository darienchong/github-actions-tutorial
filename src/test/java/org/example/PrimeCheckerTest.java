package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeCheckerTest {
	@Test
	public void commonPrimes() {
		// Test on a few common primes first
		assertTrue(PrimeChecker.isPrime(3));
		assertTrue(PrimeChecker.isPrime(5));
		assertTrue(PrimeChecker.isPrime(17));
	}
	
	@Test
	public void largePrime() {
		// Test on a large prime
		assertTrue(PrimeChecker.isPrime(2147483647));
	}
	
	@Test
	public void edgeCases() {
		// Common edge cases for primality:
		assertFalse(PrimeChecker.isPrime(0));
		assertFalse(PrimeChecker.isPrime(1));
		assertFalse(PrimeChecker.isPrime(2));
	}
}
