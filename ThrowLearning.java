package com.payilagam.exceptionhan;

public class ThrowLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voterAgeCheck(); 
		
		
		//throw new VoterIDCheckException(age); 
		
	}

	public static void voterAgeCheck() {
		// TODO Auto-generated method stub
int age = 17; 
		
		VoterIDCheckException vote = new VoterIDCheckException(age); 
		
		
	}

}
