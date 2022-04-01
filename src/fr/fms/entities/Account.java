package fr.fms.entities;

public class Account {
	private int accountNumber;
	private double balanceBank;
	private AccountNature accountNature;
	
	public Account(int accountNumber, double balanceBank, AccountNature accountNature) {
		super();
		this.accountNumber = accountNumber;
		this.balanceBank = balanceBank;
		this.accountNature = accountNature;
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

	public AccountNature getAccountNature() {
		return accountNature;
	}

	public void setAccountNature(AccountNature accountNature) {
		this.accountNature = accountNature;
	}	
	
	
	

	
}
