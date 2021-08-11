package com.tcs.assessment;

import java.util.Date;

public class Current extends Account {

	private Date createDate;
	private float balance = 500;
	private String type;
	private String status;
	private float overdraftBalance;

	public static void main(String[] args) {
		Current account = new Current();
		System.out.println(account.ownnerName);
		System.out.println(account.balance);
	}

}
