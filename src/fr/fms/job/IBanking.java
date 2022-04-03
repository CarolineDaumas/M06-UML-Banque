package fr.fms.job;

import fr.fms.entities.Admin;
import fr.fms.entities.User;

public interface IBanking {
	
	void deposit(User user, double amount, int accountNumber);
	void withdrawal(User user, double amount, int accountNumber);
	void transfer(User user, double amount, int accountNumberSrc, int accountNumberTgt);
}
