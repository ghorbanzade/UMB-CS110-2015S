//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
