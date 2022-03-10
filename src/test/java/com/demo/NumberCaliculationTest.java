package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberCaliculationTest {
	NumberCalculation nc = new NumberCalculation();
	@Test
	public void testCase1() {
		assertEquals(nc.add(10, 30), 40);

	}
	@Test
	public void testCase2() {
		assertEquals(nc.convertCase("hello"), "HELLO");
	}
	
	/*@Test
	public void testCase2() {
		assertEquals(nc.add(10, 30), 10);
	}
	@Test
	public void testCase3() {
		assertEquals(nc.add(10, 30), 10);

	} */

}
