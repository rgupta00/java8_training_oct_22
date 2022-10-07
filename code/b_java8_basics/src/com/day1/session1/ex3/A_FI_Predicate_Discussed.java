package com.day1.session1.ex3;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
class Prime{
	public static boolean isPrime(Long n){
		boolean isPrimeNumber=true;
		for(int i=2;i<n;i++){
			if(n%i==0)
				isPrimeNumber=false;
		}
		return isPrimeNumber;
	}
}

public class A_FI_Predicate_Discussed {
	public static void main(String[] args) {
		
		//Predicate vs BiPredicate
		Predicate<Integer> predicateForEvenNo=no-> no%2==0;
		System.out.println(predicateForEvenNo.test(441));
		
		Predicate<Long> primePredicate= n-> Prime.isPrime(n);
		
		System.out.println(primePredicate.test(33L));
		
		//pridicate to find out if account have more then 5000
		Predicate<Account> predicateAcc= a-> a.getBalance()>=5000;
		Account account1=new Account(111, "raj", 6000);
		
		System.out.println(predicateAcc.test(account1));
		
	//	double sal=33;
//		double sal2=56;
//		
		BiPredicate<Double, Double> predicate=( s1,  s2)->s1>s2;
		Account account4=new Account(111, "raj", 6000);
		Account account5=new Account(111, "sumit", 50090);
		
		
		BiPredicate<Account, Account> p1=( acc1,  acc2)-> 
				 acc1.getBalance()> acc2.getBalance();
				 
		System.out.println(p1.test(account4, account5));		 
//			
		
		
		
		
		
		
		//FI--> inbuild fi==> 4 cat.... 
		//predicate : 
		//Ex1: we wnat to check if no is even or odd
//		
//		Predicate<Long> evenPredicate= n-> n%2==0;
//		
//		//Ex2: Predicate to check if name contain raj
//		
//		Predicate<String> predicateRaj=name-> name.contains("raj");
//		
//		Predicate<Long>predicatePrime= no-> Prime.isPrime(no);
//		
//		//can be join 2 predicate
//		
//		//no should be even as well as prime
//		
//		//Predicate<Long>predicateJoin= evenPredicate.and(predicatePrime).negate();
		
		
		
		
//		System.out.println(evenPredicate.test(21L));
//		
//		System.out.println(predicateRaj.test("ektaraj"));
//		
		
	}

}
