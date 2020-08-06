package io.javabrains.JeffreyPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		
		assertEquals(expected,actual, "The add method should add two numbers");
	}
	

	@Test
	void testDivide()
	{
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class,()-> mathUtils.divide(1, 0), "divides two numbers, divide by zero number" );
	}
	
	@Test
	void testComputeCircleRadius()
	{
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793,mathUtils.computeCircleRadius(10),"Should return the radius of the circle");
	}
	

}
