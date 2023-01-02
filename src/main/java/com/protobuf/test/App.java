package com.protobuf.test;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

/**
 * TODO
 */
public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//copnstrutor padrão
		Product product;		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char yN = sc.next().charAt(0);
	
		if (yN == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			product = new Product(name, accountNumber, deposit);
		} else {
            product = new Product(name, accountNumber);	
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(product);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		System.out.println("Update account data:");	
		product.in(deposit);
		System.out.println(product);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		deposit = sc.nextDouble();
		System.out.println("Update account data:");	
		product.out(deposit);
		System.out.println(product);
		
		
		
		
		
				
		sc.close();
	}
}
