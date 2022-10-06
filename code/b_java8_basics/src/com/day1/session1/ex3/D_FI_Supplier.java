package com.day1.session1.ex3;

import java.util.function.Supplier;

public class D_FI_Supplier {

	public static void main(String[] args) {
		//* Supplier return something aka factory dp ***
		Supplier<String> supplier = () -> "rajat sharma";

		Account account = new Account(121, "raj", 9000);

		Supplier<Account> supplier2=()-> new Account();
	}

}
