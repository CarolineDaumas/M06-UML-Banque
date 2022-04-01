package fr.fms.test;

import java.util.ArrayList;
import java.util.Scanner;

import fr.fms.entities.AccountNature;
import fr.fms.entities.Admin;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.Customer;
import fr.fms.entities.RoleEnum;
import fr.fms.entities.SavingsAccount;
import fr.fms.job.IBanking;
import fr.fms.job.IBankingImpl;

public class TestMain {

	public static void main(String[] args) {
		//Metier instance
		IBanking iBanking = new IBankingImpl();

		ArrayList<Customer> customers = new ArrayList<Customer>();
		Admin admin = new Admin(1, "admin", "pol", "pol@admin.com", "admin123", RoleEnum.ADMIN, customers);
		CurrentAccount current1 = new CurrentAccount(5000.50, admin, 10001, 1000.0, AccountNature.CURRENT);
		CurrentAccount current2 = new CurrentAccount(17000.50, admin, 10002, 15000.0, AccountNature.CURRENT);
		SavingsAccount saving1 = new SavingsAccount(10000.0, admin, 20001, 5.4, AccountNature.SAVINGS);
		SavingsAccount saving2 = new SavingsAccount(6000.1, admin, 20002, 2.3, AccountNature.SAVINGS);

		Customer customer = new Customer(1, "abc", "paul", "paul@abc.fr", "123", RoleEnum.CLIENT, null, null, null);
		Customer customer2 = new Customer(2, "abcy", "jack", "jack@abcy.fr", "1234", RoleEnum.CLIENT, null, null, null);
//		Customer custToAdd = new Customer(3, "add", "jean", "add@jean.com", "1234", RoleEnum.CLIENT);
		
		customers.add(customer); 
		customers.add(customer2);
	
		
//		admin.createCustomer(custToAdd, admin);

//		System.out.println(current1);
//		System.out.println(customers.size());
		
		admin.createAccount(admin, 1, current1);
		admin.createAccount(admin, 1, saving1);
		admin.createAccount(admin, 2, current2);
//		System.out.println(current1);
		iBanking.deposit(admin, 25000, 10001);
		iBanking.deposit(admin, 2000, 20001);
		System.out.println(customer);
		
		iBanking.withdrawal(admin, 3000, 10001);
		iBanking.withdrawal(admin, 5000, 20001);
		System.out.println("jack avant virement : " + customer2);
		System.out.println("paul avant virement : " + customer);
		
		iBanking.transfer(admin, 5000, 10001, 10002);
		System.out.println("paul a fait un virement à jack" + customer);
		System.out.println("jack après virement " + customer2);
		
	}

}
