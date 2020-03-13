package com.epsilon.training.assignment.util;

public final class GetDayUtil {
	public static int getDay(int y,int m,int d) {
		// Implementation of
		// tomohiko Sakamoto Algorithm to get the

		int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };

		// if month is less than 3 reduce year by 1
		if (m < 3)
			y -= 1;
		return ((y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7);
	}
}
