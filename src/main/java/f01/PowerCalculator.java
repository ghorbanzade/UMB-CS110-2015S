/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
