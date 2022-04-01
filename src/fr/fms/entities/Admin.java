package fr.fms.entities;

import java.util.ArrayList;

public class Admin extends User {

	private ArrayList<Customer> custs = new ArrayList<>();
	

	public Admin(int id, String firstname, String lastname, String email, String password, RoleEnum role,
			ArrayList<Customer> custs) {
		super(id, firstname, lastname, email, password, role);
		this.custs = custs;
	}

	public Admin() {
		super();
	}

	public ArrayList<Customer> getCusts() {
		return custs;
	}

	public void setCusts(ArrayList<Customer> custs) {
		this.custs = custs;
	}

	@Override
	public String toString() {
		return super.toString() + "Admin [custs=" + custs + "]";
	}

	public void createCustomer(Customer customer, Admin admin) {
		admin.getCusts().add(customer);
	}

	public void createAccount(Admin admin, int customerId, Account account) {

		Customer customerSearch = new Customer();

		System.out.println(admin.getCusts().get(0).getId());

		for (int i = 0; i < admin.getCusts().size(); i++) {
			if (admin.getCusts().get(i).getId() == customerId)
				customerSearch = admin.getCusts().get(i);
		}

		if (account.getAccountNature().equals(AccountNature.valueOf("CURRENT"))) {
			customerSearch.setcAccount((CurrentAccount) account);
		} else if (account.getAccountNature().equals(AccountNature.valueOf("SAVINGS"))) {
			customerSearch.setsAccount((SavingsAccount) account);
		}
	}
}
