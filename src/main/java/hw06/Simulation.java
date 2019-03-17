/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw06.q01;

public class Simulation {
	public static void main(String[] args) {
		Room.initialize();
		Room.humans.get(13).turn();
		while (Room.humans.size() > 0) {
			System.out.printf("Time: %6d numZ: %2d numH: %2d\n", Room.getTime(), Room.zombies.size(), Room.humans.size());
			Room.nextTime();
		}
	}
}
