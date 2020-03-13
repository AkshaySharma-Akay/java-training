package com.epsilon.training.assignment.twentyeight.programs;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.epsilon.training.assignment.twentyeight.entity.Person;
import com.epsilon.training.assignment.util.KeyBoardUtil;

public class Main {
	public static void writeCsv(String filepath) {
		// File Writer
		try (PrintWriter out = new PrintWriter(new FileWriter(filepath, true))) {
			// get input
			while (true) {

				Person p = new Person();

				// Getting Input
				System.out.print("\n Enter User Id: ");
				p.setId(KeyBoardUtil.getNumber());

				System.out.print("\n Enter User Name: ");
				p.setName(KeyBoardUtil.getString());

				System.out.print("\n Enter User Email Id: ");
				p.setEmail(KeyBoardUtil.getString());

				System.out.print("\n Enter User City: ");
				p.setCity(KeyBoardUtil.getString());

				System.out.print("\n Enter User Address: ");
				p.setAddress(KeyBoardUtil.getString());

				System.out.print("\n Enter User Phone: ");
				p.setPhone(KeyBoardUtil.getString());

				// Writing To File Now
				out.write(p.getId());
				out.append(',');
				out.write(p.getName());
				out.append(',');
				out.write(p.getEmail());
				out.append(',');
				out.write(p.getCity());
				out.append(',');
				out.write(p.getAddress());
				out.append(',');
				out.write(p.getPhone());
				out.append(',');

				// Next Iteration : Decision
				System.out.print("Do you want to quit : "
						+ "(Yes) or press any other key : ");
				String s = KeyBoardUtil.getString();
				// check whether user wants to continue or exit
				if (s.equalsIgnoreCase("yes")) {
					break;
				}

			}
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		//Open the file
		String filepath = "C:\\Users\\AKSHAY\\OneDrive -"
				+ " Epsilon\\Desktop\\Java-Training\\Assignments\\user.csv";
		writeCsv(filepath);
		System.out.println("End of main!");
	}
}