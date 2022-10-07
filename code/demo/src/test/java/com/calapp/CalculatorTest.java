package com.calapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CalculatorTest {

	private Calculator calculator=null;
	
	@BeforeEach
	public void beforeEach() {
		calculator=new Calculator();
	}
	
	
	
	@DisplayName("test add method for 3 input data")
	@Test
	void testAddManyTime() {
		assertAll(
				()-> assertEquals(4, calculator.add(1, 3)),
				()-> assertEquals(40, calculator.add(10, 30)),
				()-> assertEquals(8, calculator.add(1, 7))
				);
	}
	
	
	@DisplayName("test add method")
	@Test
	void testAdd() {
		assertEquals(4, calculator.add(3, 1));
	}
	@EnabledOnOs(OS.LINUX)
	@Test
	@DisplayName("test multiply method")
	void testMultiply() {
		assertEquals(9, calculator.multiply(3, 3));
	}
	
	@AfterEach
	public void afterEach() {
		calculator=null;
		System.out.println("run after each test case");
	}
	
	@Test
	@DisplayName("test divide method")
	void testDivideSuccessful() {
		
		//assertNotEquals(null, null);
		//assertNotNull(calculator);...
		
		assertEquals(2, calculator.divide(6, 3));
	}
	
	@Test
	@DisplayName("test divide method with exception")
	void testDivideWithException() {
		assertThrows(ArithmeticException.class,
				()-> calculator.divide(5, 0),
				"this method should throw ArithmeticException");
	}
}


/*
 * //@EnabledOnOs(OS.WINDOWS)
	//@EnabledOnJre(JRE.JAVA_11)
	 * @RepeatedTest(value = 3)
	 * 
*/
