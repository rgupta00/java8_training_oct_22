package com.day1.session2.funcational_interface;
//user define class

import java.util.Comparator;


class BookSorterAsPerPriceThenAsPerId implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		int value= Double.compare(o2.getPrice(), o1.getPrice());
		if(value==0) {
			value=Integer.compare(o1.getId(), o2.getId());
		}
		return value;
	}
	
}

class BookSorterAsPerPrice implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		return Double.compare(o2.getPrice(), o1.getPrice());
	}
	
}

class BookSorterAsPerTitle implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
}

public class Book implements Comparable<Book>{
	private int id;
	private String title;
	private String author;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int id, String title, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author
				+ ", price=" + price + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Book o) {
		return Integer.compare(this.getId(), o.getId());
	}
	
	
	
}
