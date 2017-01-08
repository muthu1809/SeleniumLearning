package com.payilagam.exceptionhan;

public class TryCatchDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchDemo tcd = new TryCatchDemo(); 
		try{
		tcd.tryThis(2, 0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please check values");
		}
		
		tcd.add(5,2); 

	}

}
