package fr.fms.entities;

import java.util.ArrayList;

public class Admin extends User{
	
	private ArrayList<Customer> custs =new ArrayList<>();

	

	public Admin(int id, String firstname, String lastname, String email, String password, boolean role,
			ArrayList<Customer> custs) {
		super(id, firstname, lastname, email, password, role);
		this.custs = custs;
	}


	public ArrayList<Customer> getCusts() {
		return custs;
	}

	public void setCusts(ArrayList<Customer> custs) {
		this.custs = custs;
	}

	@Override
	public String toString() {
		return super.toString()+ "Admin [custs=" + custs + "]";
	}
	
	public void createCustomer() {
		
		
	}
	
	public void createAccount() {
		
		
	}

}
