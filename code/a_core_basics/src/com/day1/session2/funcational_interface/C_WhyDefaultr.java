package com.day1.session2.funcational_interface;

//interface act as a contract bw two parties
interface MyInn{
	void foo();
	void foo2();
	default void bar() {
		System.out.println("some default method of bar...");
	}
}
class MyInnByAnil implements MyInn{

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foo2() {
		// TODO Auto-generated method stub
		
	}
	
}

class MyInnByEkta implements MyInn{

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foo2() {
		// TODO Auto-generated method stub
		
	}
	
}
public class C_WhyDefaultr {

	public static void main(String[] args) {
		
	}
}
