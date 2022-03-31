package fr.fms.entities;

import java.util.ArrayList;

public class Customer extends User{

	private static int idTemp=0;
	
	
	public static int getIdTemp() {
		return idTemp;
	}


	public static void setIdTemp(int idTemp) {
		Customer.idTemp ++;
	}


	private CurrentAccount cAccount;
	private SavingsAccount sAccount;
	private ArrayList<Banking> ops= new ArrayList<>();
	
	 
	public Customer(int id, String firstname, String lastname, String email, String password, RoleEnum role,
			CurrentAccount cAccount, SavingsAccount sAccount, ArrayList<Banking> ops) {
		super(id, firstname, lastname, email, password, role);
		this.cAccount = cAccount;
		this.sAccount = sAccount;
		this.ops = ops;
	}


	public Customer() {
		super();
	}


	


	public CurrentAccount getcAccount() {
		return cAccount;
	}


	public void setcAccount(CurrentAccount cAccount) {
		this.cAccount = cAccount;
	}


	public SavingsAccount getsAccount() {
		return sAccount;
	}


	public void setsAccount(SavingsAccount sAccount) {
		this.sAccount = sAccount;
	}


	public ArrayList<Banking> getOps() {
		return ops;
	}


	public void setOps(ArrayList<Banking> ops) {
		this.ops = ops;
	}


	@Override
	public String toString() {
		return super.toString()+ "Customer [cAccount=" + cAccount + ", sAccount=" + sAccount + ", ops=" + ops + "]";
	}
	
	
	
}
