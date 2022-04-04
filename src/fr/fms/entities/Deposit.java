package fr.fms.entities;

import java.util.Date;

public class Deposit extends Operation {

	public Deposit(int id, Date date, double amount, Customer customer) {
		super(id, date, amount, customer);
	}

	@Override
	public String toString() {
		return "Versement : " + super.toString();
	}
}
