package tdd_practice.code;

public class BankAccount {
	
	private String firstName;
	private String lastName;
	private double balance;
	
	
	public BankAccount(String firstName, String lastName, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	
	//The branch argument is true if customer is perfomring the transaction
	//at a branch with a teller, false if at atm
	public double deposit(double amount, boolean branch) {
		balance += amount;
		return balance;
	}
	
	public double withdraw(double amount, boolean branch) {
		balance -= amount;
		return balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
