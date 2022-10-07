package com.day1.session2.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleApp {

	public static List<Apple> getFilterApples(List<Apple> appleList, Predicate<Apple> applePredicate) {
		List<Apple> filteredApples = new ArrayList<>();
		for (Apple eachApple : appleList) {
			if (applePredicate.test(eachApple)){
				filteredApples.add(eachApple);
			}
		}
		return filteredApples;
	}
}
