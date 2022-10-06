package com.day1.session2.ex6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPerforamace {
	
	public static void main(String[] args) {
		//you can not process same stream twice
		List<String>list=Arrays.asList("raj","ekta","kapil");
//		Stream<String> s=list.stream();
//		s.forEach(name-> System.out.println(name));
//		s.forEach(name-> System.out.println(name));
		
		System.out.println("===using lambda==========");
		list.stream().forEach(n-> System.out.println(n));
		
		System.out.println("===using method ref==========");
		list.stream().forEach(System.out::println);// this one is diff
		
		//streams processed lazyly
		
		List<Dish> menu = getMenu();
		System.out.println("return the names of dishes that are low in calories (<400),sorted by number of calories");
		
//		menu.stream()
//				.sorted(( o1,  o2) -> Integer.compare(o1.getCalories(), o2.getCalories()))
//				
//				.filter(dish-> {
//					System.out.println("-------------------");
//					return dish.getCalories()<400;
//				})
//				.map(dish-> dish.getName())
//				.forEach(dname-> System.out.println(dname));
			
		
		
		
	}

	private static List<Dish> getMenu() {
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
		
		return menu;
	}
	


}
