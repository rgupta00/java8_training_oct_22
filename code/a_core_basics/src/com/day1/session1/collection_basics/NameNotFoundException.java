package com.day1.session1.collection_basics;

public class NameNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public NameNotFoundException(String message) {
		super(message);
	}
}
