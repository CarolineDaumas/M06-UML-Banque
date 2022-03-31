package fr.fms.entities;

public class Account {
	private int accountNumber;
	private double balanceBank;
	
	public Account(int accountNumber, double balanceBank) {
		super();
		this.accountNumber = accountNumber;
		this.balanceBank = balanceBank;
	}

	public Account() {
		super();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalanceBank() {
		return balanceBank;
	}

	public void setBalanceBank(double balanceBank) {
		this.balanceBank = balanceBank;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balanceBank=" + balanceBank + "]";
	}	
	
	
	

	
}
