package com.tcs.assessment;

import java.util.Date;

public class Current extends Account {

	private Date createDate;
	private float balance = 500;
	private boolean type;
	private String status;
	private float overdraftBalance;

	public Current(Date createDate, float balance, boolean type, String status, float overdraftBalance) {
		super();
		this.createDate = createDate;
		this.balance = balance;
		this.type = type;
		this.status = status;
		this.overdraftBalance = overdraftBalance;
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

	public float getOverdraftBalance() {
		return overdraftBalance;
	}

}
