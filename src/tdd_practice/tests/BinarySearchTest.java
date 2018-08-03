package tdd_practice.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import tdd_practice.code.BinarySearch;

class BinarySearchTest {

	@Test
	public void testArrayWithOddNumberOfElements() {
		int[] collection = new int[]
				{11, 22, 33, 44, 55, 66, 77};
		assertEquals(0, BinarySearch.search(collection, 11));
		assertEquals(0, BinarySearch.search(collection, 11));
		assertEquals (6, BinarySearch.search(collection, 77));
        assertEquals (2, BinarySearch.search(collection, 33));
        assertEquals (-1, BinarySearch.search(collection, 9));
        assertEquals (-1, BinarySearch.search(collection, 45));
        assertEquals (-1, BinarySearch.search(collection, 100));
		
	}
	@Test
	public void testArrayWithevenNumberOfElements() {
		int [] collection = new int []
                {11, 22, 33, 44, 55, 66, 77, 88};
        assertEquals (0, BinarySearch.search(collection, 11));
        assertEquals (3, BinarySearch.search(collection, 44));
        assertEquals (4, BinarySearch.search(collection, 55));
        assertEquals (6, BinarySearch.search(collection, 77));
        assertEquals (7, BinarySearch.search(collection, 88));
        assertEquals (2, BinarySearch.search(collection, 33));
        assertEquals (-1, BinarySearch.search(collection, 9));
        assertEquals (-1, BinarySearch.search(collection, 45));
        assertEquals (-1, BinarySearch.search(collection, 100));
		
	}
	@Test
	public void testArrayWithOnlyOneElement() {
		int [] collection = new int [] {11};
        assertEquals (0, BinarySearch.search(collection, 11));
        assertEquals (-1, BinarySearch.search(collection, 9));
        assertEquals (-1, BinarySearch.search(collection, 45));
		
	}

}
