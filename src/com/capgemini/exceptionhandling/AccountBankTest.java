package com.capgemini.exceptionhandling;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exceptionhandling.exception.DebitLimitExceededException;
import com.capgemini.exceptionhandling.exception.InsufficientFundException;
import com.capgemini.exceptionhandling.mains.AccountBank;

public class AccountBankTest {
	
	private AccountBank bankaccount;
	@Before
	public void setUp() {
		
		bankaccount=new AccountBank(101,"Tanmay","Saving",41234);
		
	}
	
	@Test
	public void testBankAccountObjectIsCretaedWithDefaultConstructor() {
		AccountBank bankaccount=new AccountBank();
		assertNotNull(bankaccount);
	}
	
	@Test
	public void testBankAccountObjectIsCretaedWithParametrizedConstructor() {
		assertNotNull(bankaccount);
		assertEquals(101, bankaccount.getAccountId());
		assertEquals("Tanmay",bankaccount.getAccountHolderName());
		assertEquals("Saving", bankaccount.getAccountType());
		assertEquals(41234.0, bankaccount.getAccountBalance(),0.01);
	}
	
	@Test
	public void testBankAccountCurrentBalance(){
		assertEquals(41234, bankaccount.getAccountBalance(),0.01);
		
	}
	
	@Test
	public void testWithdrawWithSufficientBalance() throws InsufficientFundException, DebitLimitExceededException {
		bankaccount.withdraw(5000);
		assertEquals(36234, bankaccount.getAccountBalance(),0.01);
	}
	@Test
	public void testWithdrawWithInsufficientBalance() throws InsufficientFundException, DebitLimitExceededException {
		bankaccount.withdraw(45000);
		assertNotEquals(45000, bankaccount.getAccountBalance(),0.01);
	}
	@Test
	public void testDepositWithAmount() {
		bankaccount.deposit(10000);
		assertEquals(51234, bankaccount.getAccountBalance(),0.01);
	}

}
