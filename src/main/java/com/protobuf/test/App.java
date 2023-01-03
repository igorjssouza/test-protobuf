package com.protobuf.test;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

/**
 * Bank Command Line Interface (CLI)
 */
public class App {

	static Scanner prompt;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		prompt = new Scanner(System.in);
		
		runCLIMenu();

		prompt.close();
	}

	static void runCLIMenu(){

		//while(true){

		Product product;
		System.out.print("Enter account number: ");
		int accountNumber = prompt.nextInt();
		System.out.print("Enter account holder: ");
		prompt.nextLine();
		String name = prompt.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char yN = prompt.next().charAt(0);
	
		if (yN == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = prompt.nextDouble();
			product = new Product(name, accountNumber, deposit);
		} else {
            product = new Product(name, accountNumber);	
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(product);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = prompt.nextDouble();
		System.out.println("Update account data:");	
		product.in(deposit);
		System.out.println(product);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		deposit = prompt.nextDouble();
		System.out.println("Update account data:");	
		product.out(deposit);
		System.out.println(product);
			
	}
}
