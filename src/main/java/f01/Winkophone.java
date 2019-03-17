/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.f01.q06;

public class Winkophone extends Phone {
	public Winkophone() {
		super(1000);
	}
	@Override
	public void call(int minutes) {
		int max = Math.max(this.getBattery()-minutes, 0);
		this.setBattery(max);
	}
}
