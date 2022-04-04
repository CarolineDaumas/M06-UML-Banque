package fr.fms.entities;

import java.util.Date;

public class Withdraw extends Operation {

	public Withdraw(int id, Date date, double amount, Customer customer) {
		super(id, date, amount, customer);
	}

	@Override
	public String toString() {
		return  "Retrait : " + super.toString();
	}
	
}
