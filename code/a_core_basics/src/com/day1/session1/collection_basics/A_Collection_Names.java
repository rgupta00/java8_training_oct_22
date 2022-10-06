package com.day1.session1.collection_basics;
import java.util.*;
//Collection : aka readymade ds List, Set, Queue, Map...
public class A_Collection_Names {

	public static void main(String[] args) {
		//List: AL vs LL
		List<String> names=new ArrayList<>();
		names.add("ravi");
		names.add("rajiv");
		names.add("pooja");
		names.add("suman");
		names.add("ekta");
//		System.out.println("printing the names using enhanced for loop");
//		//print them-> enhanced for loop
//		for(String name: names) {
//			System.out.println(name);
//		}
		
		//Iterator
		printNames(names);
		
		//sort
		Collections.sort(names);
		printNames(names);
		//serach it
		//we want to search name "pooja"
		int index= Collections.binarySearch(names, "seema");
		System.out.println(index);
		
	}
	
	public static String getName(String name, List<String >names) {
		//if user is found return it or else throw ex
		Collections.sort(names);
		int index= Collections.binarySearch(names, name);
		if(index>=0) {
			return names.get(index);
		}else
			throw new NameNotFoundException("name "+name +" is not found");
		
	}

	private static void printNames(List<String> names) {
		System.out.println("printing the names using iterator");
		Iterator<String> it=names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
