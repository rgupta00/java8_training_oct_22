package com.day1.session1.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class E_WhyHellWeAreLearingFI_Revision {
	
	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("ravi");
		names.add("rajiv");
		names.add("pooja");
		names.add("suman");
		names.add("ekta");
		
		System.out.println("-------how to iterate it------------");
		
		//names.stream().forEach(n-> System.out.println(n));
		
		//names.stream().sorted().forEach(n-> System.out.println(n));
		
		Map<String, Integer> students=new HashMap<>();
		students.put("raj", 99);
		students.put("ekta", 89);
		students.put("gunika", 100);
		students.put("keshav", 89);
		
		//BiConsumer<String, Integer> biConsumer=(k, v)-> System.out.println(k + " : "+ v);
			
		
		
		
		//students.forEach((k, v)-> System.out.println(k + " : "+ v));
		
		
		//i want to see all rec sorted as per key
//		students.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e-> System.out.println(e));
//		
		//i want to see all rec sorted as per value
		//students.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e-> System.out.println(e));
		
		
		List<Account> accounts=new ArrayList<>();
		accounts.add(new Account(121, "rajiv", 1000));
		accounts.add(new Account(12, "ekta", 2000));
		accounts.add(new Account(1, "rajat", 7000));
		accounts.add(new Account(1222, "suman", 1300));
	
		//accounts.stream().forEach(a-> System.out.println(a));
		
		
		Map<Integer, Account> bankAccoutsMap=new HashMap<>();
		
		bankAccoutsMap.put(121, new Account(121, "rajiv", 7000));
		bankAccoutsMap.put(12, new Account(12, "ekta", 8000));
		bankAccoutsMap.put(1201, new Account(1201, "pooja", 700));
		bankAccoutsMap.put(45, new Account(45, "kapil", 900));
		
//		System.out.println("printing all account map ..as it is");
//		bankAccoutsMap.entrySet().forEach(e-> System.out.println(e));

		System.out.println("printing all account map .sorted by amount in the account");
//		bankAccoutsMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e-> System.out.println(e));

		
//		bankAccoutsMap.entrySet().stream()
//		.sorted(Map.Entry.comparingByValue(Comparator.comparing(Account::getBalance).reversed()))
//		.forEach(e-> System.out.println(e));
//		
//		
//		// java 8 way :)

		
		List<String> namesList= accounts.stream()
				.sorted(Comparator.comparing(Account::getBalance).reversed())
				.filter(a-> a.getBalance()>=1500)
				.map(a-> a.getName())
				//.skip(1)
				//.limit(1)
				.collect(Collectors.toList());
		
		namesList.forEach(accountHolderName-> System.out.println(accountHolderName));
//		
//		
//		collect.forEach(name-> System.out.println(name));
//		
		
//		//java 7 way :(
		//Print the name of all acc holder that have balance more then or eq to 5L sorted as per account balance
//		Collections.sort(accounts, new Comparator<Account>() {
//
//			@Override
//			public int compare(Account o1, Account o2) {
//				return Double.compare(o2.getBalance(), o1.getBalance());
//			}
//		});
//		
//		List<Account> accounts2=new ArrayList<>();
//		
//		for(Account temp: accounts2) {
//			if(temp.getBalance()> 50_00_00) {
//				accounts2.add(temp);
//			}
//		}
//		
//		//you need only name
//		List<String>listNames= new ArrayList<>();
//		
//		for(Account acc: accounts2) {
//			listNames.add(acc.getName());
//		}
		
		//print it :) GTH to Java :(
		
	}
	
}



