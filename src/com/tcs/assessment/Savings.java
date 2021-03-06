package com.tcs.assessment;

import java.util.Date;

public class Savings extends Account {

	private Date createDate;
	private float balance = 1000;
	private boolean type;
	private String status;

	public Savings(Date createDate, float balance, boolean type, String status) {
		super();
		this.createDate = createDate;
		this.balance = balance;
		this.type = type;
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public float getBalance() {
		return balance;
	}

	public boolean isType() {
		return type;
	}

	public String getStatus() {
		return status;
	}

}
