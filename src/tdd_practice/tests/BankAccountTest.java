package tdd_practice.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tdd_practice.code.BankAccount;

public class BankAccountTest {
	
	private BankAccount account;
	private static int count;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("This executes before any test cases. Count = " + count++);
	}
	
	@Before
	public void setUp() {
		account = new BankAccount("Wil", "Trahan", 1000.00, BankAccount.CHECKING);
		System.out.println("Running a test....");
	}

	@Test
	public void deposit() throws Exception {
		double balance = account.deposit(200, true);
		assertEquals(1200.00, balance, 0);
		
	}
	
	@Test
	public void canWithdrawFromBranch() throws Exception {
		double balance = account.withdraw(600, true);
		assertEquals(400, balance, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void cannotWithdrawFromBranch() throws Exception {
		double balance = account.withdraw(600, false);
		assertEquals(400, balance, 0);
	}
	
	@Test
	public void getBalanceAfterDeposit() throws Exception {
		account.deposit(200, true);
		assertEquals(1200.00, account.getBalance(), 0);
	}
	
	@Test
	public void getBalanceAfterWithdraw() throws Exception {
		account.withdraw(200, true);
		assertEquals(800.00, account.getBalance(), 0);
	}
	
	@Test
	public void isCheckingReturnsTrue() {
		assertTrue("The account is NOT a checking account", account.isChecking());
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("This executes after any test cases. Count = " + count++);
	}
	
	@After
	public void tearDown() {
		System.out.println("Count = " + count++);
	}
}
