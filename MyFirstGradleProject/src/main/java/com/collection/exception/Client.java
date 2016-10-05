package com.collection.exception;

public class Client {

	public static void main(String args[]){
		ICICIBank bank = new ICICIBank();
		
		bank.addAccount(11111, 10000);
		bank.addAccount(22222, 200000);
	}
	
}
