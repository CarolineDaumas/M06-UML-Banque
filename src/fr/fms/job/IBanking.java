package fr.fms.job;

public interface IBanking {
	
	void deposite(double amount);
	void withdrawal(double amount);
	void transfer(double amount, String accountNumberSrc, String accountNumberTgt);
}
