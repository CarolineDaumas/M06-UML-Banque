package fr.fms.entities;

import java.util.Date;

public class Banking {
	
	private int id;
	private Date date;
	private BankingNature bankingNature;
	private double amount;
	private User user;
	
	/**
	 * 
	 * @param id
	 * @param date
	 * @param bankingNature
	 * @param amount
	 * @param user
	 */
	public Banking(int id, Date date, BankingNature bankingNature, double amount, User user) {
		this.id = id;
		this.date = date;
		this.bankingNature = bankingNature;
		this.amount = amount;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BankingNature getBankingNature() {
		return bankingNature;
	}

	public void setBankingNature(BankingNature bankingNature) {
		this.bankingNature = bankingNature;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Banking Number: " + id + ", date: " + date + ", bankingNature:" + bankingNature + ", amount: " + amount
				+ ", user: [" + user.getFirstname() + "/ "+ user.getRole()+ "]\n";
	}
	
	
}
