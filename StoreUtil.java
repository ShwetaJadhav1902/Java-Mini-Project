package com.seed.library.utility;

import java.util.ArrayList;
import java.util.List;

public class StoreUtil<Book> {

	List<Book> records=new ArrayList<Book>();
	
	public void addRecords(Book book) {
		records.add(book);
	}
	
	public List getrecords() {
		return records;
		}
	public int getnoofrecords() {
		return records.size();
	}

	@Override
	public String toString() {
		return "StoreUtil [records=" + records + "]";
	}
	
}


