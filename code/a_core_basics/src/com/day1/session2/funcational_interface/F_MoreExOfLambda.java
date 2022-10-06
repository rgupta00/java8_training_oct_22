package com.day1.session2.funcational_interface;
import java.util.*;
//Collection : aka readymade ds List, Set, Queue, Map...
public class F_MoreExOfLambda {

	public static void main(String[] args) {
		//List: AL vs LL
		List<Book> books=new ArrayList<>();
		books.add(new Book(121, "effective java", "foo", 800));
		books.add(new Book(11, "rich dad poor data", "bar", 800));
		books.add(new Book(921, "how to be more effective", "raj", 600));
		books.add(new Book(191, "basic java", "ekta", 490));
		
		printBooks(books);
		System.out.println("-------printing books as per price (rev order)-------");
		
		Comparator<Book> comparatorAsPerPriceInRevOrder=( o1,  o2) ->Double.compare(o2.getPrice(), o1.getPrice());
		
		//:: is called method ref is syntex suger on lambda 
		Collections.sort(books, Comparator.comparing(Book::getPrice).reversed());
		
		printBooks(books);
		
	}

	private static void printBooks(List<Book> books) {
		Iterator<Book> it=books.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
}
