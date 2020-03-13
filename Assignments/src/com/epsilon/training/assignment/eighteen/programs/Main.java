package com.epsilon.training.assignment.eighteen.programs;

import java.util.ArrayList;

import com.epsilon.training.assignment.util.KeyBoardUtil;

public class Main {

	public static void main(String[] args) {
		long sum = 0;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<String> strings = new ArrayList<String>();

		while (true) {
			
			// getting input
			System.out.println("Press NO to exit");
			System.out.println("Press any other key as input");
			System.out.print("Input : ");
			String s = KeyBoardUtil.getString();
			
			// check whether user wants to continue or exit
			if (s.equalsIgnoreCase("NO")){
				break;
			} else {
				// check if Integer or String
				try {
					Integer tmp = Integer.parseInt(s);
					numbers.add(tmp);
					sum += tmp;
				} catch (NumberFormatException ne) {
					strings.add(s);
				} catch (Exception e) {
					System.out.println("\n Invalid Input Provided");
				}
			}
		}

		// Printing the output
		int x;
		int y = numbers.size();
		int z = strings.size();
		x = y + z;
		if (x == 0)
			return;
		else {
			System.out.println("Number of inputs = " + x);
			System.out.println("Number of integer inputs = " + y);
			System.out.println("Number of non-integer inputs = " + z);
			System.out.println("Sum of all integer inputs = " + sum);
			System.out.print("The integer inputs = ");
			int c=0;
			for (Integer i : numbers) {
				c++;
				System.out.print(i);
				if(c!=y) {
					System.out.print(", ");
				}
			}
			System.out.println();
			c = 0;
			System.out.print("The non-integer inputs = ");
			for (String s : strings) {
				c++;
				System.out.print(s);
				if(c!=z) {
					System.out.print(", ");
				}
			}
		}
	}

}
