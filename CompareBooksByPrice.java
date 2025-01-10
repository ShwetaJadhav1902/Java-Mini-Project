package com.seed.library.utility;

import java.util.Comparator;

import com.seed.library.Book;

public class CompareBooksByPrice implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		
		return Float.compare(b1.getPrice(), (b2.getPrice()));
	}

}

