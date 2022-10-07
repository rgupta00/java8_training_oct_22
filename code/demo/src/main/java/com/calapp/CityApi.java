package com.calapp;

public class CityApi {

	public City getCity(String city) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new City(222, city, "Karnataka", "India", 60000000L);
	}
	
}
