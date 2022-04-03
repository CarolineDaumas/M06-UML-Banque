package fr.fms.entities;

import java.util.ArrayList;

public class User {

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private RoleEnum role;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	private ArrayList<Banking> bankings ;

	public User(int id, String firstname, String lastname, String email, String password, RoleEnum role,
			ArrayList<Banking> bankings, ArrayList<Account> accounts) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.role = role;
		this.bankings = bankings;
		this.accounts = new ArrayList<>();

	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public User() {

	}

	public RoleEnum getRole() {
		return role;
	}

	public void setRole(RoleEnum role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", role=" + role + ", accounts=" + accounts + ", bankings=" + bankings
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public ArrayList<Banking> getBankings() {
		return bankings;
	}

	public void setBankings(ArrayList<Banking> bankings) {
		this.bankings = bankings;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void connect(String email, String password) {
		if (this.email.equalsIgnoreCase(email) && this.password.equals(password)) 
			if (this.role.equals(RoleEnum.ADMIN)) 
				System.out.println("You are connected as ADMIN, you can do these following tasks\n"
						+"Add customer, add account, deposit, withdrawal and transfer\n");
			else 
				System.out.println("You are connected as CUSTOMER, you can do these following tasks\n"
						+"Aeposit, withdrawal and transfer\n");		
		else 
			System.out.println("Email or password is incorrect \n");
		
	}

}
