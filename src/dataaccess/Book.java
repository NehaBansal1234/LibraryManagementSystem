package dataaccess;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
	int bookId;
	String ISBN;
	List<BookCopy> bookCopies;
	String title;
	int maxCheckoutLength;
	List<Author> authors;
	
	
	

}
