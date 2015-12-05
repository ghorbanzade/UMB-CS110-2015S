/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
