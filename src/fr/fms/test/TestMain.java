package fr.fms.test;

import java.util.Scanner;

import fr.fms.entities.Admin;
import fr.fms.job.IBanking;
import fr.fms.job.IBankingImpl;

public class TestMain {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		IBanking iBanking = new IBankingImpl();
		
		Admin admin=new Admin();
		
		admin.createCustomer(scan);
		admin.createCustomer(scan);
		admin.createAccount(admin.getCusts(), scan);
		iBanking.deposit(admin.getCusts(), scan);
		
		System.out.println(admin.getCusts().get(0).getcAccount().getBalanceBank());
		scan.close();
		
		

	}

}
