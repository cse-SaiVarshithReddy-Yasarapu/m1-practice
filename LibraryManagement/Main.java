package LibraryManagement;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book("ISBN101", "Java Fundamentals", "James Gosling", 550);
		Book b2 = new Book("ISBN102", "Effective Java", "Joshua Bloch", 750);
		Book b3 = new Book("ISBN103", "Clean Code", "Robert Martin", 650);
		Book b4 = new Book("ISBN104", "Design Patterns", "Erich Gamma", 800);
		Book b5 = new Book("ISBN105", "Spring Boot Guide", "Craig Walls", 600);
		Book b6 = new Book("ISBN109", "Effective Java 2nd Edition", "Joshua Bloch", 9000); 
		
		LibraryService ls=new LibraryService();
		ls.addBook(b1);
		ls.addBook(b2);
		ls.addBook(b3);
		ls.addBook(b4);
		ls.addBook(b5);
		ls.addBook(b6);
		
		ls.getCostliestBook();
		ls.searchByAuthor("Robert martin");
		
		
		
	}

}
