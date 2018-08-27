package tdd_practice.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import tdd_practice.code.BankAccount;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {

	private BankAccount account;
	private double amount;
	private boolean branch;
	private double expected;
	
	
	public BankAccountTestParameterized(double amount, boolean branch, double expected) {
		this.amount = amount;
		this.branch = branch;
		this.expected = expected;
	}

	@Before
	public void setup() {
		account = new BankAccount("Wil", "Trahan", 1000.00, BankAccount.CHECKING);
		System.out.println("Running a Param test...");
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> testConditions() {
		return Arrays.asList(new Object[][] {
			{100.00, true, 1100.00},
			{200.00, true, 1200.00},
			{325.14, true, 1325.14},
			{489.33, true, 1489.33},
			{1000.00, true, 2000.00}
		});
	}
	
	@Test
	public void getBalanceAfterDeposit() throws Exception {
		account.deposit(amount, branch);
		assertEquals(expected, account.getBalance(), .01);
	}

}
