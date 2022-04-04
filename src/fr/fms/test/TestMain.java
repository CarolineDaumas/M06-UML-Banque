package fr.fms.test;

//import java.util.ArrayList;
//import java.util.Scanner;
//
//import fr.fms.entities.Account;
//import fr.fms.entities.AccountNature;
//import fr.fms.entities.Admin;
//import fr.fms.entities.Banking;
//import fr.fms.entities.CurrentAccount;
//import fr.fms.entities.Customer;
//import fr.fms.entities.RoleEnum;
//import fr.fms.entities.SavingsAccount;
//import fr.fms.entities.User;
//import fr.fms.job.IBanking;
//import fr.fms.job.IBankingImpl;

//public class TestMain {
//
//	public static ArrayList<Customer> bankCustomers = new ArrayList<Customer>();
//	public static ArrayList<Customer> customers = new ArrayList<Customer>();
//	public static ArrayList<Account> accounts = new ArrayList<Account>();
//	
//	//Toutes les operations de l'établissement 
//	public static ArrayList<Banking> bankings = new ArrayList<Banking>();
//
//	public static void main(String[] args) {
//		// Metier instance
//		IBanking iBanking = new IBankingImpl();
//		
//		/*Instantiation des comptes*/
//		CurrentAccount current1 = new CurrentAccount(10001, 5000.5, 1000., AccountNature.CURRENT, null, null, null);
//		CurrentAccount current2 = new CurrentAccount(10002, 17000.50, 1000.0, AccountNature.CURRENT, null, null, null);
//		SavingsAccount saving1 = new SavingsAccount(20001, 10000.0, 5.4, AccountNature.SAVINGS, null, null, null);
//		SavingsAccount saving2 = new SavingsAccount(20002, 6000.1, 2.3, AccountNature.SAVINGS, null, null, null);
//		
//		/*Instantiation des Clients*/
//		Customer customer1 = new Customer(1, "fisrtCust1", "lastCust1", "emailCust1", "pwdCust1", RoleEnum.CLIENT, null,
//				null);
//		Customer customer2 = new Customer(2, "fisrtCust2", "lastCust2", "emailCust2", "pwdCust2", RoleEnum.CLIENT, null,
//				null);
//		Customer custToAdd = new Customer(0, "fisrtToAdd", "lastToAdd", "emailToAdd", "pwdToAdd", RoleEnum.CLIENT, null,
//				null);
//
//		customers.add(customer1);
//		customers.add(customer2);
//
//		bankCustomers.add(customer1);
//		bankCustomers.add(customer2);
//
//		Admin admin = new Admin(1, "admin", "pol", "pol@admin.com", "admin123", RoleEnum.ADMIN, customers, null, null);
//
//		System.out.println("\n******************* Add Customer *********************************\n");
//		admin.createCustomer(custToAdd, admin);
//		System.out.println(admin);
//
//		System.out.println("\n******************* Add Account *********************************\n");
//		admin.createAccount(admin, 1, current1);
//		admin.createAccount(admin, 1, saving1);
//		admin.createAccount(admin, 2, current2);
//		admin.createAccount(admin, 3, saving2);
//		System.out.println(accounts);
//
//		System.out.println("\n********************** Deposit method *********************************\n");
//		iBanking.deposit(admin, 15000, 10001);
//		iBanking.deposit(admin, 50, 10002);
//		iBanking.deposit(customer1, 150, 20001);
//		iBanking.deposit(custToAdd, 120, 20002);
//		iBanking.deposit(admin, 800, 20002);
//		//System.out.println(bankings);
//		
//		System.out.println("Account bankings: \n" +saving2.getBankings());
//		System.out.println("admin bankings: \n" +admin.getBankings());
//		System.out.println("customer bankings: \n" +customer1.getBankings());
//
//		System.out.println("\n********************** Withdrawal method *********************************\n");
//		System.out.println("before "+customer1.getAccounts().get(0).getBalanceBank());
//		iBanking.withdrawal(admin, 459, 10001);
//		System.out.println("after "+customer1.getAccounts().get(0).getBalanceBank());
//		iBanking.withdrawal(customer1, 1111, 10001);
//	//	System.out.println(bankings);
//		System.out.println("after "+customer1.getAccounts().get(0).getBalanceBank());
//		
//		System.out.println("\n********************** Transfer method *********************************\n");
//		System.out.println("befor transfer: "+customer1.getAccounts().get(0).getBalanceBank());
//		System.out.println("befor transfer: "+customer1.getAccounts().get(1).getBalanceBank());
//		iBanking.transfer(admin,20000030, 10001, 10001);
//		iBanking.transfer(customer1,20, 20001, 10001);
//		System.out.println("befor transfer: "+customer1.getAccounts().get(0).getBalanceBank());
//		System.out.println("befor transfer: "+customer1.getAccounts().get(1).getBalanceBank());
//		System.out.println(bankings);
//		
//		System.out.println("\n********************** Transfer connect *********************************\n");
//		customer1.connect("emailCust1", "pwdCust1");
//		admin.connect("pol@admin.com", "admin123");
//	}
//}
