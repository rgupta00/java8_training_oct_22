package com.day1.session1.ex3;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class C_FI_Consumer {
	public static void main(String[] args) {

		Consumer<String>  consumer= name-> System.out.println(name);
		
		consumer.accept("raj");
	
		Account account=new Account(121, "raj", 9000);
		
		Consumer<Account> consumer2=acc-> System.out.println(acc);
		
		BiConsumer<Account, Account>biConsumer=(a1, a2)-> System.out.println(a1+": "+ a2);
	}

}






