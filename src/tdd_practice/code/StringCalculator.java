package tdd_practice.code;

public class StringCalculator {

	public int add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		} else if(numbers.length() == 1) {
			return Integer.parseInt(numbers);
		} else {
			return (numbers.charAt(0) - 48) + (numbers.charAt(2) - 48);
		}
		
	}
	
}
