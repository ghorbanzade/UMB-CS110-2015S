//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
