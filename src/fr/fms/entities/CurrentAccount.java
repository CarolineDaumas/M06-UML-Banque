package fr.fms.entities;

public class CurrentAccount extends Account {
	private int currentAccountId;
	private double overdraft;
	private static int accountNumber=10000000;

	public static int getAccountNumber() {
		return accountNumber;
	}


	public static void setAccountNumber(int accountNumber) {
		CurrentAccount.accountNumber ++;
	}


	public CurrentAccount( int balanceBank, Admin admin, int currentAccountId, double overdraft) {
		super(currentAccountId, balanceBank);
		this.setCurrentAccountId(currentAccountId);
		;
		this.setOverdraft(overdraft);
	}

	
	public CurrentAccount() {
		super();
	}


	public int getCurrentAccountId() {
		return currentAccountId;
	}

	public void setCurrentAccountId(int currentAccountId) {
		this.currentAccountId = currentAccountId;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft2) {
		this.overdraft = overdraft2;
	}

	@Override
	public String toString() {
		return super.toString() + "CurrentAccount [currentAccountId=" + currentAccountId + ", overdraft=" + overdraft + "]";
	}
}
