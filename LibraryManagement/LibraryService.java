package LibraryManagement;
import java.util.*;

public class LibraryService {
	private HashSet<Book> booksList=new HashSet<>();
	public void addBook(Book b) {
		if(b!=null && !(booksList.contains(b))){
			booksList.add(b);
		}
		else {
			System.out.println("Book is already present");
		}
	}
	
	public void searchByAuthor(String authorName) {
		if(authorName==null) {
			System.out.println("Name cannot be null");
		}
		else {
			for(Book b : booksList) {
				if(b.getAuthor().equalsIgnoreCase(authorName)) {
					System.out.println(b.getTitle());
				}
			}
		}
	}
	
	public void getCostliestBook() {
		int maxCost=0;
		Book b1=null;
		for(Book b :booksList) {
			if(b.getPrice()>maxCost) {
				maxCost=b.getPrice();
				b1=b;
			}
		}
		System.out.println("Costliest Book is "+b1.getTitle());
		
	}

}
