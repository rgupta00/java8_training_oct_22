package com.day1.session1.collection_basics;
import java.util.*;
//Collection : aka readymade ds List, Set, Queue, Map...
public class C_Demo_Set {

	public static void main(String[] args) {
		//List: AL vs LL
		Set<String> names=new HashSet<>();
		names.add("ravi");
		System.out.println(names.add("rajiv"));;
		System.out.println(	names.add("rajiv"));
		names.add("pooja");
		names.add("suman");
		names.add("ekta");

		printNames(names);
	
	}
	
	private static void printNames(Set<String> names) {
		System.out.println("printing the names using iterator");
		Iterator<String> it=names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
