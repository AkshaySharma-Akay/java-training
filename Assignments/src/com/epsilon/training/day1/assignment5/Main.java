package com.epsilon.training.day1.assignment5;

public class Main {

	// Assignment 3
	static boolean isPrimeNumber(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % 2 == 0)
				return false;
		}
		return true;
	}

	// Assignment 5 :
	public static int sumOfPrimes(int from, int to) {
		if (from > to) {
			int tmp = to;
			to = from;
			from = tmp;
		}
		int sum = 0;
		for (int i = from; i <= to; i++) {
			if (isPrimeNumber(i))
				sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int x = 1, y = 100;
		System.out.println("Sum of primes from " + x + " to " + y + " = " + sumOfPrimes(x, y));
	}

}
