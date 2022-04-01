package fr.fms.entities;

public class SavingsAccount extends Account {

	private int accountNumber;
	private double interests;
	private static int accountNumberTemp = 10000000;

	public SavingsAccount(double balanceBank, Admin admin, int accountNumber, double interests, AccountNature accountNature) {
		super(accountNumber, balanceBank, accountNature);
		this.setInterests(interests);
	}

	public SavingsAccount() {
		super();
	}

	public double getInterests() {
		return interests;
	}

	public void setInterests(double interestRate) {
		this.interests = interestRate;
	}

	public static int getAccountNumberTemp() {
		return accountNumberTemp;
	}

	public static void setAccountNumberTemp(int accountNumberTemp) {
		SavingsAccount.accountNumberTemp++;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", interests=" + interests + "]";
	}

}
