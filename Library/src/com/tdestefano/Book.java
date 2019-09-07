package com.tdestefano;

import java.util.Calendar;

/**
 * Book Class.
 * @author Tony DeStefano
 *
 */
public class Book {

	private static int nextId = 0;
	
	private int id;
	private String title;
	private String author;
	private Calendar publishDate;
	private String publishingCompany;
	private Calendar checkedOutAt;
	private Member checkedOutBy;
	
	/**
	 * Constructor.
	 * @param title
	 * @param author
	 * @param publishDate
	 * @param publishingCompany
	 */
	public Book(String title, String author, Calendar publishDate, String publishingCompany) {
		
		this
			.setId(++nextId)
			.setTitle(title)
			.setAuthor(author)
			.setPublishDate(publishDate)
			.setPublishingCompany(publishingCompany);
	}
	
	/**
	 * Is a book checked out?
	 * @return Boolean
	 */
	public Boolean isCheckedOut() {
		return (this.checkedOutAt != null);
	}
	
	/**
	 * Prints the status of a book.
	 */
	public void printStatus() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("\"" + this.title + "\"");
		
		if (isCheckedOut()) {
			builder.append(" was");
		} else {
			builder.append(" is not");
		}
		
		builder.append(" checked out");
		
		if (isCheckedOut()) {
			builder.append(" by " + this.getCheckedOutBy().getFullName() + " on ");
			builder.append(String.format("%tB %te, %tY", checkedOutAt, checkedOutAt, checkedOutAt));
		}
		
		builder.append(".");
		
		System.out.println(builder.toString());
	}
	
	/**
	 * Gets book's ID.
	 * @return int
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets book's ID.
	 * @param id
	 * @return Book
	 */
	public Book setId(int id) {
		this.id = id;
		return this;
	}
	
	/**
	 * Gets book's title.
	 * @return String
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets book's title.
	 * @param title
	 * @return Book
	 */
	public Book setTitle(String title) {
		this.title = title;
		return this;
	}
	
	/**
	 * Gets book's author.
	 * @return String
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Sets book's author.
	 * @param author
	 * @return Book
	 */
	public Book setAuthor(String author) {
		this.author = author;
		return this;
	}
	
	/**
	 * Gets book's publish date.
	 * @return Calendar
	 */
	public Calendar getPublishDate() {
		return publishDate;
	}
	
	/**
	 * Sets book's publish date.
	 * @param publishDate
	 * @return Book
	 */
	public Book setPublishDate(Calendar publishDate) {
		this.publishDate = publishDate;
		return this;
	}
	
	/**
	 * Gets book's publishing company.
	 * @return String
	 */
	public String getPublishingCompany() {
		return publishingCompany;
	}
	
	/**
	 * Sets book's publishing company.
	 * @param publishingCompany
	 * @return Book
	 */
	public Book setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
		return this;
	}
	
	/**
	 * Gets book's checkout date.
	 * @return Calendar
	 */
	public Calendar getCheckedOutAt() {
		return checkedOutAt;
	}
	
	/** 
	 * Sets book's checkout date.
	 * @param checkedOutAt
	 * @return Book
	 */
	public Book setCheckedOutAt(Calendar checkedOutAt) {
		this.checkedOutAt = checkedOutAt;
		return this;
	}
	
	/**
	 * Gets book's checkout member.
	 * @return Member
	 */
	public Member getCheckedOutBy() {
		return checkedOutBy;
	}
	
	/** 
	 * Sets book's checkout member.
	 * @param checkedOutBy
	 * @return Book
	 */
	public Book setCheckedOutBy(Member checkedOutBy) {
		this.checkedOutBy = checkedOutBy;
		return this;
	}
}
