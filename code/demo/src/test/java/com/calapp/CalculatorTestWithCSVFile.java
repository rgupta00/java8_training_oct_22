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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CalculatorTestWithCSVFile {

	private Calculator calculator=null;
	
	@BeforeEach
	public void beforeEach() {
		calculator=new Calculator();
	}
	
	
	@DisplayName("test add method getting data from csv file")
	@ParameterizedTest
	//@Test
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	void add(int firstno, int secno, int result) {
		assertEquals(result, calculator.add(firstno,secno));
	}
	
	@AfterEach
	public void afterEach() {
		calculator=null;
	}
}
