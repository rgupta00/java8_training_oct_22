package com.day1.session1.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class F_AccountExample {
	
	public static void main(String[] args) {
		
		// i ve accounts list and we want to print acc holder name  iff balance > 5L show in sorted order
		
		List<Account> accounts=new ArrayList<>();
		accounts.add(new Account(121, "rajiv", 1000));
		accounts.add(new Account(12, "ekta", 2000));
		accounts.add(new Account(1, "rajat", 3000));
		accounts.add(new Account(1222, "suman", 4000));
	
		
		// java 8 way :)
//		List<String> collect = accounts.stream()
//		.sorted(Comparator.comparing(Account::getBalance).reversed())
//		.filter(acc-> acc.getBalance()>=3000 )
//		.map(acc-> acc.getName())
//		.collect(Collectors.toList());
//		
//		
//		collect.forEach(name-> System.out.println(name));
		accounts.stream()
				.sorted(Comparator.comparing(Account::getBalance).reversed())
				.filter(acc-> acc.getBalance()>=3000 )
				.map(acc-> acc.getName())
				.forEach(name-> System.out.println(name));
				
		
		
//		//java 7 way :(
//		
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
//		
//		//print it :) GTH to Java :(
		
	}
	
}



