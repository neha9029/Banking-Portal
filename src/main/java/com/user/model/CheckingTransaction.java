package com.user.model;

import java.math.BigDecimal;
import java.util.Date;

public class CheckingTransaction {
	
	private Long id;
	private Date date;
	private String type;
	private String status;
	private double amount;
	private BigDecimal availableBalance;
	private CheckingAccount checkingAccount;
	public CheckingTransaction() {
		
	}
	public CheckingTransaction(Date date, String type, String status, double amount, BigDecimal availableBalance,
			CheckingAccount checkingAccount) {
		super();
		this.date = date;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.availableBalance = availableBalance;
		this.checkingAccount = checkingAccount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	
	
	
	
	

}
