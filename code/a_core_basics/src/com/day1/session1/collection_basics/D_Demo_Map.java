package com.day1.session1.collection_basics;
import java.util.*;
import java.util.Map.Entry;
//Collection : aka readymade ds List, Set, Queue, Map...
public class D_Demo_Map {

	public static void main(String[] args) {
		//List: AL vs LL
		Map<String, Integer> students=new HashMap<>();
		students.put("raj", 99);
		students.put("ekta", 89);
		students.put("gunika", 100);
		students.put("keshav", 89);
		
		//how to print map
		//keyset
		System.out.println("---------using keyset--------");
		Set<String> keySet = students.keySet();
		for(String key: keySet) {
			System.out.println(key+" : "+ students.get(key));
		}
		System.out.println("---------using entrySet--------");
		//entryset is faster ?
		Set<Entry<String, Integer>> entrySet = students.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() + ": "+ entry.getValue());
		}
		
		//java 8
		System.out.println("----------using java 8---------------");
		students.forEach((k,v)-> System.out.println(k+" : "+ v));
	}
	
	
}





