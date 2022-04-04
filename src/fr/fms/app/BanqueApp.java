package fr.fms.app;

import fr.fms.entities.CurrentAccount;
import fr.fms.entities.Customer;
import fr.fms.entities.SavingsAccount;
import fr.fms.job.IBanking;
import fr.fms.job.IBankingImpl;

public class BanqueApp {

	public static void main(String[] args) {
		
		IBanking iBanking = new IBankingImpl();
		
		Customer customer  = new Customer(1, "jean", "dupont", "jeandupont@gmail.com");
		CurrentAccount currentAccount1 = new CurrentAccount(102030, 5000.0, customer, 500);
		SavingsAccount savingsAccount1 = new SavingsAccount(302010, 14500, null, 6.1);
		
		System.out.println(currentAccount1);
		
		iBanking.createAccount(currentAccount1.getAccountNumber(), customer);
		System.out.println(currentAccount1);
	}

}
