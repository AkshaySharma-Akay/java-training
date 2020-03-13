package com.epsilon.training.day1.assignment9;

import com.epsilon.training.assignment.util.GetDayUtil;
import com.epsilon.training.assignment.util.KeyBoardUtil;

public class Main {

	static boolean isLeap(int year) {
		// Every year that is exactly divisible by four is a leap year,
		// except for years that are exactly divisible by 100, but these centurial
		// years are leap years if they are exactly divisible by 400.

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
			return true;
		return false;
	}

	public static void printCalendar(int month, int year) {
		String days[]= {"Su","Mo","Tu","We","Th","Fr","Sa"};
		int months[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(month<1 || month>12)
		{
			System.out.println("Invalid Month");
			return;
		}
		int day = 0,d=1;
		while(day == 0)
		{
			day = GetDayUtil.getDay(year, month, d);
			d++;
		}
		for(int i=0;i<7;i++)
		{
			System.out.print(days[i] + "  ");
		}
		if(isLeap(month) && month == 2) {
			d = 29;
		}else {
			d = months[month-1];
		}
		boolean flag = false;
		day = day-1;
		int c = 1;
		while(c<=d) {
			System.out.println();
			for(int i=0;i<7;i++) {
				if(!flag && day == i) {
					flag=true;
					i--;
					continue;
				}
				else if(!flag)
					System.out.print("  ");
				else {
					if(c <= 9)
						System.out.print(" ");
					if(c <= d)
					System.out.print(c);
					c++;	
				}
				System.out.print("  ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Date: ");
		System.out.print("Year = ");
		Integer year = Integer.parseInt(KeyBoardUtil.getString());
		System.out.print("Month = ");
		Integer month = Integer.parseInt(KeyBoardUtil.getString());
		printCalendar(month, year);
	}

}
