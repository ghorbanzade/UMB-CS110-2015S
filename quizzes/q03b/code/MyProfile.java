// package profile;

//
//Copyright (c) 2015
//Pejman Ghorbanzade <mail@ghorbanzade.com>
//CS110: Introduction to Computing
//Department of Computer Science
//University of Massachusetts Boston
//

import java.util.Scanner;
public class MyProfile {
	private static UserProfile[] profiles = new UserProfile[100];
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			int option = getMenuOption();
			if (option == 1)
				createProfile();
			else if (option == 2)
				showProfile();
			else
				break;
		}
		System.out.println("Goodbye!");
		// end of main method
	}
	public static int getMenuOption() {
		while (true) {
			System.out.println();
			System.out.println("You are in the main menu.");
			System.out.println("  1. Create new profile");
			System.out.println("  2. Show my profile");
			System.out.println("  3. Exit");
			System.out.print("Select your option [1-3] ");
			int option = input.nextInt();
			if (0 < option && option < 4)
				return option;
			System.out.println("Wrong Input.");
		}
	}
	public static void showProfile() {
		if (UserProfile.getNumProfiles() != 0) {
			System.out.print("Enter your username: ");
			String user = input.next();
			System.out.print("Enter your password: ");
			String pass = input.next();
			for (int i = 0; i < UserProfile.getNumProfiles(); i++) {
				if (profiles[i].getUsername().equals(user)) {
					if (profiles[i].getPassword().equals(pass)) {
						showInfo(profiles[i]);
					}
					else
						System.out.println("Password mismatch.");
				}
				else
					System.out.println("No such profile found.");
			}
		}
		else
			System.out.println("No profiles yet.");
	}
	public static void showInfo(UserProfile myProfile) {
		System.out.println("Hello " + myProfile.getName() + "!");
		System.out.print("Height: ");
		System.out.println(myProfile.getHeight());
		System.out.print("Weight: ");
		System.out.println(myProfile.getWeight());
		System.out.print("Blood Type: ");
		System.out.println(myProfile.getBloodType());
	}
	public static void createProfile() {
		if (UserProfile.getNumProfiles() != 100) {
			// get user and password
			System.out.print("Enter your username: ");
			String user = input.next();
			//input.nextLine();
			System.out.print("Enter your password: ");
			String pass = input.next();
			//input.nextLine();
			// create user profile
			int num = UserProfile.getNumProfiles();
			profiles[num] = new UserProfile(user, pass);
			System.out.println("You're accout is created.");
			// initialize name
			System.out.print("Enter your name: ");
			//input.nextLine();
			String name = input.next();
			input.nextLine();
			profiles[num].setName(name);
			// initialize height
			System.out.print("Enter your height: ");
			double height = input.nextDouble();
			profiles[num].setHeight(height);
			// initialize weight
			System.out.print("Enter your weight: ");
			double weight = input.nextDouble();
			profiles[num].setWeight(weight);
			// initialize blood type
			System.out.print("Enter your blood type: ");
			String bloodtype = input.next();
			profiles[num].setBloodType(bloodtype);
		}
	}
}
