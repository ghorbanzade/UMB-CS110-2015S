//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
