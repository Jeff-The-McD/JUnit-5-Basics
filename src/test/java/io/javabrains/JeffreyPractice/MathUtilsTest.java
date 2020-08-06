package io.javabrains.JeffreyPractice;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils mathUtils;
	
	@BeforeAll
	void beforeAllInits()
	{
		System.out.println("This needs to run before all");
	}
	
	@BeforeEach
	void init()
	{
		mathUtils = new MathUtils();
	}
	
	@AfterEach()
	void cleanUp()
	{
		System.out.println("Cleaning up...");
	}
	
	@Test
	@DisplayName("Testing add Method")
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		
		assertEquals(expected,actual, "The add method should add two numbers");
	}
	
	@Test
	@DisplayName("when adding two positive numbers")
	void testAddNegative()
	{
		assertEquals(-1,mathUtils.add(-1, -1), "should return the right sum");
	}
	
	@Test
	void testSubtract()
	{
		int expected = 2;
		int actual = mathUtils.subtract(4,2);
		
		assertEquals(expected,actual, "The subtract method should subtract two numbers ");
		
		
	}
	
	
	@Test
	@DisplayName("multiply method")
	void testMultiply()
	{
		int expected = 20;
		int actual = mathUtils.multiply(4, 5);
		
		//assertEquals(expected,actual, "The multiply method should multiply two numbers ");
		assertAll(
				()->assertEquals(4,mathUtils.multiply(2, 2)),
				()->assertEquals(0,mathUtils.multiply(2, 0)),
				()->assertEquals(-2,mathUtils.multiply(2, -1))
				);
	}
	
	

	@Test
	void testDivide()
	{
		boolean isServerUp = false;
		
		assumeTrue(isServerUp);
		
		
		assertThrows(ArithmeticException.class,()-> mathUtils.divide(1, 0), "divides two numbers, divide by zero number" );
	}
	
	@Test
	void testComputeCircleRadius()
	{
		
		assertEquals(314.1592653589793,mathUtils.computeCircleRadius(10),"Should return the radius of the circle");
	}
	
	
	

}
