package fr.fms.entities;

/**
 * 
 * @author Stagiaires11P, Stagiaires?P, Stagiaires?P, Stagiaires?P, 
 *
 */
public class Account {

	private int accountNumber;
	private double balanceBank;
	private AccountNature accountNature;
	private Customer customer;
	private Admin admin;

	/**
	 * 
	 * @param accountNumber : like id (unique & primary key)
	 * @param balanceBank
	 * @param accountNature
	 */
	public Account(int accountNumber, double balanceBank, AccountNature accountNature, Admin admin, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.balanceBank = balanceBank;
		this.accountNature = accountNature;
		this.admin = admin;
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalanceBank() {
		return balanceBank;
	}

	public void setBalanceBank(double balanceBank) {
		this.balanceBank = balanceBank;
	}

	@Override
	public String toString() {
		return " [accountNumber=" + accountNumber + ", balanceBank=" + balanceBank ;
	}

	public AccountNature getAccountNature() {
		return accountNature;
	}

	public void setAccountNature(AccountNature accountNature) {
		this.accountNature = accountNature;
	}

}
