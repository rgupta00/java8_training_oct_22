package com.day1.session2.funcational_interface;
interface A{
	void fooMethod();
	default void fooMyDefault() {
		System.out.println("default method of interface A");
	}
	
	public static void fooMyStataic() {
		System.out.println("static  method");
	}
}
interface B{
	void fooMethod();
	default void fooMyDefault() {
		System.out.println("default method of interface B");
	}
	
	public static void fooMyStataic() {
		System.out.println("static  method");
	}
}
class C implements A, B{

	@Override
	public void fooMethod() {
		System.out.println("foo mthod is overriden");
	}
	
	public void fooMyDefault() {
		A.super.fooMyDefault();
		B.super.fooMyDefault();
	}
	
}
public class B_MulitpleInheritance {
	
	public static void main(String[] args) {
		
	}

}
