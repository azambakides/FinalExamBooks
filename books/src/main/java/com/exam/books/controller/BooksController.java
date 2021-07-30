package com.exam.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.books.entity.Book;
import com.exam.books.service.BookService;

@RequestMapping("api/v1/books")
@RestController
public class BooksController {

	@Autowired
	BookService bookService;

	public BooksController(BookService bookService) {
		this.bookService = bookService;
	}

	@PostMapping
	public void addStudent(@RequestBody Book book) {
		bookService.addBook(book);
	}

	@GetMapping
	public List returnBook() {
		return bookService.findAllBooks();
	}

	@GetMapping(path = "{id}")
	public Book getBookBySpecificID(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}

}
