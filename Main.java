package com.seed.librarymain;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.seed.library.Book;
import com.seed.library.utility.CompareBooksByName;
import com.seed.library.utility.CompareBooksByPrice;
import com.seed.library.utility.PrintUtil;
import com.seed.library.utility.StoreUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner sc = new Scanner(System.in);
		StoreUtil<Book> coll = new StoreUtil<Book>();
		TreeSet<Book> booksbyname = new TreeSet<>(new CompareBooksByName());
		TreeSet<Book> booksbyprice = new TreeSet<>(new CompareBooksByPrice());
		
		int numberOfBooks = 0;
		
		// Accepting Number Of Books To Add:
		try {		
		System.out.println("Enter The Number Of Books You Wish To Add: ");
		numberOfBooks = sc.nextInt();
		sc.nextLine();	
		
			if(numberOfBooks<=0) {
				throw new IllegalArgumentException("Enter a number greater than 0");
				}
		
		}
		catch(IllegalArgumentException e){
			System.err.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.err.println("Invalid Input! Enter An Integer.");
		}
		
		
		// Accepting Details Of The Books To Add:
		for(int i=1; i<=numberOfBooks; i++) {
			System.out.println("Enter Details Of New Book #"+i+" : ");
			
			
			System.out.println("Book ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Book Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Number Of Authors: ");
			int numberOfAuthors = sc.nextInt();
			sc.nextLine();
			
			Set<String> authors = new HashSet<>();
			for(int j=1; j<=numberOfAuthors; j++) {
				System.out.println("Name Of The Author #"+j+" : ");
				authors.add(sc.nextLine());
			}
			
			System.out.println("Enter Book Price: ");
			float price = sc.nextFloat();
			sc.nextLine();
			
			Book book = new Book(id, name, price,authors);
			coll.addRecords(book);
			booksbyprice.add(book);
			booksbyname.add(book);
		}

		System.out.println("Book Collection: ");
		PrintUtil.printRecords(coll);
		
		System.out.print("\nBooks Sorted By Name: ");
		for(Book list:booksbyname) {
			System.out.print(list);
		}
		
		System.out.print("\n\nBooks Sorted By Price: ");
		for(Book list:booksbyprice) {
			System.out.print(list);
		}

}
}


