package Assignment2;

public class LybraryMangement {
	
	    int bookId;
	    String title;
	    String author;
	    boolean isIssued;

	    
	    public LybraryMangement(int bookId, String title, String author) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	        this.isIssued = false;
	    }

	    public void issueBook() {
	        if (!isIssued) {
	            isIssued = true;
	            System.out.println(title + " issued.");
	        } else {
	            System.out.println(title + " is already issued.");
	        }
	    }

	    public void returnBook() {
	        if (isIssued) {
	            isIssued = false;
	            System.out.println(title + " returned.");
	        }
	    }
	    public void displayBook() {
	        if (!isIssued) {
	            System.out.println(bookId + " - " + title + " by " + author);
	        }
	    }
	}

	 class TestLibrary {
	    public static void main(String[] args) {
	    	LybraryMangement b1 = new LybraryMangement(101, "Java Basics", "James");
	    	LybraryMangement b2 = new LybraryMangement(102, "Python Guide", "Guido");

	        b1.issueBook();
	        b2.displayBook();
	        b1.returnBook();
	        b1.displayBook();
	    }
	

}
