//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
