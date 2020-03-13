package com.epsilon.training.day1.assignment4;

public class Main {
	
	public static void sortThreeNumbers(int a, int b, int c) {
		int tmp;
		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		if (c > a) // print in descending
		{
			System.out.println(b + ", " + a + " ," + c);
		} else {
			if (c > b) {
				tmp = b;
				b = c;
				c = tmp;
			}
			System.out.println(c + ", " + b + ", " + a);
		}
	}

	public static void main(String[] args) {
		sortThreeNumbers(1, 2, 3);
		sortThreeNumbers(3, 2, 1);
		sortThreeNumbers(3, 1, 2);
	}

}
