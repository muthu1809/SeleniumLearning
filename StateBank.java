package com.payilagam.javabasics;

public class StateBank extends ReserveBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateBank sbiVelachery = new StateBank(); 
		sbiVelachery.loanCalculation();

	}
	void deposit()
	{
		System.out.println("Deposit here in StateBank");
	}

}
