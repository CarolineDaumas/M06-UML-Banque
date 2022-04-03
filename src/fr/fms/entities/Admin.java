package fr.fms.entities;

import java.util.ArrayList;

import fr.fms.test.TestMain;

/**
 * 7
 * 
 * @author Stagiaires11P
 *
 */
public class Admin extends User {

	private ArrayList<Customer> custs = new ArrayList<>();

	/**
	 * 
	 * @param id
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param password
	 * @param role
	 * @param custs
	 * @param accounts
	 * @param bankings
	 */
	public Admin(int id, String firstname, String lastname, String email, String password, RoleEnum role,
			ArrayList<Customer> custs, ArrayList<Account> accounts, ArrayList<Banking> bankings) {
		super(id, firstname, lastname, email, password, role, bankings, accounts);
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
		return super.toString() + " [Customers: " + custs + "]\n";
	}

	/**
	 * 
	 * @param customer
	 * @param admin
	 */
	public void createCustomer(Customer customer, User admin) {
		// generate a new ID
		customer.setId(TestMain.bankCustomers.size() + 1);
		((Admin) admin).getCusts().add(customer);
		TestMain.bankCustomers.add(customer);
	}

	/**
	 * 
	 * @param admin
	 * @param customerId
	 * @param account
	 */
	public void createAccount(Admin admin, int customerId, Account account) {

		Customer customerSearch = new Customer();
		ArrayList<Account> accountsAdm = new ArrayList<>();

		for (int i = 0; i < admin.getCusts().size(); i++)
			if (admin.getCusts().get(i).getId() == customerId) {
				customerSearch = admin.getCusts().get(i);
				i = admin.getCusts().size();// sortir de la boucle
			}

		if (account.getAccountNature().equals(AccountNature.valueOf("CURRENT"))) {
			admin.getAccounts().add(account);
			customerSearch.getAccounts().add(account);
			TestMain.accounts.add(account); // Bank global account

		} else if (account.getAccountNature().equals(AccountNature.valueOf("SAVINGS"))) {
			admin.getAccounts().add(account);
			customerSearch.getAccounts().add(account);
			TestMain.accounts.add(account); // Bank global account

		}
	}
}
