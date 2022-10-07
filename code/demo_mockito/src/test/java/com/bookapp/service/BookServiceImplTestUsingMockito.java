package com.bookapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.dao.BookDao;

@ExtendWith(MockitoExtension.class) //it is used to integrate junit with mockito
class BookServiceImplTestUsingMockito {

	@InjectMocks
	private BookServiceImpl bookService;
	
	@Mock
	private BookDao bookDao;
	
	@BeforeEach
	void setUp() throws Exception {
		//NOW U will not implement dao layer 
		 List<String> booksList = Arrays.asList("think and grow rich","effective c++","java basics");
		 when(bookDao.getAllBooks()).thenReturn(booksList);
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
