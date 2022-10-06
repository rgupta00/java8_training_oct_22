package com.day1.session2.ex4;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.Predicate;
public class AppleApp {
	
	public static  List<Apple> getAllApplesOnPredicate(List<Apple> apples, Predicate<Apple> predicate){
		return apples.stream().filter(predicate).collect(toList());
	}
	
}












//public static  List<Apple> getAllHeavyApples(List<Apple> apples){
//	List<Apple> heavyApples=new ArrayList<>();
//	for(Apple apple: apples) {
//		if(apple.getWeight()>=250) {
//			heavyApples.add(apple);
//		}
//	}
//	return heavyApples;
//}

//public static  List<Apple> getAllRedApples(List<Apple> apples){
//	List<Apple> redApples=new ArrayList<>();
//	for(Apple apple: apples) {
//		if(apple.getColor().equals("red")) {
//			redApples.add(apple);
//		}
//	}
//	return redApples;
//}