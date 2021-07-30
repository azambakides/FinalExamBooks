package com.exam.books.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.exam.books.entity.Book;

@Repository
public class BooksDatabase implements BooksRepository {

	private static List<Book> DATABASE = new ArrayList<>();

	@Override
	public int insertBook(Book book) {
		DATABASE.add(new Book(book.getId(), book.getName()));
		return 1;

	}

	@Override
	public List<Book> getAllBooks() {
		return DATABASE;
	}

	public Book selectByID(int id) {
		// return DATABASE.stream().filter(person ->
		// person.getId().equals(id)).findFirst();
		Book found = null;
		for (Book book : DATABASE) {
			if (book.getId() == id) {
				found = book;
			}
		}
		return found;
	}

}
