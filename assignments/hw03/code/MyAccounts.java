// package bankAccount;
//
//Copyright (c) 2015
//Pejman Ghorbanzade <mail@ghorbanzade.com>
//CS110: Introduction to Computing
//Department of Computer Science
//University of Massachusetts Boston
//
import javax.swing.JOptionPane;
public class MyAccounts {
	private static BankAccount[] accounts = new BankAccount[2];
	private static String[] accountTypes = {"Checking", "Saving"};
	private static int mainMenu() {
		Object[] options = { "Deposit", "Withdrawal", "Balance Inquiry", "I'm done!" };
		return JOptionPane.showOptionDialog(null, "What would you like to do?", "Main Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
	}
	private static String ask(String message, String title) {
		return JOptionPane.showInputDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
	}
	private static void show(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE, null);
	}
	private static int chooseAccount() {
		Object[] options = new Object[BankAccount.getNumAccounts()];
		for (int i = 0; i < BankAccount.getNumAccounts(); i++) {
			options[i] = accounts[i].getName();
		}
		return JOptionPane.showOptionDialog(null, "Select Your Account", "Account Overview", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
	}
	private static void makeDeposit() {
		int num = chooseAccount();
		String answer = ask("How much money would you like to deposit into "+accounts[num].getName()+"?", "Deposit");
		long amount = Long.parseLong(answer);
		accounts[num].deposit(amount);
		show("Thank you!", "Deposit");
	}
	private static void makeWithdrawal() {
		int num = chooseAccount();
		String answer = ask("How much money would you like to withdraw from "+accounts[num].getName()+"?", "Withdrawal");
		long amount = Long.parseLong(answer);
		if (accounts[num].withdrawal(amount)) {
			show("Withdrawal Successfull.", "Withdrawal");
		}
		else {
			show("Insufficient balance.", "Withdrawal");
		}
	}
	private static void makeBalanceInquiry() {
		int num = chooseAccount();
		String message = "Balance of your "+accounts[num].getName()+" account is "+accounts[num].getBalance();
		show(message, "Balance Inquiry (Account No. "+accounts[num].getNumber()+")");
	}
	public static void main(String[] args) {
		show("Welcome to our Personal Expense Tracking System.", "Welcome!");
		for (int i = 0; i < accounts.length; i++) {
			String name = JOptionPane.showInputDialog(null, "Name of your "+accountTypes[i]+" account?", "Openning Account (Step 1/2)", JOptionPane.PLAIN_MESSAGE);
			String number = JOptionPane.showInputDialog(null, "Number of your "+accountTypes[i]+" account?", "Openning Account (Step 2/2)", JOptionPane.PLAIN_MESSAGE);
			accounts[i] = new BankAccount(name, number);
		}
		boolean loop = true;
		while (loop) {
			switch (mainMenu()) {
			case 0: makeDeposit(); break;
			case 1:	makeWithdrawal(); break;
			case 2:	makeBalanceInquiry(); break;
			default:
				show("Thank you for using our Personal Expense Tracking (PET) System!", "Bye!");
				loop = false;
				break;
			}
		}
	}
}
