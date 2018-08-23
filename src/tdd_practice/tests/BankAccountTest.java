package tdd_practice.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd_practice.code.BankAccount;

public class BankAccountTest {

	@Test
	public void deposit() throws Exception {
		BankAccount account = new BankAccount("Wil", "Trahan", 1000.00, BankAccount.CHECKING);
		double balance = account.deposit(200, true);
		assertEquals(1200.00, balance, 0);
		
	}
	
	@Test
	public void withdraw() throws Exception {
		BankAccount account = new BankAccount("Wil", "Trahan", 1000.00, BankAccount.CHECKING);
		double balance = account.withdraw(200, true);
		assertEquals(800, balance, 0);
	}
	
	@Test
	public void getBalanceAfterDeposit() throws Exception {
		BankAccount account = new BankAccount("Wil", "Trahan", 1000.00, BankAccount.CHECKING);
		account.deposit(200, true);
		assertEquals(1200.00, account.getBalance(), 0);
	}
	
	@Test
	public void getBalanceAfterWithdraw() throws Exception {
		BankAccount account = new BankAccount("Wil", "Trahan", 1000.00, BankAccount.CHECKING);
		account.withdraw(200, true);
		assertEquals(800.00, account.getBalance(), 0);
	}
	
	@Test
	public void isCheckingReturnsTrue() {
		BankAccount account = new BankAccount("Wil", "Trahan", 1000.00, BankAccount.CHECKING);
		assertTrue(account.isChecking());
	}
	
}
