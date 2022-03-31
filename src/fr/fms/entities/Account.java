package fr.fms.entities;

public class Account {
	private int accountNumber;
	public Account(int accountNumber, double balanceBank) {
		super();
		this.accountNumber = accountNumber;
		this.balanceBank = balanceBank;
	}



	private double balanceBank;


	

	public Account() {
		
	}

	public int getId() {
		return accountNumber;
	}

	public void setId(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalanceBank() {
		return balanceBank;
	}

	public void setBalanceBank(double balanceBank2) {
		this.balanceBank = balanceBank2;
	}

	

	@Override
	public String toString() {
		return "Account [id=" + accountNumber + ", balanceBank=" + balanceBank +  "]";
	}

}
