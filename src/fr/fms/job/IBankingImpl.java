package fr.fms.job;

import java.util.ArrayList;
import java.util.Scanner;

import fr.fms.entities.Account;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.Customer;
import fr.fms.entities.SavingsAccount;

public class IBankingImpl implements IBanking {

	@Override
	public void deposit(ArrayList<Customer> customers, Scanner scan) {

		// Customer customerSearch = new Customer();
		CurrentAccount currentAccount = new CurrentAccount();
		SavingsAccount savingsAccount = new SavingsAccount();
		// Admin admin = new Admin();
		System.out.println("Rentrez l'identifiant du client");
		int id = scan.nextInt();
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getId() == id) {
				// customerSearch = customers.get(i);
				currentAccount = customers.get(i).getcAccount();
				savingsAccount = customers.get(i).getsAccount();
			} else
				System.out.println("Identifiant incorrect");
		}

		if (currentAccount != null)
			System.out.println("Num�ro du compte courant " + currentAccount.getAccountNumber());
		if (savingsAccount != null)
			System.out.println("Num�ro du compte �pargne " + savingsAccount.getAccountNumber());

		// Ajout du montant
		System.out.println("Choisissez un num�ro de compte � cr�diter");
		int accountNumberToCredit = scan.nextInt();

		if (currentAccount != null && accountNumberToCredit == currentAccount.getAccountNumber()) {
			System.out.println("Quel montant voulez-vous d�poser sur ce compte courant?");
			double amountToDeposit = scan.nextDouble();
			currentAccount.setBalanceBank(currentAccount.getBalanceBank() + amountToDeposit);
		} else if (savingsAccount != null && accountNumberToCredit == savingsAccount.getAccountNumber()) {
			System.out.println("Quel montant voulez-vous d�poser sur ce compte d'�pargne?");
			double amountToDeposit = scan.nextDouble();
			savingsAccount.setBalanceBank(savingsAccount.getBalanceBank() + amountToDeposit);
		}

		System.out.println(currentAccount.getBalanceBank());

	}

	@Override
	public void withdrawal(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transfer(double amount, String accountNumberSrc, String accountNumberTgt) {
		// TODO Auto-generated method stub

	}

}
