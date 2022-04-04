package fr.fms.entities;

import java.util.Date;

public class Transfer extends Operation {

	public Transfer(int id, Date date, double amount, Customer customer) {
		super(id, date, amount, customer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Transfert : " + super.toString();
	}

}
