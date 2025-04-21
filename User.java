package Library;

import java.util.Scanner;

public class User {
public static void main(String[] args) {
	Library l = new Library();
	Scanner sc= new Scanner(System.in);
	boolean ok=true;
	while(ok) {
	System.out.println("-----------------------------------------------------------------");
	System.out.println("                Welcome to NYPD                                  ");
	System.out.println("-----------------------------------------------------------------");
	System.out.println("1.Add Book: \n2.Display Books: \n3.Search Book With Id: \n4.Search Book With Aurthor: "
			+ "\n5.Update Book Cost: \n6.Remove Book With id : \n7. Exit" );
	int ch= sc.nextInt();
	switch(ch) {
	case 1:{
		System.out.println("enter book title :");
		String t=sc.next();
		System.out.println("enter book aurthor :");
		String a= sc.next();
		System.out.println("enter cost :");
		int c=sc.nextInt();
		System.out.println("enter book id : ");
		int id= sc.nextInt();
		System.out.println("pages number : ");
		int p=sc.nextInt();
		l.addBook(new Book(t,a,id,c,p));
		System.out.println("Book added ");
		break;
	}
	case 2:{
		l.displayBooks();
		break;
	}
	case 3:{
		System.out.println("entrer book id :");
		int i= sc.nextInt();
		l.searchBookId(i);
		break;
	}
	case 4:{
		System.out.println("enter aurthor name ");
		String name=sc.next();
		l.searchBookAurthor(name);
		break;
	}

	case 5:{
		System.out.println("enter book id to be updated :");
		int i= sc.nextInt();
		System.out.println("enter the updated cost :");
		int cost=sc.nextInt();
		l.updateCost(i, cost);
		break;
	}
	case 6:{
		System.out.println("enter the book to be removed :");
		int i= sc.nextInt();
		l.removeBook(i);
		break;
	}

	case 7:{
		System.out.println("Thank you ..");
		ok=false;
		break;
	}
	default: {
		break;
	}
	}
}
}
}
