package com.day1.session2.ex5;

import java.util.Optional;

public class EmployeeApp {
	
	public Optional<Employee> findEmployeeById(int id) {
		///
		Employee employee=new Employee(11, "ramesh", 6000);
		return Optional.ofNullable(employee);
	}

	public Optional<String> empName(int id) {
		///
		
		return Optional.ofNullable(null);
	}
}
