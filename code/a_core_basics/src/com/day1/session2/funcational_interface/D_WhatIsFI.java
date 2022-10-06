package com.day1.session2.funcational_interface;
//a interface is stb fi iff it have only one abstract method

@FunctionalInterface
interface MyInterface{
	void foo();
	//void foo2();
	
	default void fooDefault() {
		System.out.println("foo default method");
	}
	default void fooDefault2() {
		System.out.println("foo default2 method");
	}
	static void fooStatic() {
		System.out.println("fooStatic..");
	}
}
public class D_WhatIsFI {

	public static void main(String[] args) {
		
		//FI Support lambda.. java 8 compiler have better type inferece" 
//		MyInterface interface1=new MyInterface() {
//			
//			@Override
//			public void foo() {
//				System.out.println("some imp of foo method..");
//			}
//		};
		
//	MyInterface interface1=() ->{
//				System.out.println("some imp of foo method..");
//			
//		};
		
		//What is the main diff bw lambada and ann inner class
		
		//lambada is just a peice of code intenally jvm implement as a static method
		//ann inner class it is object
		
		
		
		
		MyInterface interface1=() ->System.out.println("some imp of foo method..");
	
	
	}
}








