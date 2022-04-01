package fr.fms.job;

import java.util.ArrayList;
import java.util.Scanner;

import fr.fms.entities.Account;
import fr.fms.entities.Admin;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.Customer;
import fr.fms.entities.SavingsAccount;

public class IBankingImpl implements IBanking {

	@Override
	public void deposit(Admin admin, double amount, int accountNumber) {

		for (int i = 0; i < admin.getCusts().size(); i++) {
			if (admin.getCusts().get(i).getcAccount() != null && admin.getCusts().get(i).getcAccount().getAccountNumber() == accountNumber) {
				double balanceBankCurrent = admin.getCusts().get(i).getcAccount().getBalanceBank();
				admin.getCusts().get(i).getcAccount().setBalanceBank(amount + balanceBankCurrent);
			} else if (admin.getCusts().get(i).getsAccount() != null && admin.getCusts().get(i).getsAccount().getAccountNumber() == accountNumber) {
				double balanceBankSavings = admin.getCusts().get(i).getsAccount().getBalanceBank();
				admin.getCusts().get(i).getsAccount().setBalanceBank(amount + balanceBankSavings);
			} 
		}
	}

	@Override
	public void withdrawal(Admin admin, double amount, int accountNumber) {
		for (int i = 0; i < admin.getCusts().size(); i++) {
			if (admin.getCusts().get(i).getcAccount() != null && admin.getCusts().get(i).getcAccount().getAccountNumber() == accountNumber && admin.getCusts().get(i).getcAccount().getBalanceBank() > amount) {
				double balanceBankCurrent = admin.getCusts().get(i).getcAccount().getBalanceBank();
				admin.getCusts().get(i).getcAccount().setBalanceBank(balanceBankCurrent - amount);
			} else if (admin.getCusts().get(i).getsAccount() != null && admin.getCusts().get(i).getsAccount().getAccountNumber() == accountNumber && admin.getCusts().get(i).getsAccount().getBalanceBank() > amount) {
				double balanceBankSavings = admin.getCusts().get(i).getsAccount().getBalanceBank();
				admin.getCusts().get(i).getsAccount().setBalanceBank(balanceBankSavings - amount);
			} 
		}

	}

	@Override
	public void transfer(Admin admin, double amount, int accountNumberSrc, int accountNumberTgt) {
		withdrawal(admin, amount, accountNumberSrc);
		deposit(admin, amount, accountNumberTgt);
	}

}
