package com.calapp;

public class City {
	private int id;
	private String name;
	private String state;
	private String country;
	
	private Long population;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public City(int id, String name, String state, String country, Long population) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.country = country;
		this.population = population;
	}

	public City() {}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", state=" + state + ", country=" + country + ", population="
				+ population + "]";
	}
	
	
	

}
