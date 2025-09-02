package Assig3Hasa;
import java.util.*;
////Assignment 1: Library and Book Management
//Class Book
//Properties: bookId, title, author, price
//Methods: displayBookDetails()
//Class Library (HAS-A Book)
//Properties: libraryName, address, List<Book> books
//Methods:
//addBook(Book b) → Adds a new book to the library
//removeBook(int bookId) → Removes book by ID
//showAllBooks() → Displays all book details using Book.displayBookDetails(
class Book{
	int bookid;
	String title;
	String author;
	float price;
	public Book(int i,String title,String a,float price) {
		this.bookid = i;
		this.title = title;
		this.author = a;
		this.price = price;
	}
	
	public void displayBookDetails() {
		System.out.println("book id: " + bookid + ", title : "+title + ", author : " + author + ", price: " +price);
	}
}
class Library{
	String libName;
	String address;
	List<Book> books;
	
	
	public Library(String n,String a,List<Book> b) {
		this.libName = n;
		this.address = a;
		this.books = b;
	}
	
	public void addBook(Book b) {
		
			books.add(b);
			System.out.println(b.bookid+"book added");
		
	}
	
	public void removebook(int bookid) {
		boolean flag = false;
		for(int i=0;i<books.size();i++) {
			Book b1 = books.get(i);
			if(b1.bookid ==bookid ) {
				books.remove(b1);
				flag = true;
				System.out.println("book is been removed" + b1.bookid);
				break;

			}
		}
		if(!flag) {
			System.out.println("please enter valid id");
		}
		
	}
	public void showAllBooks() {
	  if(books.isEmpty()) {
		  System.out.println("no books in the library");
	  }else {
		  System.out.println("library name: " + libName + ", address : "+address);
		  for(Book b: books) {
			  b.displayBookDetails();
		  }
	  }
	}
	
}
public class LibraryAndBookMgt {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Book b1 = new Book(101, "Java Programming", "James Gosling", 500);
    Book b2 = new Book(102, "Python Basics", "Guido van Rossum", 400);
    Book b3 = new Book(103, "Effective C++", "Scott Meyers", 600);
  //  Library lib = new Library("City Central Library", "MG Road, Bangalore",new ArrayList<>());
    Library lib = new Library("City Central Library", "MG Road, Bangalore", new ArrayList<>(Arrays.asList(b1, b2, b3)));
    lib.addBook(b1);
    lib.addBook(b2);
    lib.addBook(b3);
    lib.showAllBooks();
    lib.removebook(102);
    lib.showAllBooks();
}}


