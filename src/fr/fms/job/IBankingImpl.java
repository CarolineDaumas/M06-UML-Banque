package fr.fms.job;

import java.util.Date;

import fr.fms.entities.Account;
import fr.fms.entities.AccountNature;
import fr.fms.entities.Admin;
import fr.fms.entities.Banking;
import fr.fms.entities.BankingNature;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.SavingsAccount;
import fr.fms.entities.User;
import fr.fms.test.TestMain;

public class IBankingImpl implements IBanking {

	/**
	 * 
	 */
	@Override
	public void deposit(User user, double amount, int accountNumber) {
		// mise à jour de la table operations (list)
		Banking banking = new Banking(0, null, null, amount, user);
		int found = 0;

		for (int i = 0; i < user.getAccounts().size(); i++) {
			if (user.getAccounts() != null && user.getAccounts().get(i).getAccountNumber() == accountNumber) {
				
				found++; //the searched account found
				double newBbalanceBankCurrent = user.getAccounts().get(i).getBalanceBank() + amount;
				user.getAccounts().get(i).setBalanceBank(newBbalanceBankCurrent);
				//
				banking.setId(TestMain.bankings.size() + 1);
				banking.setAmount(amount);
				banking.setBankingNature(BankingNature.DEPOSITE);
				banking.setDate(new Date());
				banking.setUser(user);
				TestMain.bankings.add(banking);
				user.setBankings(TestMain.bankings);
				i = user.getAccounts().size(); // sortir de la boucle
			}

		}
		if (found == 0)
			System.out.println("Identifiant incorrect");

	}

	@Override
	public void withdrawal(User user, double amount, int accountNumber) {
		Banking banking = new Banking(0, null, null, amount, user);
		int found = 0;
		int condition = 0;

		for (int i = 0; i < user.getAccounts().size(); i++) {
			if (user.getAccounts() != null && user.getAccounts().get(i).getAccountNumber() == accountNumber) {

				found++; // accountNumber found

				// traiter s'il s'agit d'un compte courant ou espargne
				AccountNature accountNature = user.getAccounts().get(i).getAccountNature();
				double lastBalanceBank = 0.0; // solde disponible avant l'operation

				// cas current
				if (accountNature.equals(AccountNature.CURRENT))
					lastBalanceBank = user.getAccounts().get(i).getBalanceBank()
							+ ((CurrentAccount) user.getAccounts().get(i)).getOverdraft();
				// cas saving
				else
					lastBalanceBank = user.getAccounts().get(i).getBalanceBank();

				if (lastBalanceBank > amount) {
					condition++;
					double newBbalanceBankCurrent = user.getAccounts().get(i).getBalanceBank() - amount;
					user.getAccounts().get(i).setBalanceBank(newBbalanceBankCurrent);
					//
					banking.setId(TestMain.bankings.size() + 1);
					banking.setAmount(amount);
					banking.setBankingNature(BankingNature.WITHDRAWAL);
					banking.setDate(new Date());
					banking.setUser(user);
					TestMain.bankings.add(banking);
					user.setBankings(TestMain.bankings);
					i = user.getAccounts().size(); // sortir de la boucle
				}
				if (condition == 0)
					System.out.println("operation impossible, montant dépasse le solde disponible\n");
				
				if (found == 0)
					System.out.println("Identifiant incorrect");
			}
			

		}

	}

	@Override
	public void transfer(User user, double amount, int accountNumberSrc, int accountNumberTgt) {
		Banking banking = new Banking(0, null, null, amount, user);

		int lastBankingIndex = TestMain.bankings.size();

		withdrawal(user, amount, accountNumberSrc);

		if (lastBankingIndex < TestMain.bankings.size()) {
			deposit(user, amount, accountNumberTgt);

			banking.setId(TestMain.bankings.size() + 1);
			banking.setAmount(amount);
			banking.setBankingNature(BankingNature.TRANSFER);
			banking.setDate(new Date());
			banking.setUser(user);
			TestMain.bankings.add(banking);
		}
	}

}
