package com.epsilon.training.util;

import java.util.Scanner;

public class KeyBoardUtil {
    private KeyBoardUtil() {}

    public static int getInt(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String getString(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }


    public static double getDouble(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
