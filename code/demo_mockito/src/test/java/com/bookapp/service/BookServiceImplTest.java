package com.bookapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bookapp.dao.BookDao;

class BookServiceImplTest {

	private BookService bookService;
	private BookDao bookDao;
	
	@BeforeEach
	void setUp() throws Exception {
		bookDao=null;
		bookService=new BookServiceImpl(bookDao);
	}

	@Test
	void getAllBooksBySubjectTest() {
		assertEquals(2, bookService.getAllBooksBySubject("java").size());
	}
	
	@AfterEach
	void tearDown() throws Exception {
		bookDao=null;
		bookService=null;
	}


}
