package assignment2;

import java.util.GregorianCalendar;

/**
 * Peter Tran 
 * Nick Aufdemorte 
 * January 23, 2013
 * 
 * Class representation of a generic library (a collection of library books).
 */

public class LibraryBookGeneric <Type> extends Book{

	private Type Holder;
	
	private GregorianCalendar DueDate;
	
	private boolean isCheckedOut = false;
	
	/**
	 * Constructor to create a new library book.
	 * 
	 * @param _isbn
	 * @param _author
	 * @param _title
	 */
	public LibraryBookGeneric(long _isbn, String _author, String _title) {
		super(_isbn, _author, _title);
	
	}
	
	/**
	 * Method to get the holder of a particular book.
	 * @return the Holder 
	 */
	public Type getHolder()
	{
		return this.Holder;
	}
	
	/**
	 * Method to set the holder of a book.
	 */
	public void setHolder(Type holder)
	{
	  	this.Holder = holder;
	}
	
	/**
	 * Method to see if a book has been checked out.
	 * @return true if the book is checked out. False if it has not.
	 */
	public boolean isCheckedOut()
	{
		if(this.isCheckedOut)
			return true;
		return false;
	}
	
	/**
	 * Method to set a due date.
	 */
	public void setDueDate(int year, int month, int day)
	{
		this.DueDate = new GregorianCalendar(year, month, day);
	}
	
	/**
	 * Method to get the due date for a book.
	 * @return the due date 
	 */
	public GregorianCalendar getDueDate()
	{
		return this.DueDate;
	}
	
	/**
	 * Method to check in a book. 
	 */
	public void CheckIn()
	{
		
		this.Holder = null;
		this.DueDate = null;
		
		return;
	}
	
	/**
	 * Method to check out a book. Sets the person as the holder of the library book, also puts the 
	 * date back in our system for .
	 * 
	 * @param Holder - info about the person that checked out the book
	 * @param year - year book is due back.
	 * @param month - month book is due back.
	 * @param day - day which the book is due back.
	 */
	
	public void CheckOut(Type Holder, int year, int month,int day)
	{	
		this.Holder = Holder;
		this.DueDate = new GregorianCalendar(year, month, day);
		return;
	}
	

}
