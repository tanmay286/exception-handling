package com.capgemini.exceptionhandling.mains;

import com.capgemini.exceptionhandling.exception.DebitLimitExceededException;
import com.capgemini.exceptionhandling.exception.InsufficientFundException;

public class SavingAccountBank extends AccountBank {
	private boolean salaryAccount;
	public static final double MINIMUM_BALANCE=1000;
	
	public SavingAccountBank() {
	
	}

	public SavingAccountBank(long accountId, String accountHolderName, double accountBalance ,boolean salaryAccount) {
		super(accountId, accountHolderName, "SAVING", accountBalance);
		this.salaryAccount=salaryAccount;
	}
	
	public boolean isSalaryAccount() {
		return  salaryAccount;
	}
	
	public void setSalaryAccount() {
		this.salaryAccount=salaryAccount;
	}

	@Override
	public double withdraw(double amount) throws InsufficientFundException, DebitLimitExceededException {
		
		if(salaryAccount) {
			return super.withdraw(amount);
		}
		else {
			if(getAccountBalance() - amount >= MINIMUM_BALANCE)
				setAccountBalance(getAccountBalance() - amount); 
			else
				throw new InsufficientFundException("You don't have sufficient fund.");
			return getAccountBalance();
		}
	}
	
	
}
