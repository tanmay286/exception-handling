package com.capgemini.exceptionhandling.mains;

import com.capgemini.exceptionhandling.exception.DebitLimitExceededException;
import com.capgemini.exceptionhandling.exception.InsufficientFundException;

public class AccountBank {
	private long accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	public AccountBank() {
		super();
	}
	public AccountBank(long accountId, String accountHolderName, String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public double withdraw(double amount) throws InsufficientFundException, DebitLimitExceededException {
		if(accountBalance >= amount)
			accountBalance=accountBalance-amount;
		else
			throw new InsufficientFundException("you don't have sufficient fund.");
		
		return accountBalance;
		
	}
	public double deposit(double amount) {
		accountBalance=accountBalance+amount;
		
		return accountBalance;
		
	}
}
