// package bankAccount;
//
//Copyright (c) 2015
//Pejman Ghorbanzade <mail@ghorbanzade.com>
//CS110: Introduction to Computing
//Department of Computer Science
//University of Massachusetts Boston
//
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
