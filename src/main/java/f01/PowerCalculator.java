/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.f01.q04;

public class PowerCalculator {
	public static void main(String[] args) {
		System.out.println(findPow(2,8));
	}
	public static long findPow(int num, int pow) {
		if (pow == 0)
			return 1;
		return num*findPow(num, pow-1);
	}
}
