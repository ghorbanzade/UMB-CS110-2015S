/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw06.q01;

public class Zombie extends Person {
	// attribute
	private double speed = 1;
	private double range = 1;
	// constructors
	public Zombie(double posX, double posY) {
		super(posX, posY);
	}
	// methods
	@Override
	public void walk() {
		if (Room.humans.size() > 0) {
			double closestDistX = 0;
			double closestDistY = 0;
			double minDistance = 2*Room.getRoomLength();
			for (int i = 0; i < Room.humans.size(); i++) {
				double distX = this.getPosX() - Room.humans.get(i).getPosX();
				double distY = this.getPosY() - Room.humans.get(i).getPosY();
				double distance = Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
				if (distance < minDistance) {
					minDistance = distance;
					closestDistX = distX;
					closestDistY = distY;
				}
			}
			double direction = Math.atan2(closestDistY, closestDistX);
			double newPosX = this.getPosX() + Math.cos(direction) * speed;
			double newPosY = this.getPosY() + Math.sin(direction) * speed;
			walkTo(newPosX, newPosY);
		}
	}
	public void bite() {
		for (int i = 0; i < Room.humans.size(); i++) {
			double distX = this.getPosX() - Room.humans.get(i).getPosX();
			double distY = this.getPosY() - Room.humans.get(i).getPosY();
			double distance = Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
			if (distance < range) {
				Room.humans.get(i).turn();
			}
		}
	}
}
