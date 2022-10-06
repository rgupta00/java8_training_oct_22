package com.day1.session1.ex3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class B_FI_Function_Discussed {
	public static void main(String[] args) {

		// Function vs BiFuction
		// function is used to convert something to something else

		//i want to get the name of char in a name "rajiv" 5  "ekta" 4
		
		Function<String, Integer> function= name-> name.length();
		
		System.out.println(function.apply("rajiv"));
		
		//i want to pass account object and get only balance part
		
		Function<Account, Double>function2=acc-> acc.getBalance();
	
		Account account=new Account(121, "raj", 9000);
		
		double bal = function2.apply(account);
		
		//I hv 2 acc object i need to get total sal
		
		Account acc1=new Account(121, "raj", 9000);
		
		Account acc2=new Account(121, "ekta", 9000);
		
		BiFunction<Account, Account, Double> biFunction=( a1,  a2)-> a1.getBalance()+ a2.getBalance();
		
		
		
	}

}






