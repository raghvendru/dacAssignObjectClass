package Assign6Collection;

import java.util.*;

public class Bookmgt {
	
   Scanner sc = new Scanner(System.in);
   
   
	public HashMap<Integer, Book> createBook() {
		Book b1 = new Book(1,"gosling",2000,"java");
		
		Book b2 = new Book(2,"raj",3000,"spring boot");
		Book b3 = new Book(3,"kiran",5000,"mysql");
		Book b4 = new Book(4,"ram",2000,"reactJs");
		
		HashMap<Integer,Book> hm = new HashMap<>();
		hm.put(b1.bId,b1);
		hm.put(b2.bId,b2);
		hm.put(b3.bId,b3);
		hm.put(b4.bId,b4);
		
		for(Map.Entry<Integer,Book> hmm:hm.entrySet()) {
			System.out.println(hmm.getKey());
			//hmm.getValue().disBook();
			System.out.println(hmm.getValue());
		}
		return hm;
		
	}

	public void getBook(HashMap<Integer,Book> hm) {
		System.out.println("enter id which u wanna get details");
		int n = sc.nextInt();
		//hm.get(n).disBook();
		hm.get(n);
	}

	public void containsKey(HashMap<Integer, Book> hm) {
		System.out.println("enter id which u wanna check whether its present or not ");
		int n = sc.nextInt();
			if(hm.containsKey(n)) {
				System.out.println("book id " + n + " is Present");	
		}else {
			System.out.println("sorry the id "+n + " is not found");
		}
		
	}

	public void containsValue(HashMap<Integer, Book> hm) {
		Book searchBook = new Book(1,"gosling",2000,"java");
	    if(hm.containsValue(searchBook)) {
	        System.out.println("Book exists: " + searchBook);
	    } else {
	        System.out.println("Book does not exist");
	    }
	}

	
	public void sizeOfBook(HashMap<Integer, Book> hm) {
		System.out.println("size is " + hm.size());
		
	}

	
	public void updateBook(HashMap<Integer, Book> hm) {
		System.out.println("enetr id u wanna update");
		int n = sc.nextInt();
		
		Book b = hm.get(n);
		b.price  = 2000;
		Book b1 = new Book(b.bId,b.title,b.price,b.author);
		hm.replace(b.bId,b1);
		System.out.println("after updating ........");
		for(Map.Entry<Integer,Book> hmm:hm.entrySet()) {
			System.out.println(hmm.getKey());
			//hmm.getValue().disBook();
			System.out.println(hmm.getValue());
		}
		
		
		
	}

	public void deleteBook(HashMap<Integer, Book> hm) {
		System.out.println("enter id to delete");
		int n = sc.nextInt();
		hm.remove(n);
		System.out.println("after deleting ........");
		for(Map.Entry<Integer,Book> hmm:hm.entrySet()) {
			System.out.println(hmm.getKey());
			//hmm.getValue().disBook();
			System.out.println(hmm.getValue());
		}
	}

	public void clearBook(HashMap<Integer, Book> hm) {
		hm.clear();
			System.out.println("books are been cleared");
		}

	public void isEmpty(HashMap<Integer, Book> hm) {
	   if(hm.isEmpty()) {
		   System.out.println("yes books are empty!!!!!!");
	   }else {
		   System.out.println("books are still there");
	   }
		
	}
	
	  
	
	

}
