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
		
		// Define calendar objects:
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		Calendar calendar3 = Calendar.getInstance();
		Calendar calendar4 = Calendar.getInstance();
		
		// Define some books:
		calendar1.set(1990, 0, 1);
		Book bookIt = new Book("It", "Stephen King", calendar1, "Castle Rock Inc");
		
		calendar2.set(2000, 4, 20);
		Book bookHarryPotter = new Book("Harry Potter", "JK Rowling", calendar2, "Magical Books United");
		
		calendar3.set(1950, 5, 2);
		Book bookLordOfTheRings = new Book("Lord of the Rings", "JRR Tolkien", calendar3, "Middle Earth Co.");
		
		calendar4.set(1922, 1, 22);
		Book bookCatInTheHat = new Book("Cat in the Hat", "Dr. Seuss", calendar4, "Green Ham Books");
		
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
