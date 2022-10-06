package com.day1.session1.inner_basics;
class Outer{
	
	class Inner{
		void foo() {
			System.out.println("foo of inner class");
		}
	}
}
public class A_DemoInner {

	public static void main(String[] args) {
		Outer.Inner inn=new Outer().new Inner();
		inn.foo();
	}
}
