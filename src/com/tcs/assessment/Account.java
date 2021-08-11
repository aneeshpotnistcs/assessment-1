package com.tcs.assessment;

import java.util.Date;

public class Account {
	
	protected String ownnerName="ABC";
	private Date createDate;
	
	public static void main(String[] args) {
		Account account = new Account();
		System.out.println(account.ownnerName);
	}

}
