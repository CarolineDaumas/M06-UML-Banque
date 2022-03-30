package fr.fms.entities;

public class Account {
	private int id;
	private int balanceBank;
	private Admin admin;

	public Account(int id, int balanceBank, Admin admin) {
		this.setId(id);
		this.setBalanceBank(balanceBank);
		this.setAdmin(admin);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalanceBank() {
		return balanceBank;
	}

	public void setBalanceBank(int balanceBank) {
		this.balanceBank = balanceBank;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balanceBank=" + balanceBank + ", admin=" + admin + "]";
	}

}
