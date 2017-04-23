package com.payilagam.javabasics;

public class Customer {
	String name1 = "Ashok"; 
	int id1 = 123; 
	long loan1 = 5000; 
	String name2 = "Joseph"; 
	int id2 = 123; 
	String address2 = "Madurai"; 
	long loan2 = 10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(); 
		Customer customer2 = new Customer(); 
		/*muthuvel.deposit(); 
		muthuvel.withdraw();*/ 
		Bank sbiVelachery = new Bank(customer); 
		Bank sbiEgmore = new Bank();
		Bank iobVelachery = new Bank();
		sbiVelachery.getCustomerDetails();
		sbiVelachery.loanCalculation();
		//customerForm.getCustomerDetails("Joseph", 234,"joseph@gmail.com");

	}

	private void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("I am in withdraw method");
		System.out.println("Address2 is "+ address2);
		
	}

	private void deposit() {
		// TODO Auto-generated method stub
		System.out.println("I am in deposit method");
		
	}


}
