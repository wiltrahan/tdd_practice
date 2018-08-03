package tdd_practice.code;

public class BinarySearch {

	public static int search(int[] collection, int value) {
		
		int size = collection.length;
		int lower = 0;
		int upper = size - 1;
		int middle;
		
		while(lower <= upper) {
			middle = (lower + upper) / 2;
			if(collection[middle] > value) {
				upper = middle - 1;
			} else if (collection[middle] < value) {
				lower = middle + 1;
			} else {
				return middle;
			}
		}
		return - 1;
	}

}
