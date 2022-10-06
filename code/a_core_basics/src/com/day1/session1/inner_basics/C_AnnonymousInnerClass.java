package com.day1.session1.inner_basics;
interface Cookable{
	void cook();
}
public class C_AnnonymousInnerClass {

	public static void main(String[] args) {
		//annoymous inner class?
		
		//since java 8 u can replace ann inner class with lambda expression (don't mean both are same)
		
		Cookable cookable4=() -> System.out.println("it is a cookable ....");
		cookable4.cook();
		
		Cookable cookable5=() -> System.out.println("it is a cookable ....");
		cookable5.cook();
		
//		
//		Cookable cookable=new Cookable() {
//			
//			@Override
//			public void cook() {
//				System.out.println("inside cook method");
//			}
//		};
//		cookable.cook();
//		
//	Cookable cookable2=new Cookable() {
//			
//			@Override
//			public void cook() {
//				System.out.println("inside cook method2");
//			}
//		};
//		cookable2.cook();
//		
//Cookable cookable3=new Cookable() {
//			
//			@Override
//			public void cook() {
//				System.out.println("inside cook method3");
//			}
//		};
//		cookable3.cook();
		
	}
}
