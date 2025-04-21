package Library;

import java.util.ArrayList;
import java.util.Iterator;
public class Library {
	private Book b;
	private ArrayList<Book> book = new ArrayList<Book>();
	
	public void addBook(Book b) {
		book.add(b);
		System.out.println("Book added successfully .....");
	}
	public void displayBooks() 
	{
		boolean t= false;
		if(book.isEmpty()) 
		{
			System.out.println("there no book in Library...");
		}
		else 
			{
			for(Book b:book)
			{
				b.display();
				
			}
		}
	}
	public void searchBookId(int id) 
	{
		boolean bookfound=false;
		if(book.isEmpty()) 
		{
			System.out.println("there no book in Library...");
		}
		else {
			for (Book b:book) {
			if(b.getBookId()==id) {
				System.out.println("the book name wiht the id "+b.getBookId()+" is "+b.getTitle());
				bookfound=true;
			}
			}
		}
		if(!bookfound) {
			System.out.println("There no book with id"+id);
		}
	}
	public void searchBookAurthor(String aurthor) 
	{
		boolean bookfound=false;
		if(book.isEmpty()) 
		{
			System.out.println("there no book in Library...");
		}
		else {
			for (Book b:book) {
			if(b.getAuthor().equalsIgnoreCase(aurthor)) {
				System.out.println("the book name wiht the id "+b.getBookId()+" is "+b.getTitle());
				bookfound=true;
			}
			}
		}
		if(!bookfound) {
			System.out.println("There no book with id"+aurthor);
		}
	}
	public void updateCost(int id,int newcost) {
		boolean costup=false;
		if(book.isEmpty()) 
		{
			System.out.println("there no book in Library...");
		} 
		else {
			for (Book b:book) {
				if(b.getBookId()==id) {
					b.setCost(999);
					System.out.println("cost uppdated");
					costup=true;
				}
			}
		}
		if(!costup) {
			System.out.println("No book to update...");
		}
	}
	public void removeBook(int id) {
		boolean rm=false;
		if(book.isEmpty()) {
			System.out.println("no book found to remove ...");
		}
		else {
			Iterator<Book> i = book.iterator();
			while(i.hasNext()) {
				Book b=i.next();
				if(b.getBookId()==id) {
					i.remove();
					System.out.println("book removed ");
					rm=true;
				}
			}
		}
		if(!rm) {
			System.out.println("no book removed ....");
		}
	}
	
}

