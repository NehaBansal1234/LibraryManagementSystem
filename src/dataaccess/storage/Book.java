package dataaccess.storage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Book implements Serializable {
	UUID id;
	String ISBN;
	List<BookCopy> bookCopies;
	String title;
	int maxCheckoutLength;
	List<Author> authors;
	
	public Book(String isbn, String title, int maxCheckoutLength, Author author){
		this.id = UUID.randomUUID();
		this.ISBN = isbn;
		this.title = title;
		this.maxCheckoutLength = maxCheckoutLength;
		authors = new ArrayList<>();
		authors.add(author);
	}
	
	public void addBookCopy(BookCopy copy){
		bookCopies.add(copy);
	}

	public List<BookCopy> getBookCopy(){
		return bookCopies;
	}
	
	public UUID getId(){
		return id;
	}
	
	public BookCopy[] addNumberOfCopies(int n) {
        if (n < 1) {
            return null;
        }
        BookCopy[] arr = new BookCopy[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new BookCopy(this);
        }
        return arr;
    }
	
	

}
