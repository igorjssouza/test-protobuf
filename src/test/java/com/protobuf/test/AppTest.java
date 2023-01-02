package com.protobuf.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import entities.Product;

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
	    Integer accountNumber = 11111;
	    Double deposit = 300;
	Product p = new Product(name, accountNumber, deposit);
	assertEquals( name, p.getName() );
    }
}
