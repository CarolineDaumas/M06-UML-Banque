package fr.fms.test;

import java.util.Scanner;

import fr.fms.entities.Admin;

public class TestMain {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		Admin admin=new Admin();
		
		admin.createCustomer(scan);
		admin.createCustomer(scan);
		admin.createAccount(admin.getCusts(), scan);
		
		
		
		scan.close();
		
		

	}

}
