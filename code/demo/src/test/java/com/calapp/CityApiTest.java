package com.calapp;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CityApiTest {

	private CityApi cityApi;
	
	@BeforeEach
	void setUp() throws Exception {
		cityApi=new CityApi();
	}
	

	@Test
	void test() {
		//i want to test slow api, if api take more then 7sec it should be consider failed test case
		City city = assertTimeout(Duration.ofMillis(4000), ()-> cityApi.getCity("BTM"));
		System.out.println(city);
		//assertEquals("BTM", city.getName().equals("BTM"));
		
	}

	@AfterEach
	void tearDown() throws Exception {
		cityApi=null;
	}


}
