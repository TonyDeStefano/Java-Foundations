package com.tdestefano;

import java.util.Calendar;

/**
 * Library Member Class.
 * @author Tony DeStefano
 *
 */
public class Member {

	private String firstName;
	private String lastName;
	private Book book;
	
	/**
	 * Constructor.
	 * @param firstName
	 * @param lastName
	 */
	public Member(String firstName, String lastName) {
		
		this
			.setFirstName(firstName)
			.setLastName(lastName);
	}
	
	/**
	 * Checks out a book, if possible.
	 * @param book
	 */
	public void checkOutBook(Book book) {
		
		// If the member doesn't have a book checked out yet:
		if (this.book == null) {
			
			// If the book is already checked out:
			if (book.isCheckedOut()) {
				System.out.println(this.getFullName() + " failed to check out \"" + book.getTitle() + "\"");
				System.out.printf("Reason: ");
				book.printStatus();
				
			// Otherwise, check it out:
			} else {
				Calendar calendar = Calendar.getInstance();
				book.setCheckedOutAt(calendar);
				book.setCheckedOutBy(this);
				this.setBook(book);
				System.out.println(this.getFullName() + " successfully checked out \"" + book.getTitle() + "\"");
			}
			
		// If the member already has a book checked out:
		} else {
			System.out.println(this.getFullName() + " failed to check out \"" + book.getTitle() + "\"");
			System.out.printf("Reason: ");
			System.out.println(this.getFirstName() + " already has a book checked out.");
		}
		
		System.out.println("");
	}
	
	/**
	 * Returns a book to the library, if one is checked out.
	 */
	public void returnBook() {
		
		// If the member has a book checked out:
		if (this.book != null) {
			this.book
				.setCheckedOutAt(null)
				.setCheckedOutBy(null);
			System.out.println(this.getFullName() + " has successfully returned \"" + this.book.getTitle() + "\"");
			this.setBook(null);
			
		// Member does not have a book a checked out:
		} else {
			System.out.println(this.getFullName() + " doesn't have any books checked out!");
		}
		
		System.out.println("");
	}
	
	/**
	 * Gets the user's full name.
	 * @return String
	 */
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	/**
	 * Gets Member's first name.
	 * @return String firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets Member's first name.
	 * @param firstName
	 * @return this
	 */
	public Member setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	/**
	 * Gets member's last name.
	 * @return String lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets member's last name.
	 * @param lastName
	 * @return this
	 */
	public Member setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	/**
	 * Gets member's book.
	 * @return Book book
	 */
	public Book getBook() {
		return book;
	}
	
	/**
	 * Sets member's book;
	 * @param book
	 * @return this
	 */
	public Member setBook(Book book) {
		this.book = book;
		return this;
	}
}
