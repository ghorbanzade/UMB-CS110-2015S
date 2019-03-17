/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.f01.q05;

public class FridgeTest {
	public static void main(String[] args) {
		Fridge myFridge = new Fridge(15);
		myFridge.plug();
		myFridge.setTemperature(50);
		myFridge.refrigerate(5);
	}
}
