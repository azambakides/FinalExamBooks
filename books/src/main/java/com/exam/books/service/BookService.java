package com.exam.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.books.entity.Book;
import com.exam.books.repository.BooksRepository;

@Service
public class BookService {

	@Autowired
	BooksRepository booksRepository;

	public BookService(BooksRepository bookRepository) {
		this.booksRepository = bookRepository;
	}

	public int addBook(Book book) {
		return booksRepository.insertBook(book);
	}

	public List<Book> findAllBooks() {
		return booksRepository.getAllBooks();
	}

	public Book getBookById(int id) {
		return booksRepository.selectByID(id);
	}

}
