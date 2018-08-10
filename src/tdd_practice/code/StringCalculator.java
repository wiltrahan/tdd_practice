package tdd_practice.code;

public class StringCalculator {

	public int add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;	
		} 	
		return splitAndAddString(numbers);
	}
	
	public int splitAndAddString(String numString) {
		int total = 0;
		String[] numArray = numString.split("[,\n]");
		
		for(int i = 0; i < numArray.length; i++) {
			total += Integer.parseInt(numArray[i]);
		}
		return total;
	}
	
}
