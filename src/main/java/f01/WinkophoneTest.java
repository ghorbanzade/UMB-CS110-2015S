/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.f01.q06;

public class WinkophoneTest {
	public static void main(String[] args) {
		Winkophone myPhone = new Winkophone();
		System.out.println(myPhone.getBattery());
		myPhone.call(100);
		System.out.println(myPhone.getBattery());
	}
}
