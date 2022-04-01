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

//		Customer.setIdTemp(Customer.getIdTemp());
//		customer.setId(Customer.getIdTemp());
//		System.out.println("Entrez le nom du client:");
//		String lastname = scan.next();
//		customer.setLastname(lastname);
//
//		System.out.println("Entrez le prénom du client:");
//		String firstname = scan.next();
//		customer.setFirstname(firstname);
//
//		System.out.println("Entrez l'email du client:");
//		String email = scan.next();
//		customer.setEmail(email);
//
//		System.out.println("Entrez le mot de passe du client:");
//		String password = scan.next();
//		customer.setPassword(password);
//
//		System.out.println("Entrez le rôle de l'utilisateur (admin/client):");
//		String role = scan.next();
//		customer.setRole(RoleEnum.valueOf(role.toUpperCase()));
//
//		System.out.println(customer);
//		this.custs.add(customer);
//		System.out.println(custs);
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
		
		
//
//		System.out.println("Quel type de compte voulez-vous créer (CURRENT/ SAVINGS)?");
//		String choice = scan.next();
//		if (choice.equalsIgnoreCase("current")) {
//			CurrentAccount current = new CurrentAccount();
//			System.out.println("Entrez le montant du solde bancaire");
//			double balanceBank = scan.nextDouble();
//			current.setBalanceBank(balanceBank);
//
//			System.out.println("Entrez le montant du découvert autorisé");
//			double overdraft = scan.nextDouble();
//			current.setOverdraft(overdraft);
//
//			// Creation du numéro de compte
//			CurrentAccount.setAccountNumberTemp(CurrentAccount.getAccountNumberTemp());
//			current.setAccountNumber(CurrentAccount.getAccountNumberTemp());
//			customerSearch.setcAccount(current);
//		} else {
//			SavingsAccount savings = new SavingsAccount();
//			System.out.println("Entrez le montant du solde bancaire, il doit être positif");
//			double balanceBank = scan.nextDouble();
//			savings.setBalanceBank(balanceBank);
//
//			System.out.println("Entrez le taux d'intérêts appliqué au compte épargne");
//			double interestRate = scan.nextDouble();
//			savings.setInterests(interestRate);
//
//			// Creation du numéro de compte
//			SavingsAccount.setAccountNumberTemp(SavingsAccount.getAccountNumberTemp());
//			savings.setAccountNumber(SavingsAccount.getAccountNumberTemp());
//			customerSearch.setsAccount(savings);
//
//		}
//
//		System.out.println(customers);

	}

}
