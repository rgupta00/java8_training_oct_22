package com.day1.session2.funcational_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface StringProcessor{
	String process(String name);
}

@FunctionalInterface
interface Cal{
	int add(int a, int b);
}
public class E_ExamplesOfLambda {
	
	public static void main(String[] args) {
		

		List<String> names=new ArrayList<>();
		names.add("ravi");
		names.add("rajiv");
		names.add("pooja");
		names.add("suman");
		names.add("ekta");
	
		Collections.sort(names, ( o1,  o2)-> o2.compareTo(o1));
		System.out.println(names);
		
		
		
		
		
		
		
		
		
		
		StringProcessor processor= name-> name.toUpperCase();
		
			
		System.out.println(processor.process("rajiv"));
		
		
		
		
//		
//		Cal cal=( a,  b)-> a+b;
//			
//		int result =cal.add(2, 2);
//		System.out.println(result);
	}

}
