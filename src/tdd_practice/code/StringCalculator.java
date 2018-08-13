package tdd_practice.code;

public class StringCalculator {

	public int add(String numbers) throws Exception {
		if(numbers.isEmpty()) {
			return 0;	
		} 	
		return splitAndAddString(numbers);
	}
	
	public int splitAndAddString(String numbers) throws Exception {
		int total = 0;
		String[] numArray = numbers.split("[,\n]");
		
		for(int i = 0; i < numArray.length; i++) {
			if(Integer.parseInt(numArray[i]) < 0) {
				throw new Exception("negatives not allowed: " + numArray[i]);
			}
			total += Integer.parseInt(numArray[i]);
		}
		return total;
	}
	
}
