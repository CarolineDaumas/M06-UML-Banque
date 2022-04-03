package fr.fms.entities;

import java.util.ArrayList;

/**
 * 
 * @author Stagiaires11P, Stagiaires11P, Stagiaires11P, Stagiaires11P
 *
 */
public class Customer extends User {

//	private static int idTemp = 0;

	

	/**
	 * 
	 * @param id
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param password
	 * @param role
	 * @param cAccount
	 * @param sAccount
	 * @param ops
	 */
	public Customer(int id, String firstname, String lastname, String email, String password, RoleEnum role, ArrayList<Account> accounts, ArrayList<Banking> bankings ) {
		super(id, firstname, lastname, email, password, role, bankings, accounts);
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	
//	public static int getIdTemp() {
//		return idTemp;
//	}
//
//	public static void setIdTemp(int idTemp) {
//		Customer.idTemp++;
//	}
}
