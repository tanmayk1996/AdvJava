package com.abstractionDemo;

public class Test {

	public static void main(String[] args) {
		
		Bank bank;
		
		bank = new SBI();
		bank = new Kotak();
		
		System.out.println("Intrest Rate is : " +bank.getRateOfIntrest());
		
		
	}
}
