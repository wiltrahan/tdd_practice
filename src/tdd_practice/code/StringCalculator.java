package tdd_practice.code;

public class StringCalculator {

	public int add(String numbers) {
		int total = 0;
		
		if(numbers.isEmpty()) {
			return total;	
		} else if(numbers.length() == 1) {
			return Integer.parseInt(numbers);
		}  else {
			String[] numArray = numbers.split(",");
			for(int i = 0; i < numArray.length; i++) {
				total += Integer.parseInt(numArray[i]);		
			}
			return total;
		}
	}
}
