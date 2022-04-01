package fr.fms.entities;

public class CurrentAccount extends Account {
	private double overdraft;
	private static int accountNumberTemp = 10000000;

	public static int getAccountNumberTemp() {
		return accountNumberTemp;
	}

	public static void setAccountNumberTemp(int accountNumberTemp) {
		CurrentAccount.accountNumberTemp++;
	}

	public CurrentAccount(double balanceBank, Admin admin, int accountNumber, double overdraft,
			AccountNature accountNature) {
		super(accountNumber, balanceBank, accountNature);
		this.setOverdraft(overdraft);
	}


	@Override
	public String toString() {
		return super.toString() + "CurrentAccount [overdraft=" + overdraft + "]";
	}

	public CurrentAccount() {
		super();
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft2) {
		this.overdraft = overdraft2;
	}

}
