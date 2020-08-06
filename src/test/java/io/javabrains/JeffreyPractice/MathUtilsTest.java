package io.javabrains.JeffreyPractice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathUtils;
	
	@BeforeEach
	void init()
	{
		mathUtils = new MathUtils();
	}
	
	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		
		assertEquals(expected,actual, "The add method should add two numbers");
	}
	
	@Test
	void testSubtract()
	{
		int expected = 2;
		int actual = mathUtils.subtract(4,2);
		
		assertEquals(expected,actual, "The subtract method should subtract two numbers ");
		
		
	}
	
	
	@Test
	void testMultiply()
	{
		int expected = 20;
		int actual = mathUtils.multiply(4, 5);
		
		assertEquals(expected,actual, "The multiply method should multiply two numbers ");
		
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
