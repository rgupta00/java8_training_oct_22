package com.day1.session2.ex5;

public class EmployeeNotFoundExcpetion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundExcpetion(String message) {
		super(message);
	}
}
