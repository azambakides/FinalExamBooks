package com.exam.books.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

	int id;
	String name;

	public Book(@JsonProperty("id") int id, @JsonProperty("name") String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
