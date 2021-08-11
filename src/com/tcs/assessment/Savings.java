package com.tcs.assessment;

import java.util.Date;

public class Savings extends Account {

	private Date createDate;
	private float balance = 1000;
	private String type;
	private String status;

	public static void main(String[] args) {
		Savings account = new Savings();
		System.out.println(account.ownnerName);
		System.out.println(account.balance);
	}

}
