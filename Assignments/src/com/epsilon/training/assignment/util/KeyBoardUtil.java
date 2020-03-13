package com.epsilon.training.assignment.util;

import java.util.Scanner;

@SuppressWarnings("resource")
public final class KeyBoardUtil {
	public static String getString() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
