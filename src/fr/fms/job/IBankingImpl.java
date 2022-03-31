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
		// Affichage des comptes
		System.out.println("Numéro du compte courant " + currentAccount.getAccountNumber());
		//System.out.println("Numéro du compte épargne " + savingsAccount.getAccountNumber());
		// Ajout du montant
		System.out.println("Choisissez un numéro de compte à créditer");
		int accountNumberToCredit = scan.nextInt();

		if (accountNumberToCredit == currentAccount.getAccountNumber()) {
			System.out.println("Quel montant voulez-vous déposer sur ce compte courant?");
			double amountToDeposit = scan.nextDouble();
//				double amount = currentAccount.getAccountNumber()+amountToDeposit;
//				currentAccount.setBalanceBank(amount);
			currentAccount.setBalanceBank(+amountToDeposit);
		} else {
			System.out.println("Quel montant voulez-vous déposer sur ce compte d'épargne?");
			double amountToDeposit = scan.nextDouble();
//				double amount = savingsAccount.getAccountNumber()+amountToDeposit;
//				savingsAccount.setBalanceBank(amount);
			savingsAccount.setBalanceBank(+amountToDeposit);
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
