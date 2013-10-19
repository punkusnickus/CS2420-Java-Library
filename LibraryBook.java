package assignment2;

import java.util.GregorianCalendar;

/**
 * Peter Tran 
 * Nick Aufdemorte 
 * January 23, 2012
 * 
 * 
 */
public class LibraryBook extends Book{

	private String Holder;
	
	private GregorianCalendar DueDate;
	
	private boolean isCheckedOut = false;
	
	
	public LibraryBook(long _isbn, String _author, String _title) {
		super(_isbn, _author, _title);
		
	}
	
	public String getHolder()
	{
		return this.Holder;
	}
	
	public void setHolder(String holder)
	{
	  	this.Holder = holder;
	}
	
	public boolean isCheckedOut()
	{
		if(this.isCheckedOut)
			return true;
		return false;
	}
	
	public void setDueDate(int year, int month, int day)
	{
		this.DueDate = new GregorianCalendar(year, month, day);
	}
	
	public GregorianCalendar getDueDate()
	{
		return this.DueDate;
	}
	
	
	public void CheckIn()
	{
//		if (this.isCheckedOut = true)
//		{
		this.Holder = null;
		this.DueDate = null;
//		}
		return;
	}
	
	public void CheckOut(String Holder, int year, int month,int day)
	{	
		this.Holder = Holder;
		this.DueDate = new GregorianCalendar(year, month, day);
		return;
	}
	

}
