package com.payilagam.javabasics;

public class ReserveBank {
	String customerName1, customerName2; 
	long loan; 
	private int minBalance = 500; 
	
	
	public int getMinBalance() {
		return minBalance;
	}
	
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}



	public ReserveBank(Customer customer) {
		// TODO Auto-generated constructor stub
		System.out.println("Check where I am printed");
		customerName1 = customer.name1; 
		customerName2=	customer.name2; 
		 loan= 	customer.loan1; 
		System.out.println(customerName2 + customerName1);
	}

	

	public ReserveBank() {
		// TODO Auto-generated constructor stub
	}



	public ReserveBank(Customer customer, int i) {
		// TODO Auto-generated constructor stub
	}



	public void getCustomerDetails() {
		// TODO Auto-generated method stub
		System.out.println("Customer Names are "+ customerName1 + " "+customerName2 );
		
		
		
		//System.out.println("Interest for Customer "+ customerDetails.name2 + " is "+ interest);
	}
	void deposit()
	{
		System.out.println("Deposit here in ReserveBank");
	}
	public void loanCalculation()
	{
	float interest = loan /10; 
	System.out.println("interest rate is "+ interest);
	}

}
