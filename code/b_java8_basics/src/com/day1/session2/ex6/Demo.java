package com.day1.session2.ex6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH) );
		
		System.out.println("printing all food in the menu");
	//	printAll(menu);
		
		
		System.out.println("--------all meat----------------");
//		List<Dish> dishAllMeat=menu.stream()
//				.filter(dish-> dish.getType()==Dish.Type.MEAT)
//				.collect(Collectors.toList());
		
		//printAll(dishAllMeat);
		
		/*
		 * return the names of dishes that are low in calories (<400),sorted by number of calories
		 */
		System.out.println("return the names of dishes that are low in calories (<400),sorted by number of calories");
		List<String>dishNames=menu.stream()
				.sorted(( o1,  o2) -> Integer.compare(o1.getCalories(), o2.getCalories()))
				
				.filter(dish-> dish.getCalories()<400)
				.map(dish-> dish.getName())
				.collect(Collectors.toList());
		
		//dishNames.forEach(dname-> System.out.println(dname));
		
	}

	private static void printAll(List<Dish> menu) {
		menu.forEach(dish-> System.out.println(dish));
	}

}
