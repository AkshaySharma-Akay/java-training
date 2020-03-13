package com.epsilon.training.day1.assignment2;


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
	
	public static void main(String args[]) {
		//calling the assignments functions
		System.out.println(isValidDate(2018,13,1));
		System.out.println(isValidDate(2018,2,29));
		System.out.println(isValidDate(2016,2,29));
		System.out.println(isValidDate(2016,2,54));
		System.out.println(isValidDate(2016,1,31));
	}
	
}
