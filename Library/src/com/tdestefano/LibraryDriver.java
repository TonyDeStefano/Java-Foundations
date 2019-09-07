package com.tdestefano;

import java.util.Calendar;

/**
 * Let's all go to the Library!
 * @author Tony DeStefano
 *
 */
public class LibraryDriver {

	/**
	 * Starting point.
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Define a calendar object:
		Calendar calendar = Calendar.getInstance();
		
		// Define some books:
		calendar.set(1990, 0, 1);
		Book bookIt = new Book("It", "Stephen King", calendar, "Castle Rock Inc");
		
		calendar.set(2000, 4, 20);
		Book bookHarryPotter = new Book("Harry Potter", "JK Rowling", calendar, "Magical Books United");
		
		calendar.set(1950, 5, 2);
		Book bookLordOfTheRings = new Book("Lord of the Rings", "JRR Tolkien", calendar, "Middle Earth Co.");
		
		calendar.set(1922, 1, 22);
		Book bookCatInTheHat = new Book("Cat in the Hat", "Dr. Seuss", calendar, "Green Ham Books");
		
		// Define some members:
		Member john = new Member("John", "Lennon");
		Member paul = new Member("Paul", "McCartney");
		Member george = new Member("George", "Harrison");
		Member ringo = new Member("Ringo", "Starr");
		Member yoko = new Member("Yoko", "Ono");
		
		// Checkout some books:
		john.checkOutBook(bookIt);
		paul.checkOutBook(bookHarryPotter);
		george.checkOutBook(bookLordOfTheRings);
		ringo.checkOutBook(bookCatInTheHat);
		
		// Try to check out a book that is already checked out:
		yoko.checkOutBook(bookIt);
		
		// Return a book:
		paul.returnBook();
		
		// Try to check out a book when you already have a book checked out:
		john.checkOutBook(bookHarryPotter);
	}

}
