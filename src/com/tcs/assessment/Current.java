package com.tcs.assessment;

public class Current extends Account {
	
	private float balance=500;
	private String type;
	private String status;
	private float overdraftBalance;
	
	public static void main(String[] args) {
		Current account = new Current();
		System.out.println(account.ownnerName);
		System.out.println(account.balance);
	}


}
