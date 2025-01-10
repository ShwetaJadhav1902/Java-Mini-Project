package com.seed.library;

import java.util.Set;

public class Book {
	private int id;
	private String name;
	private float price;
	Set<String> author;
	
	public Book() {
		id = 10000;
		name = "none";
		price = 99.99f;
		author = null;
	}


	public Book(int id, String name, float price, Set<String> author) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
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


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public Set<String> getAuthor() {
		return author;
	}


	public void setAuthor(Set<String> author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}

}

