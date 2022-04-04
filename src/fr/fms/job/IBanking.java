package fr.fms.job;

import fr.fms.entities.Customer;

public interface IBanking {
	
	//createAccount
	void createAccount(int accountNumber, Customer customer);
	
	//checkClientAccount
	boolean checkClientAccount(int accountNumber);
	
	//displayAllOperation de la banque
	//displayClientOperation
	
	//deposit
	//withdraw
	//transfer
	
//	void deposit(User user, double amount, int accountNumber);
//	void withdrawal(User user, double amount, int accountNumber);
//	void transfer(User user, double amount, int accountNumberSrc, int accountNumberTgt);
}
