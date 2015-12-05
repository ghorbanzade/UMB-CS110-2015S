/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw06.q01;

public abstract class Person {
	// attributes
	private double posX;
	private double posY;
	// abstract methods
	public abstract void walk();
	// methods
	public boolean walkTo(double posX, double posY) {
		if (posX < Room.getRoomLength() && posX >= 0 && posY < Room.getRoomWidth() && posY >= 0) {
			this.posX = posX;
			this.posY = posY;
			return true;
		}
		return false;
	}
	// constructor
	public Person(double posX, double posY) {
		this.posX = posX;
		this.posY = posY;
	}
	// getter and setter
	public double getPosX() {
		return posX;
	}
	public double getPosY() {
		return posY;
	}
}
