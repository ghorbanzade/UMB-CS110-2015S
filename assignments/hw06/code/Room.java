//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

import java.util.ArrayList;
public class Room {
	// fields
	private static int time = 0;
	private static int numRows = 5;
	private static int numCols = 10;
	private static double roomLength = 50;
	private static double roomWidth = 30;
	public static ArrayList<Human> humans = new ArrayList<Human>(numRows*numCols);
	public static ArrayList<Zombie> zombies = new ArrayList<Zombie>(numRows*numCols);
	// methods
	public static void initialize() {
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				double posX = (roomLength/numCols)*j + (roomLength/numCols/2);
				double posY = (roomWidth/numRows)*i + (roomWidth/numRows/2);
				humans.add(new Human(posX, posY));
			}
		}
	}
	public static void nextTime() {
		for (int i = 0; i < zombies.size(); i++)
			zombies.get(i).bite();
		for (int i = 0; i < zombies.size(); i++)
			zombies.get(i).walk();
		for (int i = 0; i < humans.size(); i++)
			humans.get(i).walk();
		time++;
	}
	// getters and setters
	public static double getRoomLength() {
		return roomLength;
	}
	public static double getRoomWidth() {
		return roomWidth;
	}
	public static int getTime() {
		return time/5;
	}
	// constructor
	private Room() {}
}
