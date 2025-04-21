package Library;

import java.io.Serializable;

public class Book implements Serializable{
	private String title;
	private String author;
	private int cost;
	private int noofPages;
	private int bookId;
	 public void Book() {}
	public Book(String title, String author, int bookid,int cost,int noofId) {
		super();
		this.title = title;
		this.author = author;
		this.cost = cost;
		this.noofPages = noofPages;
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getNoofPages() {
		return noofPages;
	}
	public void setNoofPages(int noofPages) {
		this.noofPages = noofPages;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	 public void display() {
		 System.out.println("Book Title :"+getTitle());
		 System.out.println("Book Id :"+getBookId());
		 System.out.println("Book Aurthor :"+getAuthor());
		 System.out.println("Book Cost :"+getCost());
		 System.out.println("NO of pages :"+getNoofPages());
		 
		 
	 }
	@Override
	public String toString() {
		return "Booktitle=" + title + ",/n author=" + author + ",/n cost=" + cost + ",/n noofPages=" + noofPages
				+ ",/n bookId=" + bookId;
	}
}
