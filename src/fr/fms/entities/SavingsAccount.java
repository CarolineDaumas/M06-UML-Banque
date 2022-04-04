package fr.fms.entities;

public class SavingsAccount extends Account {

	private double interests;

	public SavingsAccount(int accountNumber, double balanceBank, Customer customer, double interests) {
		super(accountNumber, balanceBank, customer);
		this.interests = interests;
	}

	@Override
	public String toString() {
		return "SavingsAccount [interests=" + interests + "]" + super.toString();
	}

	public double getInterests() {
		return interests;
	}

	public void setInterests(double interests) {
		this.interests = interests;
	}

}
