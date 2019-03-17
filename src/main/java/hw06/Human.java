/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw06.q01;

public class Human extends Person {
	// attributes
	private double speed = 1;
	// constructor
	public Human(double posX, double posY) {
		super(posX, posY);
	}
	// methods
	@Override
	public void walk() {
		double direction;
		while (true) {
			direction = Math.random()*2*Math.PI;
			double newPosX = this.getPosX() + Math.cos(direction) * speed;
			double newPosY = this.getPosY() + Math.sin(direction) * speed;
			if (walkTo(newPosX, newPosY))
				break;
		}
	}
	public void turn() {
		int index = Room.humans.indexOf(this);
		double posX = Room.humans.get(index).getPosX();
		double posY = Room.humans.get(index).getPosY();
		Room.zombies.add(new Zombie(posX, posY));
		Room.humans.remove(index);
		System.out.printf("H(%d) turned.\n", index);
	}
}
