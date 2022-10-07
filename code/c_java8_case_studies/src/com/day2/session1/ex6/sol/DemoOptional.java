package com.day2.session1.ex6.sol;

import java.util.Optional;

/*
 * 		may have a	 may hv ins		but must have name
 * Person -----> Car---> Insurance--> name
 */
class Insurance {
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}

class Car {
	private Optional<Insurance> insurance;

	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}

}

class Person {

	private Optional<Car> car;

	public Optional<Car> getCar() {
		return car;
	}

	public void setCar(Optional<Car> car) {
		this.car = car;
	}

}

public class DemoOptional {

	public static void main(String[] args) {

		Insurance insurance = new Insurance();
		insurance.setCompanyName("sunlife");

		Optional<Insurance> optInsurance=Optional.ofNullable(null);
		
		Car car = new Car();
		car.setInsurance(optInsurance);
		
		Optional<Car>optCar=Optional.ofNullable(car);

		Person person = new Person();
		person.setCar(optCar);
		
		Optional<Person> optionalPerson= Optional.ofNullable(person);

		String companyName = getInsurceCompanyName(optionalPerson);

		System.out.println(companyName);
	}

	static String getInsurceCompanyName(Optional<Person> opPerson) {
		return opPerson
				.flatMap(p->p.getCar())
				.flatMap(c->c.getInsurance())
				.map(i->i.getCompanyName()).orElse("name is not found");
	
	}
}







