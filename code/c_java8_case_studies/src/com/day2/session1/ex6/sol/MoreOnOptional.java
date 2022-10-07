package com.day2.session1.ex6.sol;

import java.util.Optional;

public class MoreOnOptional {

	public static void main(String[] args) {
		String data = null;
		Optional<String> opString = Optional.ofNullable(data);
//		if (opString.isPresent()) {
//			String string = opString.get();
//			System.out.println(string);
//		} else {
//			System.out.println("not found");
//		}

		System.out.println(opString.orElse("not found"));

		// Optional<String> opString2=Optional.of(data);

	}
}
