package fr.fms.entities;

import java.util.Date;

public abstract class Operation {

	private int id = 0;
	private Date date;
	private double amount;
	private Customer customer;
	public Operation(int id, Date date, double amount, Customer customer) {
		this.id = id++;
		this.date = date;
		this.amount = amount;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Banking [id=" + id + ", date=" + date + ", amount=" + amount + ", customer=" + customer + "]";
	}
}
