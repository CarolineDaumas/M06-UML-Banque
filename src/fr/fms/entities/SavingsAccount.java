package fr.fms.entities;

public class SavingsAccount extends Account {
	
	private	double interests;
	private	int currentSavingId;
	private static int accountNumber=10000000;
	
	public SavingsAccount(double balanceBank, Admin admin, double interests,int currentSavingId) {
		super(currentSavingId, balanceBank);
		this.setInterests(interests);
		this.setCurrentSavingId(currentSavingId);
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

	public int getCurrentSavingId() {
		return currentSavingId;
	}

	public void setCurrentSavingId(int currentSavingId) {
		this.currentSavingId = currentSavingId;
	}

	@Override
	public String toString() {
		return super.toString() + "SavingsAccount [interests=" + interests + ", currentSavingId=" + currentSavingId
				+ "]";
	}



	public static void setAccountNumber(int accountNumber) {
	 SavingsAccount.accountNumber++;
		
	}



	public static int getAccountNumber() {
		return accountNumber;
	}

}
