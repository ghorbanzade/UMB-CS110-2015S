/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.f01.q06;

public abstract class Phone {
	private int battery;
	private int maxBattery;
	public Phone(int maxBattery) {
		this.maxBattery = maxBattery;
	this.battery = maxBattery;
	}
	public abstract void call(int minutes);
	public void charge() {
		battery = maxBattery;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
}
