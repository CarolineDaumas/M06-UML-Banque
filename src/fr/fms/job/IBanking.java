package fr.fms.job;

import java.util.ArrayList;
import java.util.Scanner;

import fr.fms.entities.Admin;
import fr.fms.entities.Customer;

public interface IBanking {
	
	void deposit(Admin admin, double amount, int accountNumber);
	void withdrawal(Admin admin, double amount, int accountNumber);
	void transfer(Admin admin, double amount, int accountNumberSrc, int accountNumberTgt);
}
