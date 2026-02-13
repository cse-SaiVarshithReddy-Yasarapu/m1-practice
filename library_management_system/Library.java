package library_management_system;

import java.util.*;

public class Library {
	ArrayList<Book> listOfBooks;
	HashMap<Integer,Members> members;
	
	public Library() {
		listOfBooks=new ArrayList<>();
		members=new HashMap<>();
	}	
	
	public void addBook(Book book) {
		this.listOfBooks.add(book);
	}
	
	// Issue book
	
	public void issueBook(Members member,Book book) {
	if(book.isIssued()==false && members.containsValue(member) && listOfBooks.contains(book)) {
		book.setIsIssued(true);
		member.setIssuedBook(book);
	}
	else {
		System.out.println("Book is already issued");
	}
}
	
	// Register member
	
	public void registerMember(Members member) {
		members.put(member.getMemberId(), member);
	}
	
	
	
	
}
