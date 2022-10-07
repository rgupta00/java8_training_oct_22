package com.day2.session1.ex7;

import java.util.function.LongConsumer;
import java.util.stream.LongStream;

public class ParellelProcessing {

	public static void main(String[] args) {
		//I want to sum 1 to 1_000_000L==500000000500000000
		long start= System.currentTimeMillis();
		
//		long sum=0;
//		for (long i = 1; i <= 1_000_000000L; i++) {
//			sum += i;
//		}
		
//		long []sum2=new long[] {0L};
//		
//		LongStream.rangeClosed(1, 1_000_000000L)
//		.parallel()
//		.forEach( value-> sum2[0]=sum2[0]+value);
		
//		long sum=LongStream.rangeClosed(1,  1_000_000000L)
//				.parallel()
//				.reduce(0, (x,y)-> x+y);
		
		//.reduce(0, (x,y)-> x+y) same as .sum() under the hood
		
		long sum=LongStream.rangeClosed(1,  1_000_000000L)
				.parallel()
				.sum();
		
		long end= System.currentTimeMillis();
		System.out.println("time taken : "+(end-start)+" ms ");
		//System.out.println("sum is : "+ sum2[0]);
		System.out.println("sum is : "+ sum);
	}
}









