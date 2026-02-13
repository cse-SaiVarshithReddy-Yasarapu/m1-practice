package library_management_system;
import java.util.*;
public class Members {
	private int memberId;
	private String name;
	private ArrayList<Book> issuedBooks=new ArrayList<>();

	//Constructor
	
	public Members(int memberId,String name){
		this.memberId=memberId;
		this.name=name;
	}
	
	//getters 
	public int getMemberId() {
		return memberId;
	}
	public String getName() {
		return name;
	}
	public ArrayList<Book> getBooksList() {
		return issuedBooks;
	}
	
	//Setter
	
	public void setIssuedBook(Book book) {
		this.issuedBooks.add(book);
	}
//	
//	public void returnBook(Book book) {
//		if(book.isIssued()==true) {
//			book.setIsIssued(false);
//			issuedBooks.remove(book);
//		}
//		else {
//			System.out.println("Book is invalid");
//		}
//	}
	
	public void displayIssuedBooks() {
		for(Book book : issuedBooks) {
			System.out.println(book);
		}
	}
}
