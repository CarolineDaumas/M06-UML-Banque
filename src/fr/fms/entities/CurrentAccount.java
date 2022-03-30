package fr.fms.entities;

public class CurrentAccount extends Account {
	private int currentAccountId;
	private int overdraft;

	public CurrentAccount(int id, int balanceBank, Admin admin, int currentAccountId, int overdraft) {
		super(id, balanceBank, admin);
		this.setCurrentAccountId(currentAccountId);
		;
		this.setOverdraft(overdraft);
	}

	public int getCurrentAccountId() {
		return currentAccountId;
	}

	public void setCurrentAccountId(int currentAccountId) {
		this.currentAccountId = currentAccountId;
	}

	public int getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public String toString() {
		return super.toString() + "CurrentAccount [currentAccountId=" + currentAccountId + ", overdraft=" + overdraft + "]";
	}
}
