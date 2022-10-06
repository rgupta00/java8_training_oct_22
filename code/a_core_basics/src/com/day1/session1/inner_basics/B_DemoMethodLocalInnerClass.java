package com.day1.session1.inner_basics;
class A{
	void foo() {
		class B{
			void fooB() {
				System.out.println("fooB inside class B");
			}
		}
		B bObj=new B();
		bObj.fooB();
	}
	
}
public class B_DemoMethodLocalInnerClass {

	public static void main(String[] args) {
		
	}
}
