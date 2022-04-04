package fr.fms.entities;

import java.util.ArrayList;

public class CurrentAccount extends Account {

	private double overdraft;
	// private static int accountNumberTemp = 10000000;

	public CurrentAccount(int accountNumber, double balanceBank, double overdraft, AccountNature accountNature,
			Admin admin, Customer customer, ArrayList<Banking> bankings) {
		super(accountNumber, balanceBank, accountNature, admin, customer, bankings);
		this.setOverdraft(overdraft);
	}

	@Override
	public String toString() {
		return super.toString() + " ,overdraft=" + overdraft + "]\n";
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft2) {
		this.overdraft = overdraft2;
	}

//	public static int getAccountNumberTemp() {
//		return accountNumberTemp;
//	}
//
//	public static void setAccountNumberTemp(int accountNumberTemp) {
//		CurrentAccount.accountNumberTemp++;
//	}

}
