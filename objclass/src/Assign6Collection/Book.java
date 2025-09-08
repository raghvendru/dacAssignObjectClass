package Assign6Collection;

import java.util.Objects;

public class Book {
	int bId;
	String title;
	float price;
	String author;
	
	public Book(int i,String n,float p,String a) {
		this.bId = i;
		this.title = n;
		this.price = p;
		this.author = a;
	}
	
//	public void disBook() {
//		System.out.println("book id is " + bId + " book name is " + title + " price of the book is " + price + " author is " + author);	
//	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bId, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bId == other.bId
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(title, other.title);
	}

}
