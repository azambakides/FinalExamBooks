package com.exam.books.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.exam.books.entity.Book;

@Repository
public interface BooksRepository {

	int insertBook(Book book);

	List<Book> getAllBooks();

	Book selectByID(int id);
}
