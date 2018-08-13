package tdd_practice.tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import tdd_practice.code.StringCalculator;

public class StringCalculatorTest {
	
	private static StringCalculator _stringCalc;
	
	
	
	@BeforeClass
	public static void setUpStringCalculator() {
		_stringCalc = new StringCalculator();
	}

	@Test
	public void testForEmptyString() throws Exception {
		assertEquals(_stringCalc.add(""), 0);
	}
	
	@Test
	public void testForStringOfOne() throws Exception {
		assertEquals(_stringCalc.add("2"), 2);
	}
	
	@Test
	public void testForStringOfTwo() throws Exception {
		assertEquals(_stringCalc.add("2,3"), 5);
		assertEquals(_stringCalc.add("4,5"), 9);
		assertEquals(_stringCalc.add("9,3"), 12);
	}
	
	@Test
	public void testForStringLongerThanTwo() throws Exception {
		assertEquals(_stringCalc.add("2,3,4"), 9);
		assertEquals(_stringCalc.add("5,10,10"), 25);
		assertEquals(_stringCalc.add("5,10,10,30"), 55);
	}
	
	@Test
	public void testForStringWithNewLine() throws Exception {
		assertEquals(_stringCalc.add("1\n2,3"), 6);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Test
	public void testForExceptionThrownDueToNegativeNumber() throws Exception {
		thrown.expectMessage("negatives not allowed");		
		_stringCalc.add("2,-5,99");
	}
	
}
