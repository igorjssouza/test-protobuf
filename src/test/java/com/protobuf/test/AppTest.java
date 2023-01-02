package com.protobuf.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import entities.Product;
import entities.InvalidDepositException;

/**
 * Test suite for App.
 */
public class AppTest 
{
    /**
     * Test getters and setters methods
     */
    @Test
    public void testGetAccountOwner()
    {
	    String name = "Dirack";
	    int accountNumber = 11111;
	    double deposit = 300.0;
	Product product = new Product(name, accountNumber, deposit);
	assertEquals(name, product.getName());
	assertEquals(accountNumber, product.getAccountNumber());
	assertEquals(deposit, product.getDeposit(), 0.001);
    }

    @Test
    public void testGetAccountNumber()
    {
	    String name = "Dirack";
	    int accountNumber = 11111;
	    double deposit = 300.0;
	Product product = new Product(name, accountNumber, deposit);
	assertEquals(accountNumber, product.getAccountNumber());
    }
    
    @Test
    public void testGetAccountDeposit()
    {
	    String name = "Dirack";
	    int accountNumber = 11111;
	    double deposit = 300.0;
	Product product = new Product(name, accountNumber, deposit);
	assertEquals(deposit, product.getDeposit(), 0.001);
    }

    @Test
    public void testThrowExceptionForInvalidDeposit(){

	    Product product = new Product("Dirack",11111);

	    assertThrows(InvalidDepositException.class,()->{
			product.in(-100.0);	
		});
	}

}
