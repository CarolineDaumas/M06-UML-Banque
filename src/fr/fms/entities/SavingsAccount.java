package fr.fms.entities;

public class SavingsAccount extends Account {
	
	int interests;
	int currentSavingId;
	
	public SavingsAccount(int id, int balanceBank, Admin admin, int interests,int currentSavingId) {
		super(id, balanceBank, admin);
		this.setInterests(interests);
		this.setCurrentSavingId(currentSavingId);
	}

	public int getInterests() {
		return interests;
	}

	public void setInterests(int interests) {
		this.interests = interests;
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

}
