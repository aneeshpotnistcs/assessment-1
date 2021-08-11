package com.tcs.assessment;

public class Savings extends Account {
	
	private float balance=1000;
	private String type;
	private String status;
	
	public static void main(String[] args) {
		Savings account = new Savings();
		System.out.println(account.ownnerName);
		System.out.println(account.balance);
	}

}
