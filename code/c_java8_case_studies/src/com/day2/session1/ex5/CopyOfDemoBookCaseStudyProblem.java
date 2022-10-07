package com.day2.session1.ex5;
import static java.util.stream.Collectors.*;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class CopyOfDemoBookCaseStudyProblem {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		// 1. Find books with more then 400 pages
//		allBooks.stream().filter(b-> b.getPages()>=400).forEach(b-> System.out.println(b));
		
		// 2. Find all books that are java books and more then 400 pages
		Predicate<Book> predicateMoreThen400Pages=b-> b.getPages()>=400;
		Predicate<Book> predicateJava=b-> b.getSubject()==Subject.JAVA;
		
	//	allBooks.stream().filter(predicateMoreThen400Pages.or(predicateJava)).forEach(b-> System.out.println(b));
		
		// 3. We need the top three longest books
		//B1 B2 B3 B4 B5
//		allBooks.stream().sorted(Comparator.comparing(Book::getPages).reversed()).limit(3).forEach(b-> System.out.println(b));
		
		// 4. We need from the fourth to the last longest books
		//TRY 
		// 5. We need to get all the publishing years

		//Alternative 1
//		List<Integer>yearsList= allBooks.stream()
//				.map(b-> b.getYear())
//				.distinct()
//				.collect(Collectors.toList());
//		yearsList.forEach(y-> System.out.println(y));
		
		//Alterative 2 : use set ...and set dont allow duplicate :) 	.distinct() is not req
		Set<Integer>yearsList= allBooks.stream()
				.map(b-> b.getYear())
				.collect(Collectors.toSet());
		yearsList.forEach(y-> System.out.println(y));
		
		//we want all authers informations
//		Stream<Stream<Author>> map = allBooks.stream().map(b->b.getAuthors().stream());
		//Stream<Author> streamsOfAuthor = allBooks.stream().flatMap(b->b.getAuthors().stream());
		//map vs flatMap 
		
		//prnit all names of authors
		
//		Set<Author> setOfAuthors = allBooks.stream()
//		.flatMap(b->b.getAuthors().stream())
//		.collect(Collectors.toSet());
//		
//		setOfAuthors.stream().forEach(a-> System.out.println(a));
//		
		//what is the notion of flat map?
		
		//Stream<Author> map = allBooks.stream().flatMap(b->b.getAuthors().stream());
		
		
		// 6. We need all the authors names who have written a book		
//		allBooks.stream()
//		.flatMap(b->b.getAuthors().stream())
//		.map(a-> a.getName())
//		.distinct()
//		.forEach(name-> System.out.println(name));
		
		// We need all the origin countries of the authors
//		allBooks.stream()
//		.flatMap(b->b.getAuthors().stream())
//		.map(a-> a.getCountry())
//		.distinct()
//		.forEach(countryName-> System.out.println(countryName));
		
		//i want the name of all authors  from us in blow formate "raj, ekta, seema"
		
//		String authorsNamesFromUs= allBooks.stream()
//		.flatMap(b->b.getAuthors().stream())
//		.filter(a-> a.getCountry().equals("us"))
//		.map(a-> a.getName())
//		.collect(joining(","));
		
	//	System.out.println(authorsNamesFromUs);
		
		// We want the most recent published book.
	
		//Optional : data may be there or not be?
		
//		Optional<Book> optBooks = allBooks.stream().max(Comparator.comparingInt(Book::getYear));
//		
//		System.out.println(optBooks.map(b-> b.getTitle()).orElse("book is not found"));
		
		
		// We want to know if all the books are written by more than one author
	
		//boolean allMatch = allBooks.stream().allMatch(b-> b.getAuthors().size()>=2);
		
		if(allBooks.stream().allMatch(b-> b.getAuthors().size()>=2)) {
			System.out.println("all books written by more then one author");
		}else {
			System.out.println("all books are not written by more then one author");
		}
		
		//we want to know if no book written by only one author
//		boolean noneMatch = allBooks.stream().noneMatch(b->b.getAuthors().size()==1);
//		
//		System.out.println(noneMatch);
//		
		// We want one of the books written by more than one author. (findAny)
		
		Optional<Book> findAny = allBooks.stream().filter(b->b.getAuthors().size()>1).findAny();
		
		System.out.println(findAny.map(b->b.getTitle()).orElse("book not found"));
		// We want the total number of pages published.

	
		// We want to know how many pages the longest book has.

		//long noOfPages= allBooks.stream().map(b->b.getPages()).count();
		
	
		// We want the average number of pages of the books
	
		OptionalDouble averageOpt = allBooks.stream().mapToInt(b->b.getPages()).average();
		//System.out.println(averageOpt.orElse(0));
		
		Double avgNoOfPages = allBooks.stream().collect(averagingInt(Book::getPages));
		//System.out.println(avgNoOfPages);
		// We want all the titles of the books

	
		// We want the book with the higher number of authors?

		Map<Integer, Long> mapYearAndBookCount = allBooks.stream().collect(
				Collectors.groupingBy(Book::getYear, Collectors.counting()));
		
		
		mapYearAndBookCount.entrySet().stream().forEach(e-> System.out.println(e));
	
		// We want a Map of book per year.
		//Map<Integer, List<Book>> mapOfYearWithBooks = allBooks.stream().collect(groupingBy(Book::getYear));
		
		//mapOfYearWithBooks.entrySet().stream().forEach(e-> System.out.println(e));

		// We want to count how many books are published per year.

	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"),new Author("sumit", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 300, Subject.JAVA, 2000, "1213"));
		books.add(new Book("adv java", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("c# basics", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}
