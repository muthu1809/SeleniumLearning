package com.payilagam.javabasics;

 class Bank {
	String customerName1, customerName2; 
	long loan; 
	private int minBalance = 500; 
	
	
	public int getMinBalance() {
		return minBalance;
	}
	
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}



	public Bank(Customer customer) {
		// TODO Auto-generated constructor stub
		System.out.println("Check where I am printed");
		customerName1 = customer.name1; 
		customerName2=	customer.name2; 
		 loan= 	customer.loan1; 
		System.out.println(customerName2 + customerName1);
	}

	

	public Bank() {
		// TODO Auto-generated constructor stub
	}



	public Bank(Customer customer, int i) {
		// TODO Auto-generated constructor stub
	}



	public void getCustomerDetails() {
		// TODO Auto-generated method stub
		System.out.println("Customer Names are "+ customerName1 + " "+customerName2 );
		
		
		
		//System.out.println("Interest for Customer "+ customerDetails.name2 + " is "+ interest);
	}
	public void loanCalculation()
	{
	float interest = loan /10; 
	System.out.println("interest rate is "+ interest);
	}
}
