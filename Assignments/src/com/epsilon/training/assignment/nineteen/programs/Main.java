package com.epsilon.training.assignment.nineteen.programs;

import java.util.ArrayList;

import com.epsilon.training.assignment.util.GetDayUtil;
import com.epsilon.training.assignment.util.KeyBoardUtil;

public class Main {
	public static void main(String args[]) {
		System.out.println("Enter year and month : YYYY-MM");
		System.out.println("Year = ");
		Integer y = Integer.parseInt(KeyBoardUtil.getString());
		Integer m = Integer.parseInt(KeyBoardUtil.getString());
		int day = GetDayUtil.getDay(y, m, 1);
		
	}

}
