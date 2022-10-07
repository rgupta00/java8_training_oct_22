package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.dao.BookDao;
//rajiv
public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<String> getAllBooksBySubject(String subject) {
		return bookDao.getAllBooks().stream().filter(b->b.contains(subject)).collect(Collectors.toList());
	}

}
