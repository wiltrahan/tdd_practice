package tdd_practice.code;

public class StringCalculator {

	public int add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		} else if(numbers.length() == 1) {
			return Integer.parseInt(numbers);
		} else if(numbers.length() == 3) {
			return (numbers.charAt(0) - 48) + (numbers.charAt(2) - 48);
		}
		else {
			String[] numArray = numbers.split(",");
			int total = 0;
			for(int i = 0; i < numArray.length; i++) {
				total += Integer.parseInt(numArray[i]);
				
			}
			return total;
			
		}
	}
	
}
