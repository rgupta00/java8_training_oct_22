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

		//let see some examples
		
		//want total no of apples
		long sum= apples.stream().count();
		System.out.println(sum);
		
		
		
				
		//sum of wt of all apples
		int sumOfWtOfApples= apples.stream().filter(Apple::isHeavyApple).mapToInt(a-> a.getWeight()).sum();
		System.out.println(sumOfWtOfApples);
		
		//what is method ref ::
		
		//i want all green apples
		
		List<Apple> applesGreen=apples.stream().filter(Apple::isGreen).collect(Collectors.toList());
		
		
		
		
		// heavy apples >=250
		System.out.println("---------only heavy apples-------------");
		Predicate<Apple> heavyApplesPredicate= a-> a.getWeight()>=250;
		

		List<Apple> heavyApples = AppleApp.getAllApplesOnPredicate(apples, heavyApplesPredicate);
		printApples(heavyApples);
		
		System.out.println("---------only red apples-------------");
		Predicate<Apple> redApplesPredicate= a-> a.getColor().equals("red");
		List<Apple> redApples = AppleApp.getAllApplesOnPredicate(apples, redApplesPredicate);

		printApples(heavyApples);
	
		//heavy or red apples
		
		Predicate<Apple> redOrHeavyPredicate= heavyApplesPredicate.or(redApplesPredicate);
		
		
		

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
