package com.tns.client;

import com.tns.entities.Book;
import com.tns.service.BookService;
import com.tns.service.BookServiceImpl;
import com.tns.dao.*;


public class Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bs  = new BookServiceImpl();
		Book b = new Book();
		b.setAuthor("Shah");
		b.setPrice(50.0);
		b.setTitle("PHP");
		bs.addBook(b);
		
		Book b1 = new Book();
		b1.setAuthor("Jenny");
		b1.setPrice(1150.0);
		b1.setTitle("C");
		bs.addBook(b1);
		
		Book b2 = new Book();
		b2.setAuthor("Diya");
		b2.setPrice(3150.0);
		b2.setTitle("Java");
		bs.addBook(b2);

		
		
		System.out.println("Row Inserted");
		
		/*//Count Query
		System.out.println("Total Number of Books:" +bs.getBookCount());
		
		//Fetch Table Query
		for(Book book: bs.getAllBooks()) {
			System.out.println(book);
		}
		
		//Fetch Single Row query
		System.out.println("Book with Id 1 " + bs.getBookById(1));
		
		//Fetch  by author using setParameter
		for(Book book1: bs.getAuthorBooks("Shah")){
			System.out.println(book1);
		}
		
		for(Book book2: bs.getBookByTitle("PHP")){
			System.out.println(book2);
		}
		for(Book book3: bs.getBooksInPriceRange(10, 60)){
			System.out.println(book3);
		}*/
	}

}
