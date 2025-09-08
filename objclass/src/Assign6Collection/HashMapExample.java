//
//HashMap (with Object)
//Problem Statement:
//Design a Library Management System using a HashMap<Integer, Book> where the key is the Book ID and the value is a Book object (with properties like title, author, price).
//Your task is to:
//1.	Add multiple books using put().
//2.	Retrieve a book by its ID using get().
//3.	Check if a given Book ID exists using containsKey().
//4.	Check if a particular Book object exists using containsValue().
//5.	Display the total number of books using size().
//6.	Iterate through all entries using entrySet(), keySet(), and values().
//7.	Update book details (like price) using replace().
//8.	Remove a book by ID using remove().
//9.	Clear all books using clear().
//10.	Verify if the collection is empty using isEmpty().
package Assign6Collection;
import java.util.*;
public class HashMapExample {
public static void main(String[] args) {
	Bookmgt b = new Bookmgt();
	HashMap<Integer,Book> hm = b.createBook();
	
	b.getBook(hm);
	b.containsKey(hm);
	b.containsValue(hm);
	b.sizeOfBook(hm);
	
	System.out.println("iterating through keyset()");
	for(Integer ele: hm.keySet()) {
		System.out.println(ele);
	}
	System.out.println("iterating through values()");
	for(Book ele: hm.values()) {
		System.out.println(ele);
	}
	
	b.updateBook(hm);
	b.deleteBook(hm);
	b.clearBook(hm);
	b.isEmpty(hm);
}
}
