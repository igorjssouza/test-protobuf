package com.protobuf.test;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

/**
 * Bank Command Line Interface (CLI)
 */
public class App {

	/**
	 * The CLI prompt to receive data from terminal
	 */
	static Scanner prompt;

	/**
	 * the bank account
	 *
	 * FIXME We use Product class, we should change the classname to Account
	 */
	static Product account;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		prompt = new Scanner(System.in);
		
		runCLIMenu();

		prompt.close();
	}

	static void runCLIMenu(){

		while(true){
			if(account != null) System.out.println(account);
			System.out.println("Choose an option:\n0 - Exit\n1 - New account\n2 - Update account");
			int option = prompt.nextInt();
			switch (option){
				case 0:
					return;
				case 1:
					signupAccount();
					break;
				case 2:
					updateAccountBalance();
					break;
				default:
					System.out.println("Invalid option!");
					break;
			}
		}
	}

	static void signupAccount(){

		// Get account data
		System.out.print("Enter account number: ");
		int accountNumber = prompt.nextInt();
		System.out.print("Enter account holder: ");
		prompt.nextLine();
		String name = prompt.nextLine();

		// Initial deposit
		System.out.println("Is there an initial deposit (y/n)? ");
		char yN = prompt.next().charAt(0);
	
		if (yN == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = prompt.nextDouble();
			account = new Product(name, accountNumber, deposit);
		} else {
			account = new Product(name, accountNumber);	
		}
		
		System.out.println();
	}

	static void updateAccountBalance(){
		System.out.println("Current account data:");
		System.out.println(account);
		
		System.out.println("Choose an option:\n0 - Return\n1 - Deposit\n2 - Withdraw\n");
		int option = prompt.nextInt();

		switch (option){
			case 0:
				return;
			case 1:
				deposit();
				break;
			case 2:
				withdraw();
				break;
			default:
				System.out.println("Invalid option!");
		}
	}
	
	static void deposit(){
			System.out.print("Enter deposit value: ");
			double deposit = prompt.nextDouble();
			account.in(deposit);
	}

	static void withdraw(){
			System.out.print("Enter withdraw value: ");
			double deposit = prompt.nextDouble();
			account.out(deposit);
	}

}
