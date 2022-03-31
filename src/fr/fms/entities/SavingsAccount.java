package fr.fms.entities;

public class SavingsAccount extends Account {
	
	private	double interests;
	private	int accountNumber;
	private static int accountNumberTemp=10000000;
	
	public SavingsAccount(double balanceBank, Admin admin, double interests,int accountNumber) {
		super(accountNumber, balanceBank);
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
		SavingsAccount.accountNumberTemp ++;
	}



	@Override
	public String toString() {
		return super.toString() + "SavingsAccount [interests=" + interests + ", currentSavingId=" + accountNumber
				+ "]";
	}



	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}





}
