package com.epsilon.training.main;

public class Main {
	//Assignment 2
	static boolean isLeap(int year) {
		// Every year that is exactly divisible by four is a leap year,
		// except for years that are exactly divisible by 100, but these centurial 
		// years are leap years if they are exactly divisible by 400.

		if((year % 400 == 0) ||(year%4 == 0 && year%100!=0))
			return true;
		return false;
	}
	static boolean isValidDate(int year, int month, int day) { 
		int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		// month check 
		if(month< 1 || month > 12)
			return false;
		
		// days check 
		if(isLeap(year) && month == 2) // for leap year
		{
			if(year % 400 == 0)
			{
				if(day != 29)
					return false;
			}
			else
			{
				if(day != 28)
					return false;
			}
		}
		else // non leap year or leap year without 2nd month
		{
			if(day != days[month-1])
				return false;
		}
		return true; 
	}
	
	//Assignment 3
	static boolean isPrimeNumber(int num) { 
		if(num == 1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%2 == 0)
				return false;
		}
		return true;
	}
	
	//Assignment 4:
	public static void sortThreeNumbers(int a, int b, int c) { 
		int tmp;
		if(a < b)
		{
			tmp = a;
			a = b;
			b = tmp;
		}
		if(c > a) //print in descending
		{
			System.out.println(b + ", "+ a + " ," + c);
		}
		else
		{
			if(c > b)
			{
				tmp = b;
				b = c;
				c = tmp;
			}
			System.out.println(c + ", " + b + ", "+ a);
		}
	}
	
	//Assignment 5 :
	public static int sumOfPrimes(int from, int to) { 
		if(from > to)
		{
			int tmp = to;
			to = from;
			from = tmp;
		}
		int sum = 0;
		for(int i=from;i<=to;i++)
		{
			if(isPrimeNumber(i))
				sum += i;
		}
		return sum; 
	}

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
		//calling the assignments functions
		System.out.println(isValidDate(2018,13,1));
		System.out.println(isValidDate(2018,2,29));
		System.out.println(isValidDate(2016,2,29));
		System.out.println(isValidDate(2016,2,54));
		System.out.println(isValidDate(2016,1,31));
		
		// Assignment 2
		
		// Assignment 3
		
		// Assignment 4 
		sortThreeNumbers(1,2,3);
		sortThreeNumbers(3,2,1);
		sortThreeNumbers(3,1,2);
		
		// Assignment 6
		System.out.println("Fibonacci Numbers : ");
		for(int i=1;i<15;i++)
			System.out.print(fibonacci(i) + " ");
		
		// Assignment 7
		System.out.println("\n Printing Pattern : \n");
		printPattern(5);
		printPattern(10);
		
		//test
		double d = 5;
		System.out.print("pow(5) = " + pow(d,5) + " fact = " + fact(5));
		//Assignment 8
		for(int i=0;i<=10;i=i++)
		{
			System.out.println("sin(" + i + ") = " + sine(i) + " | " + Math.sin((double)i));
		}
		
		//Assignment 10
		int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int [] result = sumOfEvensAndOdds(nums);
		System.out.println(result);
	}
}
