package com.day1.session1.ex0;

import java.util.stream.LongStream;

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
public class MotivationJava8 {
	
	public static void main(String[] args) {
		//1 to 1_00_00
		long start= System.currentTimeMillis();
		long counter=LongStream.rangeClosed(1, 1_00_000).parallel().filter(Prime::isPrime).count();
//		for(long i=1;i<=1_00_00_0; i++) {
//			if(Prime.isPrime(i)) {
//				counter++;
//			}
//		}
		
		
		long end= System.currentTimeMillis();
		System.out.println("time taken : "+ (end-start)+" ms");
		System.out.println("result : "+ counter);
		
		
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		/*
		 * System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
		or

		java -Djava.util.concurrent.ForkJoinPool.common.parallelism=8 DemoTakingAdvOfParallelProcessingwithOutPhd

		 */
	}

}
