package com.epsilon.training.day1.assignment3;

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

	public static void main(String[] args) {
		int n = 5;
		System.out.println(" n = " + n);
		for (int i = 1; i < n; i++) {
			System.out.println("i = " + i + " is prime : " + isPrimeNumber(i));
		}
	}

}
