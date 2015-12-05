/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
