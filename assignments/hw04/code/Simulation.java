//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

import java.util.ArrayList;

public class Simulation {
	public static void main(String[] args) {
		initialize();
		while (shark.getHunger() < 3 * 24) {
			nextHour();
			eat();
			if (time % 24 == 0) {
				reproduce();
			}
			showStatistics();
		}
	}
	private static ArrayList<Salmon> salmons;
	private static Shark shark;
	private static int time = 0;
	// setup 100 salmons and 1 shark in Pond
	private static void initialize() {
		System.out.println("Initalizing Pond...");
		salmons = new ArrayList<Salmon>(101);
		for (int i = 0; i < 100; i++) {
			Salmon salmon = new Salmon();
			salmons.add(salmon);
		}
		shark = new Shark();
		System.out.println("Pond Initialized.");
	}
	// move all salmons and the shark
	private static void nextHour() {
		for (int i = 0; i < salmons.size(); i++) {
			salmons.get(i).move();
		}
		shark.move();
		time++;
	}
	// check if it's time to eat
	private static void eat() {
		double[] posShark = shark.getPosition();
		double[] posSalmon = new double[2];
		double dist;
		for (int i = salmons.size() - 1; i >= 0; i--) {
			posSalmon = salmons.get(i).getPosition();
			dist = Math.sqrt(Math.pow(posShark[0] - posSalmon[0], 2) + Math.pow(posShark[1] - posSalmon[1], 2));
			if (dist < shark.getRange()) {
				salmons.remove(i);
				shark.eat();
			}
		}
	}
	private static void reproduce() {
		int num = salmons.size();
		for (int i = 0; i < num; i++) {
			Salmon salmon = new Salmon(salmons.get(i).getPosition());
			salmons.add(salmon);
		}
	}
	private static void showStatistics() {
		System.out.printf("Time: %d\n", time);
		System.out.printf("Fish: %d\n", salmons.size());
		System.out.println();
	}
}
