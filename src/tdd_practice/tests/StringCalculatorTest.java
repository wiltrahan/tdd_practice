package tdd_practice.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd_practice.code.StringCalculator;

public class StringCalculatorTest {

	@Test
	public void testForEmptyString() {
		StringCalculator stringCalc = new StringCalculator();
		assertEquals(stringCalc.add(""), 0);
	}
	
	@Test
	public void testForStringOfOne() {
		StringCalculator stringCalc = new StringCalculator();
		assertEquals(stringCalc.add("2"), 2);
	}
	
	@Test
	public void testForStringOfTwo() {
		StringCalculator stringCalc = new StringCalculator();
		assertEquals(stringCalc.add("2,3"), 5);
		assertEquals(stringCalc.add("4,5"), 9);
		assertEquals(stringCalc.add("9,3"), 12);
	}
	
	@Test
	public void testForStringLongerThanTwo() {
		StringCalculator stringCalc = new StringCalculator();
		assertEquals(stringCalc.add("2,3,4"), 9);
		assertEquals(stringCalc.add("5,10,10"), 25);
		assertEquals(stringCalc.add("5,10,10,30"), 55);
	}
	

}
