package com.collection.exception;

import java.util.LinkedList;

public class ICICIBank {
	
	LinkedList<Account> list = new LinkedList<Account>();
	Account acc = new Account();
	public String addAccount(int accountNumber, double amount){
		acc.setAccountNumber(accountNumber);
		acc.setAmount(amount);
		
		list.add(acc);
		return "account added successfully"; 
	}
	
	public int Withdraw(int accountNumber, double amount){
		
		return account;
	}
}
