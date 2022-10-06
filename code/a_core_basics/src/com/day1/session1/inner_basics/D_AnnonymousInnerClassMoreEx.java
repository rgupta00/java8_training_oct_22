package com.day1.session1.inner_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D_AnnonymousInnerClassMoreEx {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("ravi");
		names.add("rajiv");
		names.add("pooja");
		names.add("suman");
		names.add("ekta");
		Comparator<String> comparator=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(names);
	
//		Runnable runnable=new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("hello run method");
//			}
//		};
//		
//		Thread thread=new Thread(runnable);
//		thread.run();
		
	}
}
