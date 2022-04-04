package fr.fms.entities;


public class CurrentAccount extends Account {

	private double overdraft;

	public CurrentAccount(int accountNumber, double balanceBank, Customer customer, double overdraft) {
		super(accountNumber, balanceBank, customer);
		this.overdraft = overdraft;
	}
	
	public CurrentAccount(int accountNumber, double balanceBank, double overdraft) {
		super(accountNumber, balanceBank);
		this.overdraft = overdraft;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overdraft=" + overdraft + "]" + super.toString();
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	

}
