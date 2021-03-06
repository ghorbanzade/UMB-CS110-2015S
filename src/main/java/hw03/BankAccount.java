/**
 * UMB-CS110-2015S: Introduction to Computing
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS110-2015S
 */

package edu.umb.cs110.hw03.q03;

public class BankAccount {
	private static int numAccounts;
	private String name;
	private String number;
	private long balance;
	public void deposit(long amount) {
		this.balance += amount;
	}
	public boolean withdrawal(long amount) {
		if (this.balance - amount > 0) {
			this.balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	public long inquiry() {
		return getBalance();
	}
	public BankAccount(String accountName, String accountNumber) {
		balance = 0;
		name = accountName;
		number = accountNumber;
		numAccounts++;
	}
	public BankAccount() {
	}
	public static int getNumAccounts() {
		return numAccounts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public long getBalance() {
		return balance;
	}
}
