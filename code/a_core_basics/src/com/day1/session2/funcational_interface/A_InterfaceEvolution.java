package com.day1.session2.funcational_interface;
interface Foo{
	void fooMethod();
	default void fooMyDefault() {
		System.out.println("default method");
	}
	
	public static void fooMyStataic() {
		System.out.println("static  method");
	}
}
class FooImpl implements Foo{

	@Override
	public void fooMethod() {
		System.out.println("FooImp is done");
	}
	
}
public class A_InterfaceEvolution {
	
	public static void main(String[] args) {
		Foo foo=new FooImpl();
		foo.fooMethod();
		foo.fooMyDefault();
		Foo.fooMyStataic();
	}

}
