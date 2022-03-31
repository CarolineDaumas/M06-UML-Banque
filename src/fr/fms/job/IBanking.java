package fr.fms.job;

import java.util.ArrayList;
import java.util.Scanner;

import fr.fms.entities.Customer;

public interface IBanking {
	
	void deposit(ArrayList<Customer> customers, Scanner scan);
	void withdrawal(double amount);
	void transfer(double amount, String accountNumberSrc, String accountNumberTgt);
}
