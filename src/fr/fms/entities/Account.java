package fr.fms.entities;

import java.util.ArrayList;

/**
 * 
 * @author Stagiaires11P, Stagiaires?P, Stagiaires?P, Stagiaires?P,
 *
 */
public abstract class Account {

	private int accountNumber;
	private double balanceBank;
	private Customer customer;
	private ArrayList<Operation> operations;

	public Account(int accountNumber, double balanceBank, Customer customer) {
		this.accountNumber = accountNumber;
		this.balanceBank = balanceBank;
		this.customer = customer;
	}

	public Account(int accountNumber, double balanceBank) {
		this.accountNumber = accountNumber;
		this.balanceBank = balanceBank;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balanceBank=" + balanceBank + ", customer=" + customer
				+ ", operations=" + operations + "]";
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList<Operation> getOperations() {
		return operations;
	}

	public void setOperations(ArrayList<Operation> operations) {
		this.operations = operations;
	}
}
