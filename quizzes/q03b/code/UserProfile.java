// package profile;

//
//Copyright (c) 2015
//Pejman Ghorbanzade <mail@ghorbanzade.com>
//CS110: Introduction to Computing
//Department of Computer Science
//University of Massachusetts Boston
//

public class UserProfile {
	private static int numProfiles = 0;
	// data members
	private String username;
	private String password;
	private String name;
	private double height;
	private double weight;
	private String bloodType;
	// constructor
	public UserProfile(String user, String pass) {
		this.username = user;
		this.password = pass;
		numProfiles ++;
	}
	// accessors and mutators
	public static int getNumProfiles() {
		return numProfiles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

}
