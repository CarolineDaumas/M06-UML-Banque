package fr.fms.entities;

public class CurrentAccount extends Account {
	private int accountNumber;
	private double overdraft;
	private static int accountNumberTemp = 10000000;

	public static int getAccountNumberTemp() {
		return accountNumberTemp;
	}

	public static void setAccountNumberTemp(int accountNumberTemp) {
		CurrentAccount.accountNumberTemp++;
	}

	public CurrentAccount(double balanceBank, Admin admin, int accountNumber, double overdraft, AccountNature accountNature) {
		super(accountNumber, balanceBank, accountNature);
		this.setOverdraft(overdraft);
	}

	@Override
	public String toString() {
		return "CurrentAccount [accountNumber=" + accountNumber + ", overdraft=" + overdraft + "]";
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

}
