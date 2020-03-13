package com.epsilon.training.day1;

import java.util.Arrays;

/**
 * 
 * @author akshay
 * Contains Assignment : 6,7,8,10
 */
public class Main {

	//Assignment 6:
	public static int fibonacci(int index) { 
		int fib=0,fib1 = 0, fib2 = 1;
		if(index == 1)
			return 0;
		if(index == 2)
			return 1;
		for(int i=3;i<=index;i++) {
			fib = fib2 + fib1;
			fib1 = fib2;
			fib2 = fib;
		}
		return fib;
	}
	
	//Assignment 7:
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
				System.out.print("*");
			System.out.println();
		}
	}
	
	//Assignment 8
	public static double pow(double x,int n) {
		if(n == 0) return 1;
		if(n == 1) return x;
		double ans=x;
		for(int i=2;i<=n;i++)
		{
			ans = ans *x;
		}
		return ans;
	}
	public static int fact(int n)
	{
		if(n == 0) return 1;
		return n*fact(n-1);
	}
	public static double sine(int x)
	{
		int n=10;
		double ans=0;
		for(int i=0;i<=n;i++)
		{
			int c = 2*i+1;
			ans = ans + (pow(-1,i) * (pow(x,c) / (fact(c)))); 
		}
		return ans;
	}
	
	
	//Assignment 10
	public static int[] sumOfEvensAndOdds(int []nums) { 
		int n = nums.length;
		int a[] = {0,0};
		for(int i=0;i<n;i++)
		{
			if(i%2 == 0)
				a[1] += nums[i];
			else
				a[0] += nums[i];
		}
		return a;
	}
	public static void main(String args[]) {
		
		// Assignment 6
		System.out.println("Fibonacci Numbers : ");
		for(int i=1;i<15;i++)
			System.out.print(fibonacci(i) + " ");
		
		// Assignment 7
		System.out.println("\n Printing Pattern : \n");
		printPattern(5);
		printPattern(10);
		
		
		//Assignment 8
		for(int i=0;i<=10;i++)
		{
			System.out.println("sin(" + i + ") = " + sine(i) + " | " + Math.sin((double)i));
		}
		
		//Assignment 10
		int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int [] result = sumOfEvensAndOdds(nums);
		System.out.println(Arrays.toString(result));
	}
}
