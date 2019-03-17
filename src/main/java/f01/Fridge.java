/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.f01.q05;

public class Fridge {
	private boolean plugged;
	private int temperature;
	private int maxCapacity;
	private int capacity;
	// Constructor
	public Fridge(int maxCapacity) {
		plugged = false;
		temperature = 68;
		this.maxCapacity = maxCapacity;
		capacity = maxCapacity;
	}
	// methods
	public void refrigerate(int food) {
		if (capacity - food >= 0)
			capacity -= food;
	}
	public void plug() {
		plugged = true;
	}
	public void unplug() {
		temperature = 68;
		plugged = false;
	}
	// setters and getters
	public boolean isPlugged() {
		return plugged;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
}
