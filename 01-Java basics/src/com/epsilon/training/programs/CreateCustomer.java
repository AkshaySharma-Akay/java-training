package com.epsilon.training.programs;

import com.epsilon.training.entity.Customer;

public class CreateCustomer {
	
	public static void main(String[] args) {
		
		// Variable declaration
		// c1 is a reference type variable 
		// c1 gets 8 byte in the stack
		// At the time, the class Customer is not loaded in VM, yet.
		
		Customer c1;
		
		// For this statement to work, the class "Customer" must be loaded into VM.
		// A class is loaded only one, and once loaded, stays in the VM for ever.
		// The "new" keyword -> allocates memory equal to sum of all the bytes required 
		// for the fields of Customer class
		// calls to constructor after allocation is done.
		// records the actual address against a reference number, and returns that 
		// reference number, which is then collected by stored by c1.
		c1 = new Customer();
		
		c1.setId(1);
		c1.setName("Akshay");
		c1.setEmail("akshay@training.in");
		c1.setPhone("+91-1234567890");
		
		System.out.println(c1);
	}

}
