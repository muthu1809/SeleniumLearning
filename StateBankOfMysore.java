package com.payilagam.javabasics;

public class StateBankOfMysore extends StateBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateBankOfMysore sbm = new StateBankOfMysore(); 
		sbm.deposit();
		StateBank sbi = new StateBankOfMysore(); 
		
	}
	void deposit()
	{
		
		System.out.println("Deposit here in StateBankOfMysore");
	}
void withdraw()
{
	System.out.println("Withdraw here in StateBankOfMysore");
}
}
