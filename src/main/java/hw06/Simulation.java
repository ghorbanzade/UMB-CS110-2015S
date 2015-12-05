/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
