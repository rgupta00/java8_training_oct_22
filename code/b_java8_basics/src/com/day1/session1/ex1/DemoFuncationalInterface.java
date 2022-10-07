package com.day1.session1.ex1;

interface Cal{
	public int add(int a, int b);
}
@FunctionalInterface
interface Foo{
	void foo();
	
	default void fooDefault() {
		System.out.println("default method inside interface foo");
	}
	
	static void fooStatic() {
		System.out.println("static method inside interface foo");
	}
}
class FooImpl implements Foo{

	@Override
	public void foo() {
		System.out.println("foo is overriden");
	}
	
    @Override
	public void fooDefault( ) {
		System.out.println("default method inside interface foo override...");
	}
}
public class DemoFuncationalInterface {

	public static void main(String[] args) {
		
		//What is functional interface?
		Foo foo=() -> System.out.println("some imp of foo method ...");
			
		Cal cal=(a,b)-> a+b;
		
		
		
		
		
		
		
		//Foo.fooStatic();
		
		/*
		 * What is functional interface?
		 * @FunctionalInterface
		 * Interface and diamond problem and solution
		 * Interface evolution: default method , static method examples
		 */
	}
}
