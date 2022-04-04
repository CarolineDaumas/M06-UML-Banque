package fr.fms.entities;

import java.util.ArrayList;

public class SavingsAccount extends Account {

	private double interests;
	// private static int accountNumberTemp = 10000000;

	public SavingsAccount(int accountNumber, double balanceBank, double interests, AccountNature accountNature,
			Admin admin, Customer customer, ArrayList<Banking> bankings) {
		super(accountNumber, balanceBank, accountNature, admin, customer, bankings);
		this.setInterests(interests);
	}

	public double getInterests() {
		return interests;
	}

	public void setInterests(double interestRate) {
		this.interests = interestRate;
	}

	@Override
	public String toString() {
		return super.toString() + ", interests=" + interests + "]\n";
	}

//	public static int getAccountNumberTemp() {
//		return accountNumberTemp;
//	}
//
//	public static void setAccountNumberTemp(int accountNumberTemp) {
//		SavingsAccount.accountNumberTemp++;
//	}

}
	