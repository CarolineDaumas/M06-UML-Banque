package fr.fms.entities;

public class CurrentAccount extends Account {
	private int accountNumber;
	private double overdraft;
	private static int accountNumberTemp=10000000;

	public static int getAccountNumberTemp() {
		return accountNumberTemp;
	}


	public static void setAccountNumberTemp(int accountNumberTemp) {
		CurrentAccount.accountNumberTemp ++;
	}


	public CurrentAccount( int balanceBank, Admin admin, int accountNumber, double overdraft) {
		super(accountNumber, balanceBank);
		//this.setCurrentAccountId(currentAccountId);
		
		this.setOverdraft(overdraft);
	}

	
	public CurrentAccount() {
		super();
	}



	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft2) {
		this.overdraft = overdraft2;
	}

	@Override
	public String toString() {
		return super.toString() + "CurrentAccount [currentAccountId=" + accountNumber + ", overdraft=" + overdraft + "]";
	}
}
