package com.day1.session2.ex5;

import java.util.Optional;
import java.util.function.Supplier;

public class A_NeedOfOptionalClass {

	public static void main(String[] args) {
		EmployeeApp app=new EmployeeApp();
		Optional<String> empNameOpt = app.empName(22);
		
//		Optional<Employee> empOpt=app.findEmployeeById(44);
		
//		if(empOpt.isPresent()) {
//			System.out.println("then process it");
//			Employee employee=empOpt.get();
//			System.out.println(employee.getName());
//		}else
//			System.out.println("emp not found");
//		
		
		String name = app.findEmployeeById(44).map(e->e.getName()).orElse("name not found");
		System.out.println(name);
		
		
		
//		String name= empNameOpt.orElse("name not found");
//		System.out.println(name);
		
		//Supplier<EmployeeNotFoundExcpetion> supplier=()->  new EmployeeNotFoundExcpetion("emp not found");
			
		
//		String name= empNameOpt.orElseThrow(()->  new EmployeeNotFoundExcpetion("emp not found"));
//		System.out.println(name);
	}
}
