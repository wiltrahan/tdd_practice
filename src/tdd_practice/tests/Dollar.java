package tdd_practice.tests;

public class Dollar {
	
	int amount;
	
	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

}
