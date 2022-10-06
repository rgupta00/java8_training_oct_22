package com.day1.session1.collection_basics;
import java.util.*;
//Collection : aka readymade ds List, Set, Queue, Map...
public class B_Collection_of_book {

	public static void main(String[] args) {
		//List: AL vs LL
		List<Book> books=new ArrayList<>();
		books.add(new Book(121, "effective java", "foo", 800));
		books.add(new Book(11, "rich dad poor data", "bar", 800));
		books.add(new Book(921, "how to be more effective", "raj", 600));
		books.add(new Book(191, "basic java", "ekta", 490));
		
		System.out.println("----------print the books------------");
		printBooks(books);
		
		//sort them
		//why error
		Collections.sort(books);
		System.out.println("------printing books as per id------------");
		printBooks(books);
		
		System.out.println("------printing books as per title------------");
		
		//BookSorterAsPerTitle
		Collections.sort(books, new BookSorterAsPerTitle());
		printBooks(books);
		
		//BookSorterAsPerPrice
		System.out.println("------printing books as per price------------");
		
		Collections.sort(books, new BookSorterAsPerPrice());
		printBooks(books);
		
		//BookSorterAsPerPriceThenAsPerId
	System.out.println("------printing BookSorterAsPerPriceThenAsPerId------------");
		
		Collections.sort(books, new BookSorterAsPerPriceThenAsPerId());
		printBooks(books);
		
	}

	private static void printBooks(List<Book> books) {
		Iterator<Book> it=books.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
}
