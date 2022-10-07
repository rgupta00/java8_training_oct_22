package com.day1.session2.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.day1.session1.ex2.Book;

public class AppleTester {

	public static void main(String[] args) {

		List<Apple> apples = Arrays.asList(
				new Apple("red", 400), 
				new Apple("green", 300), 
				new Apple("green", 200),
				new Apple("red", 150));

		//apples.forEach(a-> System.out.println(a));
		
		List<Apple> apples2=apples.stream()
				.filter(a-> a.getColor().equals("green"))
				.filter(a-> a.getWeight()>=300)
				.collect(Collectors.toList());
		
		
		apples2.forEach(a-> System.out.println(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// Most imp functional interface in java 8

		// Predicate

		// Function

		// Consumer

		// biConsumer
		Map<String, Integer> map = null;

		// Supplier

		// BiFunction

	}

	private static void printApples(List<Apple> heavyApples) {
		heavyApples.forEach(a-> System.out.println(a));
	}
}
